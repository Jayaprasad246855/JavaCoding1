package variables;

public class FinalStaticInstance {
    int instance=1;
    static int staticVariable=2;
    final int finalVariable=3;


     void printInstanceMeth()
     {
         System.out.println("in instance method");
     }
    static void printStaticMeth()
    {
        System.out.println("in static method");
    }
    public static void main(String[] args) {
        FinalStaticInstance obj=new FinalStaticInstance();

        obj.printInstanceMeth();
        FinalStaticInstance.printStaticMeth();
    }
}
