package demo;

public class MethodCallStack {
    public void run1()
    {
        System.out.println("in run1()");
        run2();
    }
    public void run2()
    {
        System.out.println("in run2()");
        run3();
    }
    public void run3()
    {
        System.out.println("in run3()");
        try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
        	System.out.println("Athametic Exception");
        	e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MethodCallStack m=new MethodCallStack();
        m.run1();
    }
}
