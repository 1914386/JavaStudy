package boj;

import java.util.Scanner;

public class _2869_달팽이_시간초과ver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 낮에 올라간 거리
		int b = sc.nextInt(); // 밤에 미끄러진 거리
		int v = sc.nextInt(); // 정상 높이
		
		sc.close();
		
		int now = 0; // 현재 위치
		int day = 0; // 걸린 날짜
		
		while(now < v) {
			day++;
			now += a;
			System.out.println("낮: " + now);
			if (now >= v)
				break;
			now -= b;
			System.out.println("밤: " + now);
		}
		System.out.println("걸린 날: " + day + "일");
	}

}
