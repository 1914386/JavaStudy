package boj;

import java.util.Scanner;

public class _4948_베르트랑공준 {
	
	public static boolean[] prime; // 소수를 체크할 배열

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int sum = 0; // n 초과 2n 이하인 소수의 개수
			int n = sc.nextInt();
			
			if(n == 0)
				break;
			
			prime = new boolean[2*n + 1]; // n+1 ~ 2n
			
			getPrime();
			
			for(int i=n+1; i<=2*n; i++) {
				if(prime[i] == false)
					sum++;
			}
			
			System.out.println(sum);
		}
		
		sc.close();

	}
	
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
