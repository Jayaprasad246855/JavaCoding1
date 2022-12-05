package arrays;

import java.util.Random;

public class MultiDimenesionArray {
    public static void main(String[] args) {
    	int [][]arr=new int[4][3];
//      inst [][]arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Random r=new Random();
        int n= 5;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
            	arr[i][j]=r.nextInt(100)+1;
                System.out.println("at index "+i+" and "+j+" = "+arr[i][j]);
            }
        }
    }
}
