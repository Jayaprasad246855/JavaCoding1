package java8Features.functionalInterface;

public interface FIWithStatic {
    static String withStatic(FIWith2Primitives a)
    {
        System.out.println("in static FI");
        return "returning from static FI";
    }
}
