class calc
{
	int real, img; 
	calc(int r, int i)
	{
			real = r;
			img = i;
	}
 
	void display()
	{
		System.out.println(real+"+"+img+"i");
	}
};
 
class Complex
{
	public static void main(String args[])
	{
		calc c1 = new calc(12, 2);
		c1.display();
	}

};