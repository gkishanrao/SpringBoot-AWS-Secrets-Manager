package com.nirwantech.springboot_aws_secrets_manager.Database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees(){

        List<Employee> list= new ArrayList<>();
        list.add(new Employee(101,"Kishan", "IT",5000));
        list.add(new Employee(102,"Ramu", "CSE",4000));
        list.add(new Employee(103,"Zookeeper", "Mech",10000));
        list.add(new Employee(104,"Waries", "Economic",15000));
        list.add(new Employee(105,"Hari", "CS & IT",2000));

        return list;


    }
}
