
public class superclass {

	int a,b;
	public superclass(int a) {
		
		this.a=a;
		this.b=a;
	}

	public int multiply()
	{
		a = a*4;
		return a;
	}
	
	public int divide()
	{
		b = b/2;
		return b;
	}
}