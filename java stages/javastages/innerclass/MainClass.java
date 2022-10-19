package javastages.innerclass;

class World {
	
	
	int numofCountries;
	String namesOfCountries = "India \n,USA \n,China";

	public void display() {

		System.out.println(namesOfCountries.split(","));
	}

	static class Countries {

		String nameOfStates = "Ap, Telangana";
		int numofStates;

		public void display() {
			System.out.println("trying to changes the values in innerclass");
		}

		static class Districts {

			String nameOfDistricts = "Krishan, YSR,East Godavari";
			int numofDistricts;

			public void display() {
				System.out.println("nameOfDistricts");
			}
		}
	}
}

public class MainClass{

	public static void main(String[] args) {
		
		World obj= new World();
		obj.numofCountries=obj.namesOfCountries.split(",").length;
		String x =obj.namesOfCountries;
		obj.display();
		System.out.println(x);
		System.out.println(obj.numofCountries);
		
		
		World.Countries obj1 = new World.Countries();
		
		obj1.display();
		
		World.Countries.Districts obj2 = new World.Countries.Districts();
		
		obj2.display();
		
	}
}
