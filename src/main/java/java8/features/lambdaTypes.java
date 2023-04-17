package java8.features;

import java.util.ArrayList;
import java.util.List;

public class lambdaTypes {

    interface Drawable{
        void draw();
    }

    interface Drawable2{
        public String say();
    }

    interface Drawable3{
        public String say(String name);
    }

    interface Drawable4{
        public String add(int a, int b);
    }

    public static void main(String[] args){
        System.out.println("Sample program to demonstrate Lambda expressions");

        System.out.println("1. Sample Lambda");
        Drawable d = ()->{
            System.out.println("Implementation of sample drawable interface");
        };
        d.draw();

        System.out.println("2. No parameter lambda");
        Drawable2 d2 = ()->{
            return "No paramter implmentation of interface";
        };
        System.out.println(d2.say());

        System.out.println("3. Single Parameter");
        Drawable3 d3 = (name)->{
            return "Hello " + name;
        };
        System.out.println(d3.say("Lambda"));

        System.out.println("4. Multiple parameters");
        Drawable4 d4 = (a, b)->{
            return "Addition : " + (a+b);
        };
        System.out.println(d4.add(3,4));

        System.out.println("5. List printing with Lambda");
        List<String> myList = new ArrayList<String>();
        myList.add("Vivi");
        myList.add("Hazel");
        myList.add("Bu");

        myList.forEach((l)->{
            System.out.println(l);
        });

        System.out.println("Lambda with Comparator");

    }
}
