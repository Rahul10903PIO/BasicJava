package com.core.java.week3.Day3;

import java.util.*;

class LostItem{

    public String itemName;
    public String location;

    public LostItem(String itemName,String location){

        this.itemName=itemName;
        this.location=location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LostItem lostItem = (LostItem) obj;
        return location.equals(lostItem.location) && itemName.equals(lostItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.location,this.itemName);
    }

}
public class Hashmap {
    public static void main(String[] args){
        Map<LostItem,Integer> map=new HashMap<>();
        String[] itemName={"Phone","Phone","Phone","Bike"};
        String[] location={"Main Gate","Engineering Block","Main Gate","Parking"};
        for(int i=0;i<4;i++){
           LostItem lost=new LostItem(itemName[i],location[i]);
           map.put(lost,map.getOrDefault(lost,0)+1);
        }
        for(Map.Entry<LostItem,Integer> item:map.entrySet()){
            LostItem li=item.getKey();
            int count=item.getValue();
            System.out.print(String.format("Lost Item Name = %s\nLocation = %s\nCount = %d\n%n",li.itemName,li.location,count));
        }
    }

}
