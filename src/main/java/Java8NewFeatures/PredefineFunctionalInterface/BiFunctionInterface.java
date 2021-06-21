package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.function.BiFunction;

// BiPredefine interface
// BiFunction interface: it takes two input and return type is a value
// Function<Parameter_input, Parameter_input ,Parameter_output>
// It contain a method : apply(Parameter p1,Parameter p2,Parameter p3)

public class BiFunctionInterface {
	public static void main(String args[]) {
		
		//Example 1:
		BiFunction<Integer,Integer,Integer> p=(a,b)->a*b;
		System.out.println(p.apply(10,20));
		
		//Example 2: function Chaining
		 BiFunction<String,Integer,Student> p_1=(a,b)->new Student(a,b);
		 System.out.print(p_1.apply("Arunendra", 25));
	}
}
