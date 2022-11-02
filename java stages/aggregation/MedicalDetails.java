package aggregation;

public class MedicalDetails {
    public static void main(String[] args) {
        Employ e=new Employ();
        e.setDesignation("kdjhskjh");
        System.out.println(e.getDesignation());
        e.setEmpId(000);
        System.out.println(e.getEmpId());
        e.setOfficeLocation("fhdkjh");
        System.out.println(e.getOfficeLocation());
    }

    //db connection
    //check current user is higher official
    //then only data can be changed
}
