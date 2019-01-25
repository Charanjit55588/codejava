package abstraction;

public class Fire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reference of the Abstract is created for both the Car and Bike classes
		//Cannot create the Object of the Abstract class e.g. Parking obj=new Parking();
		Parking Objcar=new Car("Jeep");
		Objcar.getRates();
		Objcar.getPermit("L5TYUN");
		
		Parking Objbike=new Bike("Mountain");
		Objbike.getRates();
		Objbike.getPermit("None");
	

	}

}
