package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.List;

public class inputStringTransfer {

    public static void main(String[] args){
        double input =123456.789;

       String  output= reversedNumber(input);
        System.out.println("Expected Output :"+output);
    }

    private static String reversedNumber(double input) {
        String[] firstpart = String.valueOf(input).split("\\.");

        String value=firstpart[0];
        StringBuilder sb=new StringBuilder();
        sb.append(value);
        String reversedVal=sb.reverse().toString();
        int reversedIntValue= Integer.parseInt(reversedVal);
        int values=reversedIntValue +333333;


        System.out.println("final value="+values);
        String subStr=value.substring(0,3);

         StringBuilder sb2=new StringBuilder();
         sb2.append(subStr);

        String secondPart=sb2.reverse().toString();
        System.out.println("2nd value="+secondPart);




        return values+"." +secondPart;
    }


}
