# corejava_inheritance
**testng with inheritance concept tutorial**

-> Inheritance:
	Testng annontation with inheritance to remove boilerplate code
	Reduce repeated setup/teardown or utility methods across multiple test classes using inheritance.
	using "extends" keyword the parent class will be called in all the child classes.
	
Ex: Parent class: BaseTest.java

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;

	public class BaseTest {

   		@BeforeMethod
    	public void setup() {
       		System.out.println("Setting up before test...");		// e.g., initialize WebDriver or database
    	}

    	@AfterMethod
    	public void tearDown() {
        	System.out.println("Cleaning up after test...");		// e.g., close connections, quit browser
   		}

		// You can also add common utility methods here
	} 

	Child class:  LoginTest.java
	
	import org.testng.annotations.Test;
	public class LoginTest extends BaseTest {

    	@Test
    	public void testValidLogin() {
       		System.out.println("Running valid login test");				// test code here
    	}

    	@Test
    	public void testInvalidLogin() {
        	System.out.println("Running invalid login test");			// test code here
   		}
	}
	
-> Constructor: whenever we create a object in class one default constructor will be created with no parameter in it.
				But if any parameter is passed in this the object, we need to create a constructor for this object.
				constructor name will be always same as class name
				
	Eg-1: object o = new object();		// no need to create any constructor in class file, by defualt one constructor will be created in backend 
	Eg-2: object o = new object(a); 	// we need to create a constructor for the class with parameter in it
	
	
	
-> Execute the java file using testng configuration
	select the java file
	click run as and select  run configurations
	click class path and select the testng jar file to execute the java files
