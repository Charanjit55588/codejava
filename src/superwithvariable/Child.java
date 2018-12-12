/**
 * 
 */
package superwithvariable;
import superwithvariable.Base;

/**
 * @author csingh
 *
 */
public class Child extends Base
{

String car = "Mercedes";
public void showCar() {
	System.out.println(super.car);
	// shows the car of the base class with the help of Super
	}

}
