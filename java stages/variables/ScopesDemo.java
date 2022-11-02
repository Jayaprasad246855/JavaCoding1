package variables;

public class ScopesDemo {
    int i=10; //instance variable
    static int m=10;  //static variable
    public ScopesDemo()
    {
        System.out.println("constructor executed");
    }
    public ScopesDemo(int i)
    {
        this.i=i;
        System.out.println("parameterised constructor executed");
    }
    public int diff(int k)
    {
        int j=11;
        System.out.println("---- in diff meth() ------");
        for(int h=0;h<3;h++)
        {
            System.out.println("printing h val for "+h+" time");
        }
        return j+k;
    }

    public static void main(String[] args) {
        ScopesDemo sd1=new ScopesDemo();    // classname objectname=new constructor();

        ScopesDemo sd2=new ScopesDemo(5);
        System.out.println("-------sd1---------");
        sd1.diff(0);
        System.out.println("-------sd2---------");
        System.out.println("sum of k+j="+sd2.diff(100));


        sd1.i=100;
        sd2.i=1000;
        System.out.println(sd1.i +"----"+sd2.i+"-----"+ScopesDemo.m);
    }
}
