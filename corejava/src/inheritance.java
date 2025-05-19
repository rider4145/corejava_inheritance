import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class inheritance{

	public void First()
	{
		System.out.println("First inheritance class");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("I will begin");
	}

	@AfterMethod
	public void after()
	{
		System.out.println("I am done");
	}
	
	@BeforeTest
	public void testbefore()
	{
		System.out.println("test begins");
	}
}
