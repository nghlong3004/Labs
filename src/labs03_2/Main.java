package labs03_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PS a = new PS(), b = new PS();
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a and b respectively : " + '\n');
		a.tuSo = scan.nextInt();
		a.mauSo = scan.nextInt();
		b.tuSo = scan.nextInt();
		b.mauSo = scan.nextInt();
		Calculation.add(a, b);
		Calculation.sub(a, b);
		Calculation.mul(a, b);
		Calculation.div(a, b);
		Calculation.equals(a, b);
		if(scan != null) {
			scan.close();
		}
	}

}
