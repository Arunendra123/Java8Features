package Java8NewFeaturesLambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//Example 1
class MyComparator implements Comparator<Integer>{
	public int compare(Integer I1,Integer I2) {
		/*
		 * if(I1<I2) { return -1; }else if(I1>I2) { return 1; }else { return 0; }
		 */
		return I1<I2?-1:I1>I2?1:0;
	}
}


//Example 2
class Student{
	String name;
	int rollNo;
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
}

public class LambdaWithCollection {
   public static void main(String args[]) {
   //Example 1	   
	   //Without Lambda
	   ArrayList<Integer> col=new ArrayList<Integer>();
	   col.add(3);
	   col.add(8);
	   col.add(3);
	   col.add(9);
	   col.add(4);
	   col.add(2);
	   Collections.sort(col,new MyComparator());
	   for(Integer I: col) {
		   System.out.print(I+",");
	   }
	   
	   
	   System.out.print("\n");
	   //With Lambda
	   ArrayList<Integer> col_1=new ArrayList<Integer>();
	   col_1.add(3);
	   col_1.add(8);
	   col_1.add(3);
	   col_1.add(9);
	   col_1.add(4);
	   col_1.add(2);
		/*
		 * Collections.sort(col_1,(I1,I2)->{ return I1<I2?-1:I1>I2?1:0; });
		 */
	   Collections.sort(col_1,(I1,I2)->I1<I2?-1:I1>I2?1:0);
	   for(Integer I: col_1) {
		   System.out.print(I+",");
	   }
	   
	//Example 2
	   System.out.print("\n");
	   //With Lambda
	   ArrayList<Student> col_2=new ArrayList<Student>();
	   col_2.add(new Student("Arun",1));
	   col_2.add(new Student("Dheeru",2));
	   col_2.add(new Student("Shyam",4));
	   col_2.add(new Student("Ram",6));
	   col_2.add(new Student("Pankaj",8));
	   col_2.add(new Student("Raju",3));
	   
	   Collections.sort(col_2,(s1,s2)->s1.rollNo<s2.rollNo?-1:s1.rollNo>s2.rollNo?1:0);
	   for(Student I: col_2) {
		   System.out.print(I+",");
	   }
   }
}
