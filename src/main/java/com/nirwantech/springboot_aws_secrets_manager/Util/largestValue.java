package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class largestValue {

    public static void main(String[] args){
        int[] arr= {100,200,300,600};
        int first=0;
        int second=0;
        for (int i=0; i<arr.length; i++){

            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]> second){
                second=arr[i];
            }

        }
        System.out.println("Largest: " + first);
        System.out.println("Second Largest: " + second);


        //Using stream APi

       List<Integer> list= Arrays.stream(arr)
                .boxed()

                .sorted(Comparator.reverseOrder())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Second Largest: " + list);
        if(list.size()>=2){
            System.out.println("first Largest: " + list.get(0));
            System.out.println("Second Largest: " + list.get(1));


        }

    }


}
