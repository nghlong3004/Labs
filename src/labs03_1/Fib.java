package labs03_1;

public class Fib {
	public static int result(int n){
		if(n < 2)
			return n;
		int a = 0, b = 1, ans = 0;
		for(int i = 2; i <= n; ++i) {
			ans = a + b;
			a = b;
			b = ans;
		}
		return ans;
	}

}
