package java8Features.lambdas;

import java.util.*;

public class CollectionLamdas {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("hi","hello","welcome","yugu");
        List<String> list2=Arrays.asList("yugu","jai","usha","pragnayta");
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            map.put(list.get(i),list2.get(i));
        }
        System.out.println(map.computeIfAbsent("yugu12",k->"not pressent"));
        System.out.println("==============before================ ");

        System.out.println("=================after======================== ");


    }
}
