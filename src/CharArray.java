public class CharArray {

	public char array[];
	public static int countobjects;
	 
	public CharArray(char[] param)
	{
		this.array = param;
		countobjects++;
	}

	public void print()
	{
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i]);
			System.out.println(countobjects);
		}
	}
	public void print(int start, int end)
	{
		if (start > 0 && start <= end && end <= array.length)
		for (int i=start; i < end; i++)
		{
			System.out.print(array[i]);
			System.out.println(countobjects);
		}
	}
	public int length()
	{
		return array.length;
	}
	
}
