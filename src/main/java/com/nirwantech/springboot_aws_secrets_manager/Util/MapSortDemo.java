package com.nirwantech.springboot_aws_secrets_manager.Util;

import com.nirwantech.springboot_aws_secrets_manager.Database.Employee;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSortDemo {

    public static void main(String[] args){

        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());


    Map<Integer,String>  map=new HashMap<>();
        map.put(101,"F");
        map.put(102,"D");
        map.put(103,"E");
        map.put(104,"B");
        map.put(105,"A");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("========================");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("========================Employee=====");


        Map<Employee,Integer> employeeIntegerMap=new HashMap<>();
employeeIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
        .forEach(System.out::println);
Employee employee=new Employee();

        Optional<String> optional=Optional.ofNullable(employee.getName());

        System.out.println("========================Hexaware=====");



        String input="Hello Hexaware";

        Map<String, Long> frequencyMap = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequencyMap);

       List<String> list= frequencyMap.entrySet().stream().filter(v->v.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(list);


        System.out.println("________________________________");

        // 1. Find the list of students whose rank is in between 50 and 100

        for (Student student : studentList.stream().filter(s -> s.getRank() > 50 & s.getRank() < 100).collect(Collectors.toList())) {
            System.out.println(student);
        }
        System.out.println("=====================");


        List<Student> students = studentList.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100)
                .collect(Collectors.toList());
        System.out.println(students);
        System.out.println("++++++++++++++++");



      List<Student> cityList=  studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Karnataka"))
              .sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder()))
              .collect(Collectors.toList());

        System.out.println(cityList);


        List<String> deptList = studentList.stream().map(student -> student.getDept()).distinct().collect(Collectors.toList());
        System.out.println("test="+deptList);

//4.  Find all the contact numbers
   List<String> contact = studentList.stream().flatMap(student -> student.getContacts().stream())
           .collect(Collectors.toList());

        System.out.println("contact="+contact);

        Map<String, Double> collect = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("collect \n="+collect);


        Map<String, Optional<Student>> listMap = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("listMap \n="+listMap);


        Student student = studentList.stream().sorted(Comparator.comparing(Student::getRank))
                .skip(2)
                .findFirst().get();

        System.out.println("Rank \n="+student);


        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "World");
        CompletableFuture<String> combined = f1.thenCombine(f2,(a,b)->a +" "+b);
        String join = combined.join();
        System.out.println("join \n="+join);


    }
}
