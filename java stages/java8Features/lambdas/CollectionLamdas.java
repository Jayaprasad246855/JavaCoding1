package java8Features.lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionLamdas {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Majji","Majji","Majji","majji");
        List<String> list2=Arrays.asList("Jaya Prasad","ravanamma","Raja rao","Ramya");
        List<String> list3=Arrays.asList("23","45","50","26");
        
        Map<String,String> map=new HashMap<>();
        Map<String,String> map1=new HashMap<>();
        
        for(int i=0;i<list1.size();i++)
        {
           map.put(list1.get(i),list2.get(i));
           map1.put(list2.get(i), list3.get(i));
        }
        
        System.out.println("==============before================ ");
        System.out.println(map);
        System.out.println(map1);
        System.out.println("==============after======================== ");
        System.out.println(map.computeIfAbsent(map1.get("2Ramya"),k->" pressent"));


    }
}
