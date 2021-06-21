package Java8NewFeatures.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String args[]) {
		List<Integer> ar=Arrays.asList(2,3,2,1,2,3,4,5,6,7);
		//1.
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+",");
		}
		
		System.out.println();
		//2.
		for(Integer i:ar) {
			System.out.print(i+",");
		}
		
		System.out.println();
		//3. Since java 1.8
		ar.forEach(i->{
			System.out.print(i+",");
			System.out.print(i+",");
		});
	}
}
