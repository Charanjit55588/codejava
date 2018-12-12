/**
 * 
 */
package overriding;

import overriding.Base;
import overriding.Child;

/**
 * @author csingh
 * Main class / Driver Class
 *
 */
public class Mains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
		Base Obj1 = new Base();
		Obj1.show();
		
		// If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM
		Base Obj2  = new Child();
		Obj2.show();

	}

}
