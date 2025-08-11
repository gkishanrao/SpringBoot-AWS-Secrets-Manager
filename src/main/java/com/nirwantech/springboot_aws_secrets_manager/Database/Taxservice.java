package com.nirwantech.springboot_aws_secrets_manager.Database;

import java.util.List;
import java.util.stream.Collectors;

public class Taxservice {

    public static List<Employee> evaluationTaxUsers(String input){
      return (input.equalsIgnoreCase("tax"))
              ? Database.getEmployees().stream().filter(emp -> emp.getSalary() > 5000).collect(Collectors.toList())
              : Database.getEmployees().stream().filter(emp -> emp.getSalary() < 5000)
              .collect(Collectors.toList());
    }
    public  static void main(String[] args){
     System.out.println(evaluationTaxUsers("tax"));
}
}
