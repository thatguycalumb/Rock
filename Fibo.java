class Fibo
{
	public static void main(String args[])
	{
		long[] num = new long[50];
		num[0] = num[1] = 1;
		
		for(int x = 2; x <=49; x++) num[x] = num[x-1] + num[x-2];
		for(int x = 0; x<=49; x++) System.out.println(num[x]);
	}
}