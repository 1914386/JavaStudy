package boj;

// https://www.acmicpc.net/problem/2438
// https://www.acmicpc.net/problem/2439

// 도움을 받은 자료 출처: https://pridiot.tistory.com/38

import java.util.Scanner;

public class _2438_for별찍기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 2438번 - 왼쪽으로 정렬하여 별 찍기
		for (int i=1; i<=n; i++) {		// 행 (1부터 n까지 증가하는 변수 i)
			for (int j=1; j<=i; j++) {  // 열 (1부터 i까지 증가하는 변수 j)
				System.out.print("*");  // i행 j열에 * 출력
			}
			System.out.println();		// 행별로 출력하기 위한 줄바꿈
		}
		
//		(1,1)
//		(2,1) (2,2)
//		(3,1) (3,2) (3,3)
//		(4,1) (4,2) (4,3) (4,4)
//		(5,1) (5,2) (5,3) (5,4) (5,5)
		
		
		// 2439번 - 오른쪽으로 정렬하여 별 찍기
//		for (int i=1; i<=n; i++) {
//			for (int j=n; j>0; j--) {
//				
//				if(j > i) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
		
		sc.close();

	}

}
