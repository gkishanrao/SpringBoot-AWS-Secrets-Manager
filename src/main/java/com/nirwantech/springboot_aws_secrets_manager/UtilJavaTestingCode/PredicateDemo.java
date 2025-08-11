package com.nirwantech.springboot_aws_secrets_manager.UtilJavaTestingCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

   public static void main(String[] arg){

       List<Integer> list= Arrays.asList(1,2,3,4,5);
       list.stream().filter(t->t%2==0).forEach(t->System.out.println("print Even:"+t));


   }

}

