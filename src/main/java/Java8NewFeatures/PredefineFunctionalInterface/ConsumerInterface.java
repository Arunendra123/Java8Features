package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.function.Consumer;

// Consumer: It just consume the value don't return any value.
// It contain a method accept(Parameter P)

public class ConsumerInterface {
     public static void main(String args[]) {
    	 //Example 1
    	 Consumer<String> c=p->System.out.println(p);
    	 c.accept("Arunendra");
    	 
    	 Consumer<String> c1=p->System.out.println(p+" You are awesome!!");
    	 Consumer<String> c2=p->System.out.println(p+" I am fine!!");
    	 Consumer<String> c3=p->System.out.println(p+" Okay!! Take it easy!!");
    	 c1.andThen(c2).andThen(c3).accept("Arunendra");
     }
}
