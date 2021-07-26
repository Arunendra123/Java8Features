package Java8NewFeatures.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	/*
	 * Collection: If requirement is to represent the group of object a as single
	 * entity then we should go for Collection.
	 * 
	 * Stream: If requirement is to process the collection object then we should go
	 * for the Stream.
	 * 
	 * Get stream object:
	 * 
	 * Stream stream=c.stream();
	 */
	
	public static void main(String args[]) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(20);
		ar.add(30);
		ar.add(51);
		ar.add(90);
		ar.add(11);
		ar.add(32);
		ar.add(54);
		
		System.out.println(ar);
		
		//Filter filter(Predicate)
		List<Integer> ar1=ar.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ar1);
		
		//Map map(Function)
		List<Integer> ar2=ar.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(ar2);
		
		//count
		Long ar3=ar.stream().map(i->i+5).count();
		System.out.println(ar3);
		
		Long ar4=ar.stream().filter(i->i%2==0).count();
		System.out.println(ar4);
		
		//sorted
		List<Integer> ar5=ar.stream().sorted().collect(Collectors.toList());
		System.out.println(ar5);
		
		//sorted using sorted(Comparator)
		List<Integer> ar6=ar.stream().sorted((i,j)->i<j?1:i>j?-1:0).collect(Collectors.toList());
		System.out.println(ar6);
		
		//sorted using sorted(Comparable)
	    List<Integer> ar7=ar.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println(ar7);
		
	    List<Integer> ar8=ar.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println(ar8);
		
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Arunendra");
		arr.add("Ram");
		arr.add("Saroj");
		arr.add("Geeta");
		arr.add("Kamal");
		arr.add("Bahadur");
		arr.add("Dukhanti");
		List<String> arr1=arr.stream().sorted().collect(Collectors.toList());
		System.out.println(arr1);
		
		//Sort Based on length
		List<String> arr2=arr.stream().sorted((s1,s2)->s1.length()<s2.length()?-1:s1.length()>s2.length()?1:0).collect(Collectors.toList());
		System.out.println(arr2);
	
	    //min
		Integer i=ar.stream().min((i1,i2)->i1.compareTo(i2)).get();
	    System.out.println(i);
	
	    //max 
	    i=ar.stream().max((i1,i2)->i1.compareTo(i2)).get();
	    System.out.println(i);
	    
	    //foreach
	    ar.stream().forEach(System.out::print);
	    
	    //foreach
	    ar.stream().forEach(s->{System.out.print(s+"\t");});
	    
	    //stream to array
	    Integer[] list=ar.stream().toArray(Integer[]::new);
		/*
		 * for(Integer I:list) { System.out.print(I+"\t"); }
		 */
	    Stream.of(list).forEach(System.out::println);
	    
	    
	}
	
}
