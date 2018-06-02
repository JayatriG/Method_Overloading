class PrintData
{
	void print(int data)
	{
		System.out.println("The value is :"+data);
	}
	void print(float data)
	{
		System.out.println("The value is: "+data);
	}
	void print(char data)
	{
		System.out.println("The value is: "+data);
	}
	public static void main(String args[])
	{
		PrintData obj=new PrintData();
		obj.print(23);
		obj.print(3.56f);
		obj.print('J');
	}
}