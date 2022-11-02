package java8Features.generics;

public class Demo <T>{
    public T obj;
    public Demo(T obj)
    {
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
