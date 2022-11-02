package shoppingCart;

import java.util.Objects;

public class Cart {
    public int id;
    public int price;
    public String catagery;
    public String size;

    public Cart(int id, int price, String catagery, String size) {
        this.id = id;
        this.price = price;
        this.catagery = catagery;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id && Objects.equals(price, cart.price) && Objects.equals(catagery, cart.catagery) && Objects.equals(size, cart.size);
    }

    @Override
    public int hashCode() {
        int i=Objects.hash(id, price, catagery, size);
        return i;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", gender='" + price + '\'' +
                ", catagery='" + catagery + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
