package com.nirwantech.springboot_aws_secrets_manager.UtiStudent;


import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private int grade;
    private double averageScore;
    private Double salary;





    public static void main(String[] args){

        List<Student> studentList = Arrays.asList(
                new Student("Alice", 10, 88.5,12000.0),
                new Student("Bob", 10, 91.2,13000.0),
                new Student("Charlie", 10, 86.4,14000.0),
                new Student("David", 11, 93.5,15000.0)
        );
        List<Student> listTop=   Student.getTopStudent(studentList,5);
        listTop.forEach(System.out::println);

        List<Integer> salary= Arrays.asList(20000,30000,40000,40000,50000,60000);
        Optional<Integer> first = salary.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();
System.out.println("first==="+first);

    }

    private static List<Student> getTopStudent(List<Student> studentList, int grade) {
        return  studentList.stream().filter(s->s.getGrade()==grade).sorted(Comparator.comparingDouble(Student::getAverageScore).reversed()).limit(2).collect(Collectors.toList());
    }

}
