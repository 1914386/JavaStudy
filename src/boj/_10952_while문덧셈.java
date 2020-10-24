package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10952

public class _10952_while문덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 10952번: 종료 조건이 있을 때
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0)
				break;
			System.out.println(x + y);
		}
		
		// 10951번: 종료 조건이 없을 때
		// 도움 받은 자료: https://wanna-b.tistory.com/59
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
//			if(x == 0 && y == 0)
//				break;
			System.out.println(x + y);
		}
	}

}
