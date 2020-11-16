package boj;

import java.util.Scanner;

public class _1929_소수구하기 {
	
	public static boolean[] prime; // 소수를 체크할 배열

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		prime = new boolean[n + 1]; // 0 ~ n
		
		getPrime();
		
		for(int i=m; i<=n; i++) {
			if(prime[i] == false)
				System.out.println(i);
		}
		
		sc.close();
		
	}
	
	// 에라토스테네스의 체* (https://st-lab.tistory.com/81)
	public static void getPrime() {
		
		// 합성수: true / 소수: false
		prime[0] = prime[1] = true; // 2 미만의 수는 소수가 아님
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i] == true)
				continue; // 이미 체크된 배열이면 다음 반복문으로 스킵
			
			for(int j=i*i; j<prime.length; j=j+i) {
				prime[j] = true; // i의 배수들은 소수가 아님
			}
		}
		
	}
	
}
