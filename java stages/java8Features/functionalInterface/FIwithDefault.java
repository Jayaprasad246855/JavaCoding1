package java8Features.functionalInterface;

public interface FIwithDefault {
    default String withDefault(FIWith2Primitives a)
    {
        System.out.println("in default FI");
        return "returning from default FI";
    }
}
