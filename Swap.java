class Swap
{
	void operation(int a,int b)
	{
		System.out.println("Before swapping:"+a+"  "+b);
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping:" +a+"  "+b);
	}
	void operation(double a,double b)
	{
		System.out.println("Before swapping:"+a+"  "+b);
		double t;
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping:"+a+"  "+b);
	}
	public static void main(String args[])
	{
		Swap s1=new Swap();
		s1.operation(45,67);
		s1.operation(7.8,2.3);
	}
}