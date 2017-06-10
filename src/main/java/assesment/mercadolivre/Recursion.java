package assesment.mercadolivre;

import java.math.BigInteger;

public class Recursion {
	
	public static int doRecursion(int base, int exp) {
		if(exp == 0)
			return 0;
		int result = doRecursion(base, exp-1);
		BigInteger bbase = BigInteger.valueOf(base);
		System.out.println(bbase.pow(exp) );
		return result;
	}
	
	public static void main(String[] args) {
		doRecursion(2,256);
	}
}
