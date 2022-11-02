package java8Features.collections.map;

import threads.atmExample.Benificiary;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Benificiary b1=new Benificiary("pragnaya",10000);
        Map<Integer,Benificiary> map=new TreeMap<>();
        map.put(2,b1);
        map.put(1,null);
        System.out.println(map.get(2));
        for(Integer key:map.keySet())
        {
            System.out.println(key);
        }
    }
}
