package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.LinkedHashSet;

class GFG {

    public static void main(String[] args) {


        int[] Arr = new int[6];

        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;
        Arr[4] = 50;
        Arr[5] = 60;

        for(int  i=0;i<Arr.length; i++){
             System.out.println(Arr[i]);
        }

        int[] arr = {1, 2, 3, 5, 0};
        int[] tempArr = arr.clone(); // Creates a new array with copied values


        // LinkedHashSet declared
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        // Add elements in HashSet
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(5);
        hs.add(3);
        hs.add(3);
        // Print values
        System.out.println("Values:" + hs);





    }
}