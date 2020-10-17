package boj;

import java.util.Scanner;

public class _1001_뺄셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하시오: "); // 입력받는 명령어도 추가했다. 실제 문제에서는 넣지 않아도 된다.
		int a = sc.nextInt();
		System.out.println("b를 입력하시오: "); // 입력받는 명령어도 추가했다. 실제 문제에서는 넣지 않아도 된다.
		int b = sc.nextInt();
		System.out.println("a - b = " + (a-b));
		sc.close();

	}

}
