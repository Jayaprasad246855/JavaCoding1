package javastages.lambdaexpressions;

public class LambdaExample {
	public static void main(String[] args) {

		FIWithTwoParameters fiwithtwoparameter = new FIWithTwoParameters() // Anonymous class
		{

			@Override
			public int display(int a, int b) {
				System.out.println("value of a :" + a + " " + "value Of b :" + b);
				return a + b;
			}
		};
		int str = fiwithtwoparameter.display(22, 34);
		System.out.println(str);

		FIWithTwoParameters fiwithtwoparameter1 = (int a, int b) -> // Lambda Expressions
		{
			System.out.println("value of a :" + a + " " + "value Of b :" + b);
			return a * b;
		};
		int str1 = fiwithtwoparameter1.display(123, 345);
		System.out.println(str1);

		FIWithoutParameters fiwithnoparameter = () -> System.out
				.println("In side the lambda expersion with on parameters");
		fiwithnoparameter.noparameters();

		FIParameterAsAnotherClass anotherClass = (FIWithTwoParameters a) -> {
			int x = a.display(1234, 123);
			System.out.println(x);
			System.out.println("In side the Anotherclass as a parameter in FIParameterAsAnotherClass");
			return x;
			
		};
		anotherClass.diplay1(fiwithtwoparameter1);
	}

}
