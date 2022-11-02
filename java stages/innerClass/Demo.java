package innerClass;

class Automobile {
    static String tyres="rubber";
    String paint=" paint";
    String brakes=" brakes";

    public void display()
    {
        System.out.println("in Automobile class "+tyres+paint+brakes);
    }
     static class Car{
        String size="small";
        public void changeValue() {
            tyres = " small rubber";
            System.out.println("in car class size="+size+" changed tyre value="+tyres);
        }
         class BMW{
            String company="BMW car company";
            public void changeValue()
            {
                System.out.println(company);
            }
        }
    }
}

public class Demo{
    public static void main(String[] args) {

        Automobile.Car c=new Automobile.Car();
        c.changeValue();

        Automobile.Car.BMW bmw=c.new BMW();
        bmw.changeValue();
    }
}
