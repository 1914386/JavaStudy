package boj;

import java.util.Scanner;

public class _2562_최댓값 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[9];
		int maxNum = array[0];
		int maxIndex = 0;
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i] > maxNum) {
				maxNum = array[i];
				maxIndex = i + 1;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(maxIndex);
		
		sc.close();

	}

}
