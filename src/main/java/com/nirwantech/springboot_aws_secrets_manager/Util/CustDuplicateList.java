package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.ArrayList;

public class CustDuplicateList<T> extends ArrayList<T>{

    @Override
    public boolean add(T object){
        if(this.contains(object)){
            return  false;
        }
        return  super.add(object);

    }
    public static void main(String[] args){
        CustDuplicateList list=new CustDuplicateList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(list);



    }
}
