package anonymousClass;

public class Demo {
    public static void main(String[] args) {
        Icecream i=new Icecream() {
            @Override
            public void flavour() {
                System.out.println("flavour");
            }
        };
        i.flavour();

    }
}
interface Icecream{
    void flavour();
}
