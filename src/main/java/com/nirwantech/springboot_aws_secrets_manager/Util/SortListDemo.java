package com.nirwantech.springboot_aws_secrets_manager.Util;

import com.nirwantech.springboot_aws_secrets_manager.Database.Database;
import com.nirwantech.springboot_aws_secrets_manager.Database.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] arg){
        List<Integer> list= Arrays.asList(8,10,13,4,3);
       List<Integer> result= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);

        List<Employee> employee= Database.getEmployees();

        employee.stream().sorted((o1,o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

System.out.println("+++++++++++++++++++++++++++++");
        employee.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

        System.out.println("========================");


        employee.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);






    }


}
