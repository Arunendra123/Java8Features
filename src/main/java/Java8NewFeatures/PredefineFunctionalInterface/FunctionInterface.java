package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.function.Function;

// Predefine interface
// Function interface: it takes only one input and return type is a value
// Function<Parameter_input, Parameter_output>
// It contain a method : apply(Parameter p)

public class FunctionInterface {
	public static void main(String args[]) {
		
		//Example 1:
		Function<Integer,Integer> p=i->i*i;
		System.out.println(p.apply(10));
		
		
		//Example 2: function Chaining
		Function<Integer,Integer> p1=i->i*i;
		Function<Integer,Integer> p2=i->i*i*i;
		System.out.println(p1.andThen(p2).apply(3));
		System.out.println(p1.compose(p2).apply(3));
	}
}
