package boj;

import java.util.Scanner;

public class _1065_한수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.println(hansu(N));

	}
	
	static int hansu(int x) {
		// 한수의 개수
		int sum = 0;
		
		// 1부터 N까지 중 한수의 개수
		for(int i=1; i<=x; i++) {
			// 문자열로 변환하여 각 숫자 별로 비교
			String str = Integer.toString(i);
			
			// 두 자리 수 이하면 무조건 한수
			if(str.length() <= 2) {
				sum++;
			}
			// 세 자리 수 이상: 각 자리 수가 등차수열이어야 한수
			else {
				if(x == 1000) x = 999; // 예외처리*
				for(int j=0; j<str.length()-2; j++) {
					if(str.charAt(j+1) - '0' - str.charAt(j) - '0' == str.charAt(j+2) - '0' - str.charAt(j+1) - '0')
						sum++;
				}
			}
		}
		
		return sum;
	}

}
