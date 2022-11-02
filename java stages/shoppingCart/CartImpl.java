package shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CartImpl {
    public static void main(String[] args) {
        Cart c1=new Cart(1,100,"jeans","L");
        Cart c2=new Cart(2,1000,"cotton","L");
        Cart c3=new Cart(3,110,"wool","xL");
        Cart c4=new Cart(4,1434,"polyster","xL");
        Cart c5=new Cart(5,1456,"wool","xL");

        List<Cart> list =new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        List<Cart> l=new ArrayList<>();
        List<Cart> xL=new ArrayList<>();

//        Map<String,Object> map=list.stream()
//                .collect(Collectors.toMap(key->key.catagery,value->value,(a,b)->a+"<-->"+b));
//        map.forEach((s, o) -> System.out.println("{"+s+"="+o+"}"));

        list.stream().forEach(i->{
            if(i.size.equalsIgnoreCase("L"))
            {
                l.add(i);
            }else {
                xL.add(i);
            }
        });

        System.out.println(l);
        System.out.println(xL);

    }
}
