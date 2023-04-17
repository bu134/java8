package java8.features;

import java.util.function.Predicate;

public class predicate {

    public static void main(String [] args){
        Predicate<Object> predicate = a -> (a.equals("Hello"));
        if(predicate.test("hello")){
            System.out.println("Match");
        }else{
            System.out.println("No match");
        }
    }
}
