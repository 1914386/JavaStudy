package boj;
import java.util.Scanner;

public class SMUPC_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 알파벳 소문자로만 이루어진 단어 S. 길이는 10 이하
		String S = sc.next();
		
		// 각 알파벳 별로 출력
		for(int i=0; i<S.length(); i++) {
			char alpha = S.charAt(i); // 각 알파벳
			int ascii = (int)alpha;   // 아스키 코드 값
			int result = 0;			  // 아스키 코드 값의 자릿수 합 (초기화)
			
			// 아스키 코드 값의 각 자릿수 합
			while(ascii > 0) {
				result += ascii % 10;
				ascii = ascii / 10;
			}
			
			// result 수 만큼 문자열 반복 출력
			for (int j=0; j<result; j++) {
				System.out.print(alpha);
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
