package Java8NewFeaturesLambdaFunction;

//Example 1
class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i+",");
		}
	}
}

public class LambdaWithMultiThreading {
   public static void main(String args[]) {
	   //Example 1
	   MyThread th=new MyThread();
       Thread t=new Thread(th);
	   t.start();
	   	   
	   System.out.print("\n");
	   //Example 2
	   Runnable r=()->{
		   for(int i=0;i<10;i++) {
				System.out.print(i+",");
			}
	   };
	   t=new Thread(r);	   
	   t.start(); 
   }
}
