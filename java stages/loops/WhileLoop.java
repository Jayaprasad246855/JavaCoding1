package loops;

import java.util.Iterator;
import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
       int []arr=new int[10];  //{1,2,3,4,5}{1,2,3,4,5}
        Random r=new Random();
       for(int i=0;i< arr.length;i++)
       {
          arr[i]=r.nextInt(100)+1;
           System.out.println("at index "+i+" = "+arr[i]);
       }
       for(int j=0;j< arr.length;j++)
       {
           if(arr[j]%2==0 && arr[j]%10!=0)
           {
               System.out.println("this is even number executing continue statement");
               continue;
           }
           else if(arr[j]%10==0)
           {
               System.out.println("this is ending with 0 number executing break statement");
               break;
           }else
           {
               System.out.println("it is an odd number");
           }
       }

    }
}
