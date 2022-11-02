package ifCondition;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
//        int a=1000;
//        int b=100;
//        int c=77;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age of person :");
        int person=sc.nextInt();
        if(person>18) {
            System.out.println("he is voter");

        }
        else if(person>=17 && person<18)
        {
            System.out.println("eligible to apply voter card");
        }
        else {
            System.out.println("he is minor");
        }
    }


}
