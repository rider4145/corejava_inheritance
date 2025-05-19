
public class inheritance2 extends superclass {
	
	int a,b;								// this is a global/class variable which is defined inside a class
	
	public inheritance2(int a) {			// variable inside the constructor is called as instance variable. this is defined 
		
		super(a);							// When super is defined, it will activate/ invoke the parent class constucotr inside the child class
		this.a=a;							//this.a refers to current class/global variable
		this.b=a;							//this.b refers to current class/global variable
	}

	public int increment()
	{
		a = a+1;
		return a;
	}
	
	public int decrement()
	{
		b = b-2;
		return b;
	}
}
