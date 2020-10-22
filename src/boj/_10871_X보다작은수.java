package boj;

// https://www.acmicpc.net/problem/10871
// 도움받은 자료: https://hojak99.tistory.com/75 (입력받은 자료를 배열에 저장하는 법)

import java.util.Scanner;

public class _10871_X보다작은수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
//		int[] arr = new int[n];
//		int num;
//		
//		for (int i=0; i<arr.length; i++) {
//			num = sc.nextInt();
//			arr[i] = num;
//			
//			if(arr[i] < x) {
//				System.out.print(arr[i] + " ");
//			}
//		}
		
		// 훨씬 더 간단한 방법
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a < x)
				System.out.print(a + " ");
		}
		
		sc.close();

	}

}
