package boj;

import java.util.Scanner;

public class _2475_검증수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 제곱수의 합
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			sum += num * num;
		}
		
		System.out.println(sum % 10); // 검증수
		
		sc.close();

	}

}
