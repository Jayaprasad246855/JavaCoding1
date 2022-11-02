package abstraction;

public class Airtel implements Sim,Sim2{

    @Override
    public void simName() {
        System.out.println("Airtel sim");
    }

    public static void main(String[] args) {
        Sim s=new Airtel();
        s.simName();
    }
}
