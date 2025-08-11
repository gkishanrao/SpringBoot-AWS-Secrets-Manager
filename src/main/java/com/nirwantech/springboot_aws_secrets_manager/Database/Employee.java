package com.nirwantech.springboot_aws_secrets_manager.Database;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String Dept;
    private int salary;


}
