class test
{
	public static void main(String args[])
	{
		int num = 0;

		for(int i=0;i<500;i++)
		{
			num = count(num);
		}

	}

	private static int count(int num)
	{
		num++;
		System.out.println(num);
		return num;
	}
}