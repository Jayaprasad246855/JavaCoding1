package innerClass;

class Automobile {
    static String tyres="rubber";
    String paint=" Dark red";
    String brakes=" Hydralic brakes ";

    public void display()
    {
        System.out.println("in Automobile class =  "+tyres +" , "+paint+" , "+brakes);
    }
     static class Car{
        String size="Mega wheel";
        public void changeValue() {
            tyres = "synthatic rubber";
            System.out.println("in car class size = " +size+",changed tyre value = " +tyres);
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

        Automobile.Car car=new Automobile.Car();
        car.changeValue();

        Automobile.Car.BMW bmw = car.new BMW();
        bmw.changeValue();
        
        Automobile automobile = new Automobile();
        automobile.display();
    }
}
