package java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class lambdaSteamFilter {

    int age;
    String gender;
    String name;

    public lambdaSteamFilter(int age, String gender, String name){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public static void main(String args[]) {
        List<lambdaSteamFilter> myList = new ArrayList<>();
        myList.add(new lambdaSteamFilter(1, "Female", "Vivi"));
        myList.add(new lambdaSteamFilter(30, "Female", "Chandu"));
        myList.add(new lambdaSteamFilter(33, "Male", "BU"));

        myList.forEach(l -> {
            System.out.println(l.name);
        });

        System.out.println("Age greater than 25");
        Stream<lambdaSteamFilter> steamFilterStream = myList.stream().filter(p -> p.age > 25);
        steamFilterStream.forEach(l -> {
            System.out.println(l.age);
        });

        System.out.println("Age less than 25");
        Stream<lambdaSteamFilter> steamFilterStream1 = myList.stream().filter(p -> p.age < 25);
        steamFilterStream1.forEach(l -> {
            System.out.println(l.age);
        });
    }
}
