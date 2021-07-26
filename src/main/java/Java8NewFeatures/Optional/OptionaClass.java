package Java8NewFeatures.Optional;

import java.util.Optional;

//Optional class help to void null pointer exception

class Test{
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}

class Test1{
	private String str;

	public Optional<String> getStr() {
		return Optional.ofNullable(str);
	}

	public void setStr(String str) {
		this.str = str;
	}
}

public class OptionaClass {

   public static void main(String args[]) {
	   Test t=new Test();
	   //t.setStr("I am Arunendra");
		/* Traditional Method */
	   if(t.getStr()==null) {
		   System.out.println("String is null");
	   }else {
		   System.out.println("String length is "+t.getStr().length());
	   }
	   
		/* Using Optional */
	   Optional<String> optional=Optional.ofNullable(t.getStr());
	   System.out.println(optional.isPresent());
	   System.out.println(optional.empty());
	   System.out.println(optional.orElse("String is null"));
	   
	   Test1 t1=new Test1();
	   System.out.println(t1.getStr().orElse("String is null"));
   }
}
