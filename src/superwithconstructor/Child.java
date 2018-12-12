/**
 * 
 */
package superwithconstructor;

/**
 * @author csingh
 *
 */
public class Child extends Base
{
Child(){
	// invoke or call parent class constructor 
	//Call to super() must be first statement in Derived(Student) Class constructor.
	super();
	System.out.println("Child class constructor ");
	
}
}
