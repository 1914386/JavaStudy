package boj;

import java.util.Scanner;

public class _8958_OX퀴즈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		sc.close();
		
		
		for(int i=0; i<arr.length; i++) {
			
			// 연속 횟수 count, 점수를 보관할 정수형 변수 score
			int count = 0;
			int score = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == "O") {
					count++;
				}else if(arr[i].charAt(j) == "X") {
					count = 0;
				}
				score += count;
			}
			System.out.println(score);
		}
		
		
	}

}
