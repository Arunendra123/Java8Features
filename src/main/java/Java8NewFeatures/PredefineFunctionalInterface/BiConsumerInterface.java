package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.function.BiConsumer;

// BiConsumer: It just consume the value but don't return any value.
// It contain a method accept(Parameter P,Parameter P)

public class BiConsumerInterface {
     public static void main(String args[]) {
    	 //Example 1
    	 BiConsumer<String,String> c=(a,b)->System.out.println(a+""+b);
    	 c.accept("Arunendra","Praksh");
    	 
    	 BiConsumer<String,String> c1=(a,b)->System.out.println(a+" You are awesome!!"+b);
    	 BiConsumer<String,String> c2=(a,b)->System.out.println(a+" I am fine!!"+b);
    	 BiConsumer<String,String> c3=(a,b)->System.out.println(a+" Okay!! Take it easy!!"+b);
    	 c1.andThen(c2).andThen(c3).accept("Arunendra","Dubey");
     }
}
