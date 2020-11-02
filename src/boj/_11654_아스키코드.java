package boj;

import java.util.Scanner;

public class _11654_아스키코드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char alpa = sc.nextLine().charAt(0);
		int ascii = (int)alpa;
		
		System.out.println(ascii);
		
		sc.close();

	}

}
