package boj;

import java.util.Scanner;

public class _2675_문자열반복 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스의 개수 T
		int T = sc.nextInt();
		
		// T번 동안 반복횟수 R과 문자열 S를 입력받음
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			// S를 글자 별로 R번씩 반복 출력
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++)
					System.out.print(S.charAt(j));
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
