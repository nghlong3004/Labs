package labs03_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		System.out.print(Gcd.result(a, b));
		int n = scan.nextInt();
		System.out.print(Fib.result(n));
		if(scan != null) {
			scan.close();
		}
	}

}
