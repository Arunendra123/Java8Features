package Java8NewFeatures.PredefineFunctionalInterface;

import java.util.function.Predicate;

// Predefine interface
/*1. Predicate: Where ever condition checking is required we can use Predicate interface
  2. return type of predicate is always boolean
  3. predicate can take only one input as a parameter
     Predicate contain only one method : test(Parameter p);
*/

class Student{
	
	public String name;
	public int rollNo;
	Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
    
}

public class PredicateInterface {
    public static void main(String args[]) {
    	
    	//Example: 1
    	Predicate<Integer> pf=I->I%2==0;
    	System.out.println(pf.test(9));
    	System.out.println(pf.test(10));
    	
    	//Example: 2
    	Predicate<Integer> pf1=I->I==0;
    	System.out.println(pf1.test(0));
    	System.out.println(pf1.test(10));
    	
    	//Example: 3
    	//Student s=new Student("Arunendra",20000);
    	Predicate<Student> ps=s->s.name=="Arunendra"&&s.rollNo==20000;
    	System.out.println(ps.test(new Student("Arunendra",20000)));
    	
    	Predicate<String> p=s->s.length()==5;
    	System.out.println(p.test("Arunendra"));
    }
}
