package programmers;

import java.util.*;

public class L1_자릿수덧셈 {
	
//	n = 987
//  n / 10; // 98
//  n % 10; // 7*
//    
//  (n / 10) / 10; // 9
//  (n / 10) % 10; // 8*
//    
//  ((n / 10) / 10) / 10; // 0 -> 루프 탈출
	
	public static int solution(int n) {
		int answer = 0;
		while(n >= 1) {
			answer += n % 10;
			n = n / 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextInt()));
		sc.close();
	}

}
