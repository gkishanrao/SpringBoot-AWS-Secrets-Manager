package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8Stream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murrit");
        list.add("john");
        list.add("smith");
        list.add("Mac");
        list.add("david");
        list.add("jhone");

        for(String str:list){
            System.out.println(str);
        }

        //Stream Api
        System.out.println("===================");
        list.stream().filter(s->s.startsWith("j")).forEach(System.out::println);



        System.out.println("===================");

        Map<Integer,String> map=new HashMap<>();

        map.put(1001,"A");
        map.put(1002,"B");
        map.put(1003,"C");
        map.put(1004,"D");

       // map.forEach((key,value)->System.out.println(key+ ":"+value));

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));



    }
}
