package boj;

import java.util.Scanner;

public class _2884_알람시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 시간
		int M = sc.nextInt(); // 분
		
		if (M >= 45 && M <= 59) { // 45분-59분: 시는 동일, 분은 -45
			System.out.println(H + " " + (M - 45));
		}else if (H != 0 && M <= 44 && M >= 0) { // (0시가 아닐 때) 0분-44분: 시는 -1, 분은 +60-45
			System.out.println((H-1) + " " + ((M+60)-45));
		}else if (H == 0 && M <= 44 && M >= 0) { // (0시일 때) 0분-44분: 시는 +24-1, 분은 +60-45
			System.out.println(((H+24)-1) + " " + ((M+60)-45));
		}
		
		sc.close();

	}

}
