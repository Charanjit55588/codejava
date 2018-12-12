/**
 * 
 */
package passingobjectasparameter;

/**
 * @author csingh
 *
 */
public class Rectangle {
	int width;
	int height;
	Rectangle(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	
	public void area(Rectangle obj) {
		int areaofRectangle = obj.width * obj.height;		
		System.out.println(areaofRectangle);
	}	

}
