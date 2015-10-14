package random;
import java.util.*;
public class RandomDie {
	private static Random r = new Random();
	public static int nSidedDie(int n) {
		return r.nextInt(n);
	}
	public static double randomFromZeroToOne() {
		return r.nextDouble();
	}
	public static int mDn(int m, int n) {
		int result = 0;
		for(int i = 0; i < m; i++) result += nSidedDie(n);
		return result;
	}
}
