package variables;

public class StringsDemo {
    static char[] some={'h','e','l','l'};
    static String roles="analyst,Assoiciate,senior Associate"; //it will create in string constant pool
    static String str2=new String(some);  //it create object in heap not in string constant pool
    static String str3="string";


    public static void main(String[] args) {
        String []rolesArr=roles.split(",");
        int i=0;

//        while(i<rolesArr.length)
//        {
//            System.out.println(rolesArr.toString());
//            i++;
//        }


        //equality check(==)
        //content check(equals and equalsignorecase())

    }
}
