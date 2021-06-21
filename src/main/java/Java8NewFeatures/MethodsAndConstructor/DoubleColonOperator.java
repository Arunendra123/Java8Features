package Java8NewFeatures.MethodsAndConstructor;


class Sample{
	Sample(){
		System.out.println("Construcot reference");
	}
}

interface Test{
	Sample get();
}

class Sample1{
	Sample1(String str){
		System.out.println("Construcot reference: "+str);
	}
}

interface Test1{
	Sample1 get(String str);
}

//It used for code reusability
public class DoubleColonOperator {
	
	public static void m1(){
		for(int i=0;i<10;i++) {
			System.out.print(i+",");
		}
	}
	
	public void m2(){
		for(int i=0;i<10;i++) {
			System.out.print(i+",");
		}
	}
	
	public static void main(String args[]) {
		 Runnable r=()->{
			   for(int i=0;i<10;i++) {
				   System.out.print(i+",");
			   }
		   };
		   Thread t=new Thread(r);
		   t.start();
		   
		   
		   
		/*\       ||
		 *        \/ 
		 *  Using :: operation
		\*/
	    //Method reference
		   
		/*           class name because i am using static method
		 *             || 
		 *             \/
		 */
	   Runnable r1=DoubleColonOperator::m1;
	   Thread t1=new Thread(r1);
	   t1.start();
	   /*           class object because i am using instance method
		 *             || 
		 *             \/
		 */
	   Runnable r2=new DoubleColonOperator()::m2;
	   Thread t2=new Thread(r2);
	   t2.start();
	   
	   
	    /*\       ||
		 *        \/ 
		 *  Using :: operation
		\*/
	    //using constructor reference
	   
	   Test tt=Sample::new;
	   tt.get();
	   
	   Test1 tt1=Sample1::new;
	   tt1.get("With parameters");
	}
}
