package memberData.notOverriden;

public class Honda extends Bike {

	int speedlimit=150;
	
	public static void main(String args[]){  
		  Bike objBike=new Honda();
		  System.out.println(objBike.speedlimit); //Expected output: 150
		}  
}
