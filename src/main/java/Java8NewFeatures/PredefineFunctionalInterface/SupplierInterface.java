package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

//Supplier interface don't take any input as parameter but return a value.

public class SupplierInterface {
	public static void main(String args[]) {
   	 //Example 1
   	 Supplier<Date> s=()->new Date();
   	        System.out.println(s.get());
   	        
   	  //Example 2      
   	  Supplier<String> s1=()->{
   		  String opt="";
   		  for(int i=0;i<6;i++) {
   			  opt=opt+(int)Math.random()*10;
   		  }
   		  return opt;
   	  }; 
     	System.out.println(s1.get());
     }
}
