package polymorphism;

public class Fire1 {

	public Fire1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Login[] login = new Login[4];
		login[0] = new SucessLogin("username1", "password1");
		login[1] = new SucessLogin("username2", "password2");
		login[2] = new FailureLogin("username3", "password3");
		login[3] = new FailureLogin("username4", "password4");

		for (int i = 0; i < login.length; i++) {
			login[i].homeScreen();

		}
	}

}
