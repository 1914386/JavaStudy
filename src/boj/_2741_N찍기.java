package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2741
// https://www.acmicpc.net/problem/2742

public class _2741_N찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(i + 1);
		}
		
		// 2742번 - N부터 1까지 거꾸로 나열
//		for (int i = n; i > 0; i--) {
//			System.out.println(i);
//		}
		
		sc.close();

	}

}
