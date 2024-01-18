package labs03_1;

public class Gcd {
	public static int abs(int a)
	{
		if(a < 0)
			return -a;
		return a;
	}
	public static int result(int a, int b)
	{
		if(a == 0)
			return b;
		return result(abs(b) % abs(a), abs(a));
	}
	
}
