package java8Features;

import java.util.Objects;

public class Drinks {
    String name;
    int cost;
    public Drinks(String name, int cost)
    {
        this.name=name;
        this.cost=cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drinks drinks = (Drinks) o;
        return cost == drinks.cost && Objects.equals(name, drinks.name);
    }

    @Override
    public int hashCode() {
        int i=Objects.hash(name, cost);
        System.out.println(i);
        return i;
    }
}
