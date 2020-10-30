package boj;

import java.util.Scanner;

public class _4344_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 개수 c
		int c = sc.nextInt();
		
		// c번의 케이스동안
		for(int i=0; i<c; i++) {
			int n = sc.nextInt(); // 학생 수 n (1 이상 1000 이하, 정수)
			
			// 총점 sum, 평균 average, 평균을 넘는 학생 수 upper, 평균 초과 학생 비율 rate
			int sum = 0;
			float average = 0;
			int upper = 0;
			float rate = 0;
			
			// n명의 점수 (0 이상 100 이하, 정수)
			int[] score = new int[n];
			for(int j=0; j<n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			// 평균
			average = sum / n;
			
			// 평균 넘는 사람
			for(int k=0; k<n; k++) {
				if(score[k] > average) {
					upper++;
				}
			}
			
			// 비율
			rate = (upper / (float)n) * 100;
			
			// 셋째 자리까지 표시* (https://onecutwook.tistory.com/15)
			System.out.println(String.format("%.3f", rate) + "%");
		}
		
		sc.close();

	}

}
