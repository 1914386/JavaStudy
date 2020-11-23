package boj;

import java.util.Scanner;

public class _2908_상수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.next();
		String n2 = sc.next();
		
		sc.close();
		
		int rev1 = 0;
		int rev2 = 0;
		
		// charAt(2)*10^2 + charAt(1)*10^1 + charAt(0)*10^0
		// m의 n제곱: Math.pow(m, n)
		for(int i=2; i>=0; i--) {
			rev1 += (n1.charAt(i) - '0') * Math.pow(10, i);
			rev2 += (n2.charAt(i) - '0') * Math.pow(10, i);
		}
		
//		System.out.println(rev1 + " " + rev2);
		
		if(rev1 > rev2)
			System.out.println(rev1);
		else if(rev1 < rev2)
			System.out.println(rev2);

	}

}
