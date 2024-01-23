package labs04;

public class Math {
	public static int max(int a, int b) {
		if(a < b)
			return b;
		return a;
	}
	public static int minElement(int [] a) {
		for(int i = 0; i < a.length; ++i) {
			a[0] = -max(-a[i], -a[0]);
		}
		return a[0];
	}
	public static double BMI(double a, double b) {
		return (a / (b * b));
	}
	
}
