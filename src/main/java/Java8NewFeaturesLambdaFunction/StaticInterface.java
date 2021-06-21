package Java8NewFeaturesLambdaFunction;

/* If there is only static methods happily we should go for interface 
 * because interface is more cheaper than the class
 *
 */
interface Test{
        public static void m1() {
        	System.out.println(" Hello!! ");
        }
        public static void m2() {
        	System.out.println(" Hello!!");
        }
        public static void m3() {
        	System.out.println(" Hello!! ");
        }
        public static void m4() {
        	System.out.println(" Hello!! ");
        }
}

public class StaticInterface{
	
	public static void main(String args[]) {
		Test.m1();
		Test.m2();
		Test.m3();
		Test.m4();
		
	}
}
