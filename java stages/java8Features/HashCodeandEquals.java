package java8Features;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeandEquals {
    public static void main(String[] args) {
        HashCodeandEquals hashCodeandEquals=new HashCodeandEquals();
        Drinks drinks1=new Drinks("pepsi",20);
        Drinks drinks2=new Drinks("pepsi",20);

        System.out.println(drinks1==drinks2);
        System.out.println(drinks1.equals(drinks2));

        Map<Drinks,String> map=new HashMap<>();
        map.put(drinks1,"drinks1");
        map.put(drinks2,"drinks2");
        System.out.println(map.get(drinks1)+" , "+map.get(drinks2));
        System.out.println(drinks1==drinks2);
    }
}
