package p1;
class Demo
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
	
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
	
	public static Demo getInstance()
	{
		Demo obj=new Demo();
		return obj;
	}
}
public class SampleDemo {
	public static void main(String[] args) {
		Demo.getInstance().addition(20, 60);

		Demo o1=Demo.getInstance();
		o1.multiplication(12, 10);
	}

}
