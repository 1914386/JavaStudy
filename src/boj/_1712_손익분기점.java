package boj;

import java.util.Scanner;

public class _1712_손익분기점 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 고정 비용(임대료 등)
		int b = sc.nextInt(); // 가변 비용(노트북 생산비)
		int c = sc.nextInt(); // 노트북 가격
		
		sc.close();
				
		// 총비용 = a + b * n
		// 총수입 = c * n
		// 손익분기점 = n > a / (c - b)을 만족하는 자연수 n
		// n = (a / (c - b)) + 1

		if(c <= b) {
			System.out.println(-1);
		}else {
			System.out.println((a / (c - b)) + 1);
		}

	}

}
