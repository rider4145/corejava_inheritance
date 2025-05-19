import org.testng.annotations.Test;
														// This is how u will connect testng annontation with inhertiance to remove boilerplate code
public class inheritance1 extends inheritance{			// using this inheritance user can call the parent class using extends Keyword and it will inherit all thhe methods inside the parent class 
														// if Before or after annotation is used in parent class, this class will inherit those methods and execute those methods too. 
	@Test
	public void testRun()
	{
		int a = 4;
		First();
		inheritance2 b = new inheritance2(a);			//parameterized constructor
		System.out.println(b.increment());
		System.out.println(b.decrement());
		
		System.out.println(b.multiply());
		System.out.println(b.divide());
	}
}
