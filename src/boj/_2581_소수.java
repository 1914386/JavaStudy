package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class _2581_소수 {
	
	public static boolean isPrime(int num) {
		if(num < 2)
			return false;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); // m 이상
		int n = sc.nextInt(); // n 이하
		sc.close();
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // 소수 저장 배열
		int sum = 0; // 소수의 합
		int min = 10001; // 최소값
		
		// 소수이면 배열과 sum에 추가
		for(int i=m; i<=n; i++) {
			if(isPrime(i) == true) {
				arr.add(i);
				sum += i;
			}
		}
		
		System.out.println(arr);
		
		if(arr.size() == 0) {
			System.out.println(-1); // 소수가 없으면 -1 출력
		}else {
			System.out.println(sum);
			min = arr.get(0); // 최솟값: 배열의 첫 번째 값* (https://yulsfamily.tistory.com/237)
			System.out.println(min);
		}

	}

}
