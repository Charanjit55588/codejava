/**
 * 
 */
package polymorphism;

/**
 * @author csingh
 *
 */
 public class Login {

	/**
	 * Super class
	 */
	private String uname;
	private String pass;
	public Login(String uname, String pass) {
		this.uname=uname;
		this.pass=pass;
		
		// TODO Auto-generated constructor stub
	}
	
	public void setlogin() {
		String email=uname;
		String password=pass;
		System.out.println(email + password +  "Enetered Click");
	}
	
    public void homeScreen() {
    	setlogin() ;
    	System.out.println("Login Screen");
    }

}
