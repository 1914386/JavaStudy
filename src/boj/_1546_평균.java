package boj;

import java.util.Arrays;
import java.util.Scanner;

public class _1546_평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] originScore = new int[n];
		float[] newScore = new float[n];
				
		for(int i=0; i<n; i++) {
			originScore[i] = sc.nextInt();
		}
		
		Arrays.sort(originScore);
		int max = originScore[n-1];
		
		float sum = 0;
		float average = 0;
		
		for(int i=0; i<n; i++) {
			newScore[i] = (float)originScore[i] / max * 100;
			sum += newScore[i];
			average = sum / n;
		}
		System.out.println(average);
		sc.close();

	}

}
