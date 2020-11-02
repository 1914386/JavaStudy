package boj;

import java.util.Scanner;

// *Solution: https://st-lab.tistory.com/61?category=838567

public class _11720_정수형덧셈 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String st = sc.next();
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += st.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
