package com.nirwantech.springboot_aws_secrets_manager.Util.TestJava8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterface {
    public  static  void main(String[] args){
        Functional functional=()->System.out.println("Hello Lambda expression!");
        Functional func=Functional::displayMessage;
        functional.sayHello();
        func.sayHello();
        functional.sayBye("Jyodeep");
        Functional.info();

        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
       // names.forEach(name -> System.out.println(name));
       // names.stream().filter(s->s.startsWith("S"))
             //   .forEach(System.out::println);

        names.stream().map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<List<String>> list = Arrays.asList(Arrays.asList("Ram", "Shyam"),Arrays.asList( "Mohan"));
        list.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

    }


}

@java.lang.FunctionalInterface
interface Functional{
    void sayHello();
    default void sayBye(String name){
        System.out.print("Hello, "+name);
    }
   public static void  info(){
        System.out.println("Static method executing!");
    }

    public static void displayMessage() {
        System.out.println("Hello from method reference!");
    }
}



