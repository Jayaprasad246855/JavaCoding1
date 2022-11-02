package variables;

public class Cloning implements Cloneable{
    public String var;
    public void display()
    {
        System.out.println(var);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cloning c1=new Cloning();
        c1.var="c1";
        c1.display();
        Cloning c2=(Cloning)c1.clone();
        c2.display();
        c2.var="changed";
        
        c2.display();


    }
}
// var1
// changed
//changed