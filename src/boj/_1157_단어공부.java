package boj;

import java.util.Scanner;

public class _1157_단어공부 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		// 알파벳의 개수를 나타낼 배열 alpha
		int[] alpha = new int[26];
		
		// 최댓값 max
		int max = -1;
		
		// 출력할 문자형 변수 ch
		char result = ' ';
		
		// alpha 배열에 개수 저장 (대,소문자 상관 없이)
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				alpha[ch - 65]++; // 대문자
			}
			
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				alpha[ch - 97]++; // 소문자
			}
		}
		
		// 가장 많이 나온 알파벳 출력* (https://st-lab.tistory.com/64?category=838567)
		for (int i=0; i<alpha.length; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				result = (char)(i + 65);
			}
			else if(alpha[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);

	}

}
