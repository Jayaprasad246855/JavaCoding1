package abstraction;

public class Airtel implements Sim,Sim2{

    @Override
    public void simName() {
        System.out.println("Method from sim interface");
    }

    public static void main(String[] args) {
        Sim s=new Airtel();
        Sim2 s1 = new Airtel();
        s.simName();
        s1.simName();
    }
}
