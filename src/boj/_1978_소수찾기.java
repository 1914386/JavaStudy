package boj;

import java.util.Scanner;

public class _1978_소수찾기 {
	
	// *소수 구하는 법: https://myjamong.tistory.com/139
	public static boolean isPrime(int num) {
		// 2 미만의 수는 소수가 아님
		if(num < 2)
			return false;
		
		// num을 2부터 num-1까지 나누었을 때 나머지가 한 번이라도 0이 나오면 소수가 아님
		for(int i=2; i<num; i++) {
			if(num % i == 0)
				return false;
		}
		
		// 이외의 경우 전부 소수
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 소수의 개수를 출력할 변수 count
		int count = 0;
		
		// n개의 숫자를 입력받아 소수이면 count가 1 증가
		for(int i=0; i<n; i++) {
			int number = sc.nextInt();
			if(isPrime(number) == true) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();	

	}

}
