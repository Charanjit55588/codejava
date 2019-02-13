package polymorphism;

public class FailureLogin extends Login{

	public FailureLogin(String uname, String pass) {
		super(uname,pass);
		// TODO Auto-generated constructor stub
	}
	
	public void homeScreen() {
		setlogin();
		System.out.println("Faliure Login");
	}

}
