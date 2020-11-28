package boj;

import java.util.Scanner;

public class _10250_ACM호텔 {

	public static void main(String[] args) {
		// 호텔 정문(=엘리베이터)으로부터 가장 짧은 거리에 있는 방을 선호
		// 엘리베이터를 타고 이동하는 거리는 고려하지 않음 -> 층수 상관 없이 호수가 낮을 수록 선호
		// 걷는 거리가 같을 때에는 아래층의 방을 더 선호
		// N번째로 도착한 손님에게 배정될 방 번호를 계산
		
		// 101, 201, ..., H01, 102, 202, ..., H02, 103, ...H0W
		// 층: N과 H의 나머지 (나머지가 0이면 H)
		// 호수: N과 H의 몫 + 1 (나머지가 0이면 +1을 하지 않음)
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 개수 T
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt(); // 호텔의 층 수
			int W = sc.nextInt(); // 각 층의 방 수
			int N = sc.nextInt(); // 몇 번째 손님
			
			int floor = 0; // 층
			int number = 0; // 호수
			
			if(N % H == 0) {
				floor = H;
				number = N / H;
			}
			else{
				floor = N % H;
				number = (N / H) + 1;
			}
			
			// 호수는 두 자리 수 - 앞에 0 붙이기* (https://fruitdev.tistory.com/177)
			System.out.println(floor + String.format("%02d", number));
		}
		
		sc.close();

	}

}
