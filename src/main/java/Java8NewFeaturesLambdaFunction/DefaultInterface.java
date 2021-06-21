package Java8NewFeaturesLambdaFunction;

interface A {
	void m1();
	void m2();
	
	//Introduced in Java 8
    default void m5() {
	   System.out.println("Hello!! Interface A");
	}
}

interface B {
	void m3();
	void m4();
	
	//Introduced in Java 8
	default void m5() {
		System.out.println("Hello!! Interface B");
	}
}

class DefaultAndStaticInterface_1 implements B{
	@Override
	public void m3() {
	}

	@Override
	public void m4() {
	}
}

class DefaultAndStaticInterface_2 implements A{

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
	}
	
    public void m5() {
		
	}
}

public class DefaultInterface implements A,B{

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		A.super.m5();
		B.super.m5();
	}
	
	public static void main(String args[]) {
		DefaultInterface df=new DefaultInterface();
		df.m5();
	}
}