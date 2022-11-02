package polymophism;

public class Demo extends Test{
    public String overRiding(int i, String j, long k)
    {
        System.out.println("over rided");

        return null;
    }
    public String overLoading(int i, long k,String j)
    {
        System.out.println("overLoading in Demo");
        return null;
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.overRiding(1,"OverRiding",2l);
        d.overLoading(1,2l,"OverLoading");
    }
}

class Test{
    public Object overRiding(int i, String j, long k)
    {
        System.out.println(i+j+k);
        return null;
    }

    public Object overLoading(int i, String j, long k)
    {
        System.out.println("overloading in test");
        return null;
    }
}
