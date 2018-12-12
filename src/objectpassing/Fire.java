/**
 * 
 */
package objectpassing;

/**
 * @author csingh
 *
 */
public class Fire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DataSource data = new DataSource("Charanjit","Infotech");
     EPrint object = new EPrint();
     object.getUserData(data);
	}

}
