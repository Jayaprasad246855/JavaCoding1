package smallStuff;

public class Recursion {
    public static void main(String[] args) {
        int value=0;
        for(int i=0;i<5;i++) {

          value = addItSelf(10, 100,value,true);
            System.out.println("in main value="+value);
        }

    }
    public static Integer addItSelf(int i,int j,int k,boolean d)
    {
        if(d) {
            d=false;
            k=i+j+k;
            System.out.println(k);
            return addItSelf(10, 100,k, d);
        }
        return k;
    }
}
