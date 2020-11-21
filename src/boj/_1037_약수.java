package boj;

import java.util.Scanner;

public class _1037_약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N의 진짜 약수의 개수 (1과 자기 자신을 제외)
		int divCount = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// N의 진짜 약수
		for (int i=0; i<divCount; i++) {
			int div = sc.nextInt();
			
			// 진짜 약수들 중 최대값, 최소값 찾아내기
			if (div > max)
				max = div;
			
			if (div < min)
				min = div;
		}
		
		sc.close();

		// 찾으려는 숫자 N = 최대값 * 최소값
		System.out.println(max * min);
		
	}

}
