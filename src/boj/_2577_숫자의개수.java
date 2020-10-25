package boj;

// 도움받은 자료: https://javacoding.tistory.com/89

import java.util.Scanner;

public class _2577_숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a * b * c;
		String str = Integer.toString(result);   // 문자열로 변환* (https://coding-factory.tistory.com/130)
		sc.close();
		
		String[] arr = str.split("");			 // 문자열 하나씩 배열에 저장* (https://coding-factory.tistory.com/130)

		for(int i=0; i<10; i++) {				 // 0부터 9까지의 숫자를 비교
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if((str.charAt(j) - '0') == i) { // 배열의 위치를 나타내는 메소드 charAt*
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}
