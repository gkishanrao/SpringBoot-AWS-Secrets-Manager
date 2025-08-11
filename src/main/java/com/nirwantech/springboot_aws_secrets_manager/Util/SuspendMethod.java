package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.ArrayList;
import java.util.LinkedList;

public class SuspendMethod {
  public static void main(String[] args){
      LinkedList<String> list = new LinkedList<String>();

      // listlist as stock
     /*list.push("A");
      list.push("B");
      list.push("C");
      list.push("D");
      list.pop();*/

      // listlist as queue

      list.offer("A");
      list.offer("B");
      list.offer("C");
      list.offer("D");
      list.poll();
      System.out.println(list);
      list.add(2,"B");
      list.remove("B");
      System.out.println(list);

  }

}
