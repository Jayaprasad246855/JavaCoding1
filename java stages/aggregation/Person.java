package aggregation;

public class Person {
	long aadharId = 561260604;
	String name = "Jaya Prasad";
	String homeAddress = "Andhra Pradesh";
	static Employ e = new Employ();
	static MedicalDetails md = new MedicalDetails();

	public static void main(String[] args) {

		Person p = new Person();
		//System.out.println(p.print(e, md));
		e.setEmpId(12444);
		e.setDesignation("Associate consultant");
		e.setOfficeLocation("Hyderabad");
		md.patientId = 33444;
		md.diseaseName = "typhoid";
		System.out.println("empId=" + e.getEmpId() 
				+ ",\n officeLocation=" + e.getOfficeLocation()
				+ ",\n designation="
				+ e.getDesignation() 
				+ ",\n patientId=" + md.patientId 
				+ ",\n diseaseName=" + md.diseaseName
				+ ",\n aadharId=" + p.aadharId 
				+ ",\n name=" + p.name 
				+ ",\n homeAddress=" + p.homeAddress);
	}

	/*
	 * public String print(Employ e,MedicalDetails md) {
	 * 
	 * return " empId="+e.getEmpId()+",\n officeLocation="
	 * +e.getOfficeLocation()+",\n designation="+e.getDesignation()+
	 * ",\n patientId="+md.patientId+",\n diseaseName="+md.diseaseName+
	 * ",\n aadharId="+this.aadharId+",\n name="+
	 * this.name+",\n homeAddress="+this.homeAddress; }
	 */
}
