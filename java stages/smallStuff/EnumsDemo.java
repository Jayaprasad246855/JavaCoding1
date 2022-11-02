package smallStuff;

import java8Features.Drinks;

public class EnumsDemo {
    enum Priority{
        low(5),Medium(10),High(15);
        int age;
        private Priority(int age)
        {
            this.age=age;
        }
    }

    public static void main(String[] args) {
        for(Priority s:Priority.values())
        {
            System.out.println(s.age);
        }
    }
}
