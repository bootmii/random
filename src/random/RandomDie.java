package random;
import java.util.*;
public class RandomDie {
	private static Random r = new Random();
	public static int nSidedDie(int n) {
		return r.nextInt(n)+1;
	}
	public static double randomFromZeroToOne() {
		return r.nextDouble();
	}
	public static int mDn(int m, int n) {
		int result = 0;
		for(int i = 0; i < m; i++) result += nSidedDie(n);
		return result;
	}
	public static double randomBoundedDouble(double a, double b) {
		return a+((b-a)*randomFromZeroToOne());
	}
	public static void main(String[] args) {
		System.out.println("From 1d6: you rolled a "+nSidedDie(6)+'!');
		System.out.println("From 1d20: you rolled a "+nSidedDie(20)+'!');
		System.out.println("Random number between 0.0 and 1.0: "+randomFromZeroToOne());
		System.out.println("Random number between 5.0 and 6.0: "
				+randomBoundedDouble(5.0,6.0));
		System.out.println("Random number between 2.0 and 5.0: "
				+randomBoundedDouble(2.0,5.0));
		System.out.println("From 2d6: you rolled a "+mDn(2,6)+'!');
	}
}
