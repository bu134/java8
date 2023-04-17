package java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lambdaComparator {

    int age;
    String gender;
    String name;

    public lambdaComparator(int age, String gender, String name){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public static void main(String args[]){
        List<lambdaComparator> myList = new ArrayList<>();
        myList.add(new lambdaComparator(1, "Female", "Vivi"));
        myList.add(new lambdaComparator(30, "Female", "Chandu"));
        myList.add(new lambdaComparator(33, "Male", "BU"));

        myList.forEach(l->{
            System.out.println(l.name);
        });

        myList.sort(Comparator.comparing(p -> p.name));

        System.out.println("After sorting");
        myList.forEach(l->{
            System.out.println(l.name);
        });

        System.out.println("Comparing Int");
        myList.sort(Comparator.comparingInt(p -> p.age));
        myList.forEach(l->{
            System.out.println(l.age);
        });

    }
}
