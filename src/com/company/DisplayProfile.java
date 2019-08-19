package com.company;

import java.util.List;

public class DisplayProfile {

    public void displayAllProfile(List<Entity> list){
        double sum = 0;

        System.out.println("ID:         Date:                   Amount:             Content:            ");
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i).toString());
            sum += list.get(i).getAmount();
        }
        System.out.println("Total: " + sum);
    }
}
