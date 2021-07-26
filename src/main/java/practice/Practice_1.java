package practice;

interface Calculator{
  int add(int a,int b);
}

interface Test{
	void proceed();
}

interface Test2{
	int getMax(int[] num);
}

interface Test3{
	int getMin(int[] num);
}

public class Practice_1{
	public static void main(String args[]) {
		
		/////////////
		Calculator c=(a,b)->a+b;
		System.out.println(c.add(4,6));
		
		/////////////
		Test t=()->{
			System.out.println("Hiii!!");
			System.out.println("Hello!!");
			System.out.println("Okay!!");
			System.out.println("Nice!!");
		};
		t.proceed();
		
		/////////////
		Test2 t2=(int[] num)->{
			int max=0;
			for(int n:num) {
				if(max<n) {
					max=n;
				}
			}
			return max;
		};
		
		int num[]= {5,6,7,8,2,3,4,9,8};
		System.out.print(t2.getMax(num));
		
		////////////
		Test3 t3=new Test3() {
			public int getMin(int num[]) {
				int min=Integer.MAX_VALUE;
				for(int n:num) {
					if(min>n) {
						min=n;
					}
				}
				return min;
			}
		};
		System.out.print(t3.getMin(num));
	}
}