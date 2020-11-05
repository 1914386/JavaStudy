package boj;

import java.util.Scanner;

public class _2839_설탕배달 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 설탕 무게
		sc.close();
		
//		나의 접근방법
//		1) 5의 배수: n / 5
//		2) 5로 나눈 나머지가 3의 배수: (n % 5) / 3
//			2-1) 2)가 아니면서 3의 배수: n / 3
//			2-2) 14같이, 5의 배수보다 3의 배수가 더 필요할 때: ...
//			2-3) 2)가 아니면서 3의 배수도 아님: -1
		
//		다른 접근방법 (https://st-lab.tistory.com/72?category=841870)
//		5의 배수 + x의 관계로 접근하기: 어차피 5의 배수마다 +1이 최소일 것이니
//		5의 배수: n/5
//		5의 배수 + 1: (n/5) + (n%5) [1 제외]
//		5의 배수 + 2: (n/5) + (n%5) [2, 7 제외]
//		5의 배수 + 3: (n/5) + 1
//		5의 배수 + 4: (n/5) + 2 [4 제외]
//		1, 2, 4, 7: -1
		
		if (n == 1 || n == 2 || n == 4 || n == 7) {
			System.out.println(-1);
		}
		else if (n % 5 == 0) {
			System.out.println(n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 2) {
			System.out.println((n / 5) + (n % 5));
		}
		else if (n % 5 == 3) {
			System.out.println((n / 5) + 1);
		}
		else if (n % 5 == 4) {
			System.out.println((n / 5) + 2);
		}

	}
	
}
