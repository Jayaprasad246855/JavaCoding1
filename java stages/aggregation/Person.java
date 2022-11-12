package aggregation;

public class Person {
    int aadharId=1233;
    String name="yugu";
    String homeAddress="hyd";
    static Employ e=new Employ();
    static MedicalDetails md=new MedicalDetails();

    public static void main(String[] args) {


        Person p=new Person();
        System.out.println(p.print(e,md));
    }

    public String print(Employ e,MedicalDetails md)
    {
        return " empId="+e.getEmpId()+",\n officeLocation="+e.getOfficeLocation()+",\n designation="+e.getDesignation()+
                ",\n patientId="+md.patientId+",\n diseaseName="+md.diseaseName+",\n aadharId="+this.aadharId+",\n name="+
              this.name+",\n homeAddress="+this.homeAddress;    }
}
