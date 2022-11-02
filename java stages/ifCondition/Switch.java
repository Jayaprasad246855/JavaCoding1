package ifCondition;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Welcome customer this your menu\n" +
                "1.choclate\n" +
                "2.venila\n" +
                "3.strawberry\n" +
                "4.mango\n" +
                "5.butterscotch\n" +
                "choose the number given beside your order");
        Scanner sc=new Scanner(System.in);
        boolean choice =true;
        while(choice) {
            System.out.println("enter your choice");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("ordered choclate");
                    break;
                case 2:
                    System.out.println("ordered venilla");
                    break;
                case 3:
                    System.out.println("ordered strawberry");
                    break;
                case 4:
                    System.out.println("oredered mango");
                    break;
                case 5:
                    System.out.println("oredered butterscotch");
                    break;
                default:
                    System.out.println("enter valid choice");
            }
            Scanner sc1=new Scanner(System.in);

            System.out.println("do you want to order again");
            int a=sc1.nextInt();
            if(a==1)
            {
                choice=true;
            }else
            {
                choice=false;
                System.out.println("menu submitted back to barrer");
            }
        }
    }
}
