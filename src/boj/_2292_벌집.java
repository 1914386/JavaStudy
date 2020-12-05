package boj;

import java.util.Scanner;

public class _2292_벌집 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 목적지 N
		sc.close();
		
		System.out.println(distance(N));

	}
	
	public static int distance(int num) {
		// 거리(cnt): 1 /  2  /  3   /   4   /   5   / ...
		// 목적지(N): 1 / 2-7 / 8-19 / 20-37 / 38-61 / ...
		// 공차(6*k): - / +6  / +12  /  +18  /  +24  / ...
		
		int cnt = 1;
		int sum = 2;
		
		if(num == 1) return 1;
		while(num >= sum) sum += 6*(cnt++);
		
		return cnt;
	}

}
