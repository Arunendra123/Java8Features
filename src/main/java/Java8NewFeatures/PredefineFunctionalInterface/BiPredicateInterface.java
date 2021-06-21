package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.function.BiPredicate;

// BiPredefine interface
/*1. Predicate: Where ever condition checking is required we can use Predicate interface
  2. return type of predicate is always boolean
  3. BiPredicate can take two input as a parameter
     BiPredicate contain only one method : test(Parameter p1,Parameter p2);
*/


public class BiPredicateInterface {
    public static void main(String args[]) {
    	
    	//Example: 1
    	BiPredicate<Integer,Integer> pf=(a,b)->a+b==24;
    	System.out.println(pf.test(9,9));
    	System.out.println(pf.test(10,12));
    	
    	//Example: 2
    	BiPredicate<Integer,Integer> pf1=(a,b)->a-b==54;
    	System.out.println(pf1.test(65,8));
    	System.out.println(pf1.test(10,0));
    	
    	//Example: 3
    	//Student s=new Student("Arunendra",20000);
    	BiPredicate<Student,Student> ps=(s1,s2)->(s1.name=="Arunendra"&&s1.rollNo==20000)&&(s2.name=="Arunendra"&&s2.rollNo==20000);
    	System.out.println(ps.test(new Student("Arunendra",20000),new Student("Dheeru",21000)));
    	
    	BiPredicate<String,String> p=(s1,s2)->s1.length()==s2.length();
    	System.out.println(p.test("Arunendra","Prakash"));
    }
}

