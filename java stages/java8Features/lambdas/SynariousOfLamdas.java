package java8Features.lambdas;

import java8Features.functionalInterface.*;

public class SynariousOfLamdas {
    public static void main(String[] args) {

        FIWith2Primitives fiWith2Primitives2=(int a,int b)->{
            System.out.println(a+b);
            return a+b;
        };

        FIParameterAsAnotherClass fiParameterAsAnotherClass=(FIWith2Primitives a)->{
            System.out.println("calling form FIParameterAsAnotherClass" );
            return ""+a.disp(1,100);
        };
        fiParameterAsAnotherClass.classReturnType(fiWith2Primitives2);

    }
}
