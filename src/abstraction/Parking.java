package abstraction;

import java.util.Calendar;

abstract class Parking {

	// Can have a constructor
	Parking(String vehicle) {
		System.out.println("Your Vehicle Type is: " + vehicle);
	}
    //abstract method
	abstract public void getRates();
	
	//can have implemented methods 
	public void getPermit(String plateNumber) {
	System.out.println("The Plate Number is: "+ plateNumber);
	Calendar c = Calendar.getInstance(); 
	System.out.println("Dated" + c.getTime());

	}

		
	}

