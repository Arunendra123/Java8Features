package Java8NewFeaturesLambdaFunction;

   // A class without name called as anonymous inner classes.
   class TestThread extends Thread{
	public void run() {
		 for(int i=0;i<10;i++) {
			 System.out.print(i+",");
		 }
	 }
    }

   // A class without name called as anonymous inner classes.
   class TestThread1 extends Thread{
	public void run() {
		 for(int i=0;i<10;i++) {
			 System.out.print(i+",");
		 }
	 }
    }
   
    public class AnonymousInnerClassesVsLambda {
      public static void main(String args[]) {
    	  //withoutAnonymousInnerClass
    	  TestThread mt=new TestThread();
    	  mt.start();
    	 
    	  //With AnonymousInnerClass
    	  Thread th=new Thread() {
    	  	 public void run() {
    			 for(int i=0;i<10;i++) {
    				 System.out.print(i+",");
    			 }
    		 }
    	  };
    	  th.start();
    	  
    	 //With AnonymousInnerClass
    	  Runnable r=new Runnable() {
			@Override
			public void run() {
				 for(int i=0;i<10;i++) {
    				 System.out.print(i+",");
    			 }
				
			}  
    	  };
    	  
    	  Thread th1=new Thread(r);
    	  th1.start();
     }
}
