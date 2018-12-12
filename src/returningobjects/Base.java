/**
 * 
 */
package returningobjects;

/**
 * @author csingh
 * Base is the return type when returning an object in a method
 */
public class Base {
 int age;
 String name;
 Base (int age, String name){
	 this.age=age;
	 this.name=name;
 }

 public Base getData() 
 { 
	 Base objbase=new Base(30,"John");
	 return objbase; 
 }
	
}
