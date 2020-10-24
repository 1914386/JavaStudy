package boj;

// https://www.acmicpc.net/problem/1110
// 도움받은 자료: https://st-lab.tistory.com/42

import java.util.Scanner;

public class _1110_더하기사이클 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();	// 입력받은 수
		int num_copy = num;     // 입력받은 수를 복사하여 변수 num_copy에 보관*
		int count = 0;			// 사이클 반복 횟수
		
		while(true) {
			num = ((num%10) * 10) + (((num/10) + (num%10)) % 10); // 새로운 수 대입*
			count++;
//			System.out.println(num); // 숫자 변화과정
			if(num == num_copy)
				break;
		}
		
		System.out.println(count);
		sc.close();
		
	}

}
