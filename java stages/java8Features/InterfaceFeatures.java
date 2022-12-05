package java8Features;

public interface InterfaceFeatures {

    void print();
    default void printDefault(){
        System.out.println("in default method in Interface FEatures");
    }
    static void printStatic(){
        System.out.println("in static meth");
    }
}
