package boj;

import java.util.Scanner;

public class _2775_부녀회장이될테야 {

	public static void main(String[] args) {
		// k층 n호에는 몇 명이 살고 있는가?
		// (k-1)층의 1호부터 n호 거주자의 합만큼 살고 있음
		// 0층부터 있고, 0층 i호에는 i명이 산다.
		
		Scanner sc = new Scanner(System.in);
		
		int[][] apt = new int[15][15]; // 아파트 거주자수를 저장할 배열 apt (0층~14층 / 1호~14호 - 0호는 제외)
		for(int i=0; i<apt[0].length; i++) {
			apt[0][i] = i; // 0층 i호의 거주자는 i명
			apt[i][0] = 0; // 0호는 없으므로 0명
		}
		
		// 거주자 공식
		for(int i=1; i<15; i++) {
			for(int j=1; j<15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		int T = sc.nextInt(); // 테스트 케이스
		for(int i=0; i<T; i++) {
			int k = sc.nextInt(); // 층수
			int n = sc.nextInt(); // 호수
			
			System.out.println(apt[k][n]);
		}
		
		sc.close();

	}

}
