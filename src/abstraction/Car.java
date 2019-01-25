package abstraction;

public class Car extends Parking {

	Car(String vehicle) {
		super(vehicle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getRates() {
		// TODO Auto-generated method stub
		System.out.println("$5/hr");
	}

}
