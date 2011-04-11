package net.egork.y2011.m4.d10.codeforcesbetaround66;

import net.egork.arrays.ArrayUtils;
import net.egork.arrays.ArrayWrapper;
import net.egork.numbers.IntegerUtils;
import net.egork.utils.io.InputReader;
import net.egork.utils.Solver;

import java.io.PrintWriter;
import java.util.Arrays;

public class TaskE implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int n = in.readInt();
		int x = in.readInt();
		int[] a = in.readIntArray(n);
		if (x == 2) {
			out.println(0);
			return;
		}
		if (n == 0) {
			out.println(-1);
			return;
		}
		Arrays.sort(a);
		if (a[0] == 1) {
			out.println(1);
			return;
		}
		int[] primes = IntegerUtils.generatePrimes(Math.min(1300000, x));
		if (ArrayUtils.isSubSequence(ArrayWrapper.wrap(a), ArrayWrapper.wrap(primes)))
			out.println(primes.length);
		else
			out.println(-1);
	}
}
