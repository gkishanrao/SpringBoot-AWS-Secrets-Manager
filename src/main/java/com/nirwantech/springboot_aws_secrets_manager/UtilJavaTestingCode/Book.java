package com.nirwantech.springboot_aws_secrets_manager.UtilJavaTestingCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private int id;
    private String name;
    private  int pages;

}
