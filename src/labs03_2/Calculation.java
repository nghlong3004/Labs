package labs03_2;

import labs03_1.Gcd;

public class Calculation extends PS{
	public Calculation()
	{
		this.setMauSo(1);
		this.setTuSo(0);
	}
	public void add(PS a, PS b)
	{
		PS u = new PS(), v = new PS();
		u.setTuSo(a.getTuSo() * b.getMauSo());
		v.setTuSo(b.getTuSo() * a.getMauSo());
		u.setMauSo(a.getMauSo() * b.getMauSo());
		u.setTuSo(u.getTuSo() + v.getTuSo());
		int c = Gcd.result(u.getTuSo(), u.getMauSo());
		System.out.println(u.getTuSo() / c + " " + u.getMauSo() / c);
	}
	public void sub(PS a, PS b)
	{
		PS u = new PS(), v = new PS();
		u.setTuSo(a.getTuSo() * b.getMauSo());
		v.setTuSo(b.getTuSo() * a.getMauSo());
		u.setMauSo(a.getMauSo() * b.getMauSo());
		u.setTuSo(u.getTuSo() - v.getTuSo());
		int c = Gcd.result(u.getTuSo(), u.getMauSo());
		System.out.println(u.getTuSo() / c + " " + u.getMauSo() / c);
	}
	/*
	public void mul(PS a, PS b)
	{
		a.tuSo *= b.tuSo;
		a.mauSo *= b.mauSo;
		int c = Gcd.result(a.tuSo, a.mauSo);
		System.out.println(a.tuSo / c + " " + a.mauSo / c);
	}
	public void div(PS a, PS b)
	{
		a.tuSo *= b.mauSo;
		a.mauSo *= b.tuSo;
		int c = Gcd.result(a.tuSo, a.mauSo);
		System.out.println(a.tuSo / c + " " + a.mauSo / c);
	}
	public boolean equals(PS a, PS b)
	{
		a.tuSo *= b.mauSo;
		b.tuSo *= a.mauSo;
		a.mauSo *= b.mauSo;
		b.mauSo *= a.mauSo;
		if(a.tuSo > b.tuSo) {
			return true;
		}
		return false;
	}
	*/
	
}
