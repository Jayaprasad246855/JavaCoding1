package java8Features.collections;

import threads.atmExample.Benificiary;

import java.util.*;
import java.util.stream.Collectors;

public class CustomList {
    public static void main(String[] args) {
        List<Benificiary> l=new ArrayList<>();
        Benificiary b1=new Benificiary("pragnaya",10000);
        Benificiary b2=new Benificiary("sai",15000);
        Benificiary b3=new Benificiary("jay",50000);
        Benificiary b4=new Benificiary("yugu",20000);
        Benificiary b5=new Benificiary("priya",1000);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);
        l.add(b5);

//        for(int i=0;i<l.size();i++)
//        {
//            Benificiary b=l.get(i);
//            if(b.requiredAmount>10000 && b.requiredAmount<=40000)
//            {
//                System.out.println("valid");
//            }else{
//                l.remove(b);
//            }
//        }
//        System.out.println(l);

//        l.stream().sorted((i, j) -> i.requiredAmount > j.requiredAmount ? 1 : -1)
//                .dropWhile(i->i.requiredAmount>10000)
//                .forEach(i-> System.out.println(i));


        Map<String,Benificiary> map=l.stream()
                .sorted((i, j) -> i.requiredAmount > j.requiredAmount ? 1 : -1)
                .dropWhile(i -> i.requiredAmount < 15000)
                .collect(Collectors.toMap(i->i.name,j->(j)));
        System.out.println(map);


//                .max((i,j)->i.requiredAmount>j.requiredAmount?1:-1).get();
    }
}
