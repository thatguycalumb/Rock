class Count
{
	public static void main(String args[])
	{
	
		int z = 0;
	
		for(int x = 1; x<1000; x++)
		{
			if((x % 3 == 0) || (x % 5 == 0)) z += x;
		}
		
		System.out.println(z);
	}
}