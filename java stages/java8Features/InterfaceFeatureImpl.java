package java8Features;

public class InterfaceFeatureImpl implements InterfaceFeatures,InterfaceFeatures2{


    @Override
    public void print() {
        System.out.println("print meth");
    }

    @Override
    public void printDefault() {
        System.out.println("in class");
    }

    public static void main(String[] args) {
        InterfaceFeatures i1=new InterfaceFeatureImpl();
        InterfaceFeatures.printStatic();
        i1.printDefault();
        i1.print();
        
    }
}
