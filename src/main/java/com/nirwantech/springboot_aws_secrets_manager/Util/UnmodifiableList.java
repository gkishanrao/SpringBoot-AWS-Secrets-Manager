package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] argv) throws Exception {
        try {
            // creating object of ArrayList
            ArrayList<Integer> temp = new ArrayList<>();
            // populate the list
            temp.add(1);
            temp.add(2);
            temp.add(3);
            // printing the list
            System.out.println("Initial list: " + temp);

            // getting readonly list
            // using unmodifiableList() method
            List<Integer> new_array = Collections.unmodifiableList(temp);

            // printing the list
            System.out.println("ReadOnly ArrayList: " + new_array);

            // Attempting to add element to new Collection
            System.out.println("\nAttempting to add element to the ReadOnly ArrayList");
            new_array.add(55);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception is thrown : " + e);
        }
    }
}
