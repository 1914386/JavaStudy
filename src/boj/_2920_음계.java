package boj;

import java.util.Scanner;

public class _2920_음계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] sound = new int[8];
		
		for(int i=0; i<sound.length; i++) {
			sound[i] = sc.nextInt();
		}
		sc.close();
		
		String result = "";
		
		for(int i=0; i<sound.length-1; i++) {
			if(sound[i+1] - sound[i] == 1)
				result = "ascending";
			else if(sound[i+1] - sound[i] == -1)
				result = "descending";
			else{
				result = "mixed";
				break;
			}
		}
		
		System.out.println(result);
		
	}

}
