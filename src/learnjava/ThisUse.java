package learnjava;

/*
*Java code for using 'this' keyword to 
*refer current class instance variables 
*/
public class ThisUse {
  
   String username;
// Parameterized constructor 
	ThisUse(String username){
		this.username = username;
		System.out.println(username);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisUse obj = new ThisUse("Charanjit");
 
	}

}
