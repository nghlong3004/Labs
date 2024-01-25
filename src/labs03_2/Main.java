package labs03_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation a = new Calculation(), b = new Calculation();
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a and b respectively : " + '\n');
		a.setTuSo(scan.nextInt());
		a.setMauSo(scan.nextInt());
		b.setTuSo(scan.nextInt());
		b.setMauSo(scan.nextInt());
		Calculation c = new Calculation();
		a.add(a, b);
		a.sub(a, b);
		if(scan != null) {
			scan.close();
		}
	}

}
