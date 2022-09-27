package javaBasics;

interface NormalBike{
	public void speed();
	void fourGyres();
}
interface SportsBike{
	void highSpeed();
	void sixGyres();
}
class NormalBikeFeature implements NormalBike
{
	public void speed(){
		System.out.println("Normal bike speed is only 220 km per hour :" );
	}
	public void fourGyres(){
		System.out.println("Normal bike have only four gyres :");
	}
}
class SportsBikeFeatures implements NormalBike, SportsBike
{	
	
	public void speed(){
		System.out.println("Basic bike speed is only above 300 km per hour :" );
	}
	public void fourGyres(){
		System.out.println("Basic Model bike have only four gyres :");
	}
	public void highSpeed(){
		System.out.println("Highend Model bike having above 400 km/per");
	}
	public void sixGyres(){
		System.out.println("Highend Model bike having six gyres");
	}
}
public class InterfaceExample
{
	public static void main(String args[]){
	
		NormalBikeFeature obj = new NormalBikeFeature();
		obj.speed();
		obj.fourGyres();
		
		SportsBikeFeatures obj1 = new SportsBikeFeatures();
		obj1.speed();
		obj1.fourGyres();
		obj1.highSpeed();
		obj1.sixGyres();
	}
}
	