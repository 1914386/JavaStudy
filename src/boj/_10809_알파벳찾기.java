package boj;

import java.util.Scanner;

public class _10809_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		// 알파벳의 위치를 나타낼 배열 alpha
		int[] alpha = new int[26];
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1; // 모든 값을 -1로 초기화
		}
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);     // ch는 해당 문자의 아스키 코드
			
			// alpha[c-97] = alpha[2] = c의 인덱스라고 생각하기
			if(alpha[ch - 97] == -1) { // i = 알파벳이 처음 등장하는 위치
				alpha[ch - 97] = i;    // 해당 알파벳의 인덱스에 i 대입
			}
		}
		
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}

	}

}
