package oops.ninjas;

public class Fraction {
	private int numerator;
	private int denominator;

	public static int gcd(int a, int b) {
		int min = Math.min(a, b);
		int gcd = 1;
		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		return (a * b) / gcd;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void print() {
		System.out.println(numerator + " / " + denominator);
		simplify();
	}

	public void simplify() {
		int gcd = gcd(numerator, denominator);
		this.numerator /= gcd;
		this.denominator /= gcd;
	}

	public void setNumerator(int n) {
		if (n < 0)
			return;
		this.numerator = n;
	}

	public int getNumerator() {
		return numerator;
	}

	public static void add(Fraction f1, Fraction f2) {
		int lcm = lcm(f1.denominator, f2.denominator);
		int f1_res=f1.numerator*(lcm/f1.denominator);
		int f2_res=f2.numerator*(lcm/f2.denominator);
		System.out.println(f1_res+f2_res+" / "+lcm);
	}

	public void increment(int n) {
		this.numerator = numerator + (denominator * n);
	}
}
