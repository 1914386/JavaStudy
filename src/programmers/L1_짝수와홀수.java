package programmers;

import java.util.Scanner;

// https://programmers.co.kr/learn/courses/30/lessons/12937
// 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수 solution

public class L1_짝수와홀수 {

	public static String solution(int num) {
		String answer = "";
		if(num % 2 == 0) answer = "Even";
		else answer = "Odd";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextInt()));
		sc.close();

	}

}
