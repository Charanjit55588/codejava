package superwithmethods;

public class Student extends Person{
	  void message() 
	    { 
	        System.out.println("This is student class / Child class"); 
	    } 
	  void display() 
	    { 
	        // will invoke or call current class message() method 
	        message(); 
	  
	        // will invoke or call parent class message() method 
	        super.message(); 
	    } 
	  
}
