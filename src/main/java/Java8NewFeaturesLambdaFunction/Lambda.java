package Java8NewFeaturesLambdaFunction;

/* To bring the function programming in java the lambda function came.
   It is a anonymous function
   1. without name,
   2. without return type and 
   3. without modifiers.*/
/* How write to lambda function
 * =========================================================================
 * methods using lambda functions 
 * 
 * 1.
 * ------------------------------------------------------------
 * public void print(){ Syetem.out.println(" Hello!! "); }
 * 
 * ()-> System.out.println(" Hello!! ");
 * ------------------------------------------------------------
 * 
 * 2.
 * ------------------------------------------------------------
 * public void add(int a,int b){ System.out.println(a+b); }
 * 
 * (a,b) -> System.out.println(a+b);
 * ------------------------------------------------------------
 * 
 * 3.
 * ------------------------------------------------------------
 * public int squareInt(int n) { return n*n; }
 * 
 * (int n)->{return n*n;} or (int n)->n*n; or (n)->n*n; or n->n*n;
 * ------------------------------------------------------------
 * 
 * 
 * How to call or invoke lambda function
 * =========================================================================
 * Functional interface: The FI is used to invoke the lambda function.
 * FI have only single abstract method interface (SAM) like:
 */  

  @FunctionalInterface                     //@FunctionalInterface annotation is used to verify whether below interface is (SAM) valid or not.
  interface Java8NewFeatures_0 {      //@FunctionalInterface annotation is optional 
    public void fi();
    //public void fi_1();
  } 

  @FunctionalInterface                     
  interface Java8NewFeatures_1 extends Java8NewFeatures_0 {
    public void fi();
    //public void fi_1();
  } 
  
  @FunctionalInterface                     
  interface Java8NewFeatures_2 extends Java8NewFeatures_0 {
    //public void fi_2();
    //public void fi_1();
  } 
  
 /* -----------------------------------------------
 * 1. Runnable      ==> run();
 * 2. Comparable    ==> compareTo(); 
 * 3. Comparator    ==> compare(); 
 * 4. Callable      ==> call();
 * 5. ActionListner ==> actionPerformed();
 * ------------------------------------------------
 * 
 *  The interface is having single abstract method (SAM) called as FI
 */
  
/*
 * Some conclusion
 * 
 * n->return n*n;    -->invalid #without {} return is not allowed 
 * n->{return n*n;}; -->valid 
 * n->{return n*n};  -->invalid # ";" is missing after 
 * n*n n->{n*n;};    -->invalid # with {} return must be there 
 * n->n*n;           -->valid
 */
  
 //Example 1
 @FunctionalInterface               //optional    
 interface LambdaTest{
	public void print();
 }

 class LambdaTestImpementation implements LambdaTest{
	public void print() {
		System.out.println("Testing a class without lambda function...");
	}
 }
 
 //Example 2
 @FunctionalInterface               //optional    
 interface LambdaTest_1{
	public void add(int a,int b);
 }

 class LambdaTestImpementation_1 implements LambdaTest_1{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
 }
 
 //Example 3
  @FunctionalInterface               //optional    
  interface LambdaTest_2{
	public int add(int a,int b);
 }

  class LambdaTestImpementation_2 implements LambdaTest_2{
	public int add(int a,int b) {
		return a+b;
	}
  }

 public class Lambda {
	public static void main(String args[]) {
	//Example 1
		//Without lambda function
		LambdaTest i_0=new LambdaTestImpementation();
		i_0.print();
		
		//With lambda function
		LambdaTest i_1=()->System.out.println("Testing a class with lambda function...");
		i_1.print();
		
	//Example 2
		//Without lambda function
        LambdaTest_1 i_2=new LambdaTestImpementation_1();
        i_2.add(34,56);
        
        //With lambda function
        LambdaTest_1 i_3=(a,b)->System.out.println(a+b);
      	i_3.add(34,56);

	 //Example 3
	     //Without lambda function
	     LambdaTest_2 i_4=new LambdaTestImpementation_2();
	     System.out.println(i_4.add(34,56));
	        
	     //With lambda function
	     LambdaTest_2 i_5=(a,b)->a+b;
	     System.out.println(i_5.add(34,56));
	}
  }

