package boj;

import java.util.Scanner;

public class _8958_OX퀴즈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] result = new String[n];
		
		for(int i=0; i<result.length; i++) {
			// OX 답 입력받기
			result[i] = sc.next();
			
			// 연속 횟수 count, 점수를 보관할 정수형 변수 score
			int count = 0;
			int score = 0;
			
			// 배열 문자를 하나씩 비교* (https://st-lab.tistory.com/50?category=833672)
			for(int j=0; j<result[i].length(); j++) {
				if(result[i].charAt(j) == 'O') {
					count++;
				}else if(result[i].charAt(j) == 'X') {
					count = 0;
				}
				score += count;
			}
			System.out.println(score);
		}
		
		sc.close();
		
	}

}
