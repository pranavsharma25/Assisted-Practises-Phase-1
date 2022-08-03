package accessModifiers;

public class SumInrange {

	static int sumInRange(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	static int sumInRange(int l, int r) {
		return sumInRange(r) - sumInRange(l - 1);
	}

	public static void main(String[] args) {
		int l = 5, r = 9;
		System.out.println("Sum of the numbers from L to R is " + sumInRange(l, r));

	}

}
