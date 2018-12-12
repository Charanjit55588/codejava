/**
 * 
 */
package encapsulation;

/**
 * @author csingh Java program to demonstrate encapsulation
 */
public class SetEncapsulation {

	// private variables declared and these can only be accessed through public
	// methods of class

	private String username;
	private String password;

	// get method to read the value of private variables

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	// set methods to write the value for private variables

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
