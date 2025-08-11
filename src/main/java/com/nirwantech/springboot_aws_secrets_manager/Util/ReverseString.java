package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Given String=");
       String inputString= scanner.nextLine();

       String revserStr="";
       for(int i=inputString.length()-1 ;i>=0;i--){
           revserStr += inputString.charAt(i);

       }
System.out.println("revserStr="+revserStr);


    }
}
