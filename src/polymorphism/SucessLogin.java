/**
 * 
 */
package polymorphism;

/**
 * @author csingh
 *
 */
public class SucessLogin extends Login{

	/**
	 * 
	 */
	public SucessLogin(String uname, String pass) {
		super(uname, pass);
		// TODO Auto-generated constructor stub
	}
	
	public void homeScreen() {
		setlogin();
		System.out.println("Successful login");
	}

}
