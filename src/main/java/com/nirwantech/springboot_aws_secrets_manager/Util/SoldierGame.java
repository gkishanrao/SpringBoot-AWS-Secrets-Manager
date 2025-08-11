package com.nirwantech.springboot_aws_secrets_manager.Util;

import java.util.ArrayList;
import java.util.List;

public class SoldierGame {
    public int getlastSoldiers(int n, int k )
    {
         List<Integer> soldiers=new ArrayList<>();
         for(int i=1; i<=n; i++){
             soldiers.add(i);
    }
         int currentIndex=0;
         while(soldiers.size() > 1){
             int killIndex= (currentIndex +k) % soldiers.size();
             soldiers.remove(killIndex);
             if(killIndex < soldiers.size()){
                 currentIndex=killIndex;
             }else {
                 currentIndex=0;
             }
         }
         return  soldiers.get(0);
    }
    public static void main(String[] args){
        SoldierGame sg=new SoldierGame();
        System.out.println("Last Soldiers ="+sg.getlastSoldiers(5,2));
        System.out.println("Last Soldiers ="+sg.getlastSoldiers(6,3));
    }
}
