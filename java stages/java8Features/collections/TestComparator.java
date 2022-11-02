package java8Features.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class IdComparator implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.rollno==s2.rollno)
            return 0;
        else if(s1.rollno>s2.rollno)
            return 1;
        else
            return -1;
    }
}
public class TestComparator{
    public static void main(String args[]){
//Creating a list of students
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name");
        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("sorting by Age");
        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println("sort by id");
        Collections.sort(al,new IdComparator());

        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}
