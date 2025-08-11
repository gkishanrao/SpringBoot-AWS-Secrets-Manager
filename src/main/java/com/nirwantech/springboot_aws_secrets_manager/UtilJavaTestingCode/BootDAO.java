package com.nirwantech.springboot_aws_secrets_manager.UtilJavaTestingCode;

import java.util.ArrayList;
import java.util.List;

public class BootDAO {

    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(101,"Core Java Book",500));
        books.add(new Book(102,"Hibernate Book",600));
        books.add(new Book(103,"Kubernetes Book",700));
        return  books;
    }
}
