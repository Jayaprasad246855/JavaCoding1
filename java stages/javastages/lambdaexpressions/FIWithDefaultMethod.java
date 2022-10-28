package javastages.lambdaexpressions;

public interface FIWithDefaultMethod {
	default void withDefaultMethod() {
		System.out.println("IN Default method");
	}
}
