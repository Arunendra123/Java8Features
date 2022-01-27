package Java8NewFeaturesLambdaFunction;

/*
1. Lambda Function 
2. Functional interface
3. Default method and static method
4. Predefine functional interface
   Predicate 
   Function
   Consumer supplier
5. Double colon separator(::)
   Method reference 
   Constructor reference
6. Streams
7. Date & Time API
8. Optional class
9. Nashorn javascript engine*/


@FunctionalInterface                     //@FunctionalInterface is used to verify whether below interface is (SAM) valid or not.
public interface Java8NewFeatures {
    public void fi();
    //public void fi_1();
}
