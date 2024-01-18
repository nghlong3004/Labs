package labs03_2;

import labs03_1.Gcd;

public class Calculation{
	public static void add(PS a, PS b)
	{
		int at = a.tuSo, am = a.mauSo;
		int bt = b.tuSo, bm = b.mauSo;
		a.tuSo *= b.mauSo;
		b.tuSo *= a.mauSo;
		a.mauSo *= b.mauSo;
		a.tuSo += b.tuSo;
		int c = Gcd.result(a.tuSo, a.mauSo);
		System.out.println(a.tuSo / c + " " + a.mauSo / c);
		a.tuSo = at;
		a.mauSo = am;
		b.tuSo = bt;
		b.mauSo = bm;
	}
	public static void sub(PS a, PS b)
	{
		int at = a.tuSo, am = a.mauSo;
		int bt = b.tuSo, bm = b.mauSo;
		a.tuSo *= b.mauSo;
		b.tuSo *= a.mauSo;
		a.mauSo *= b.mauSo;
		a.tuSo -= b.tuSo;
		int c = Gcd.result(a.tuSo, a.mauSo);
		System.out.println(a.tuSo / c + " " + a.mauSo / c);
		a.tuSo = at;
		a.mauSo = am;
		b.tuSo = bt;
		b.mauSo = bm;
	}
	public static void mul(PS a, PS b)
	{
		int at = a.tuSo, am = a.mauSo;
		int bt = b.tuSo, bm = b.mauSo;
		a.tuSo *= b.tuSo;
		a.mauSo *= b.mauSo;
		int c = Gcd.result(a.tuSo, a.mauSo);
		System.out.println(a.tuSo / c + " " + a.mauSo / c);
		a.tuSo = at;
		a.mauSo = am;
		b.tuSo = bt;
		b.mauSo = bm;
	}
	public static void div(PS a, PS b)
	{
		int at = a.tuSo, am = a.mauSo;
		int bt = b.tuSo, bm = b.mauSo;
		a.tuSo *= b.mauSo;
		a.mauSo *= b.tuSo;
		int c = Gcd.result(a.tuSo, a.mauSo);
		System.out.println(a.tuSo / c + " " + a.mauSo / c);
		a.tuSo = at;
		a.mauSo = am;
		b.tuSo = bt;
		b.mauSo = bm;
	}
	public static boolean equals(PS a, PS b)
	{
		int at = a.tuSo, am = a.mauSo;
		int bt = b.tuSo, bm = b.mauSo;
		a.tuSo *= b.mauSo;
		b.tuSo *= a.mauSo;
		a.mauSo *= b.mauSo;
		b.mauSo *= a.mauSo;
		if(a.tuSo > b.tuSo) {
			a.tuSo = at;
			a.mauSo = am;
			b.tuSo = bt;
			b.mauSo = bm;
			return true;
		}
		else {
			a.tuSo = at;
			a.mauSo = am;
			b.tuSo = bt;
			b.mauSo = bm;
			return false;
		}
	}
	
}
