package boj;

import java.util.Scanner;

// 해결 못 한 문제
public class SMUPC_C {

	static char[][] campus; // 캠퍼스
	static boolean[][] visit; // 방문 여부
	static int people = 0; // 만난 사람 수
	
	static int[] dx = {-1, 0, 1, 0}; // 북동남서 방향 x좌표
	static int[] dy = {0, 1, 0, -1}; // 북동남서 방향 y좌표
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		char[][] campus = new char[N][M];
		boolean[][] visit = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				campus[i][j] = sc.next().charAt(0); // 캠퍼스 정보
			}
		}
		
//		find(x, y);
		System.out.println(people);
	}

	public static void find(int x, int y, int d) {
		boolean sign = false;
		
		if(!visit[x][y]) {
			visit[x][y] = true;
		}
		
		for(int i=0; i<4; i++) {
			d = dir(d);
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(campus[nx][ny] == 0 && !visit[nx][ny]) {
				find(nx, ny, d);
				sign = true;
				break;
			}
		}
		
		if (sign == false) {
			int nx = x - dx[d];
			int ny = y - dy[d];
			
			if(campus[nx][ny] == 0)
				find(nx, ny, d);
		}
		
	}
	
	public static int dir(int d) {
		if(d == 0)
			return 1;
		else if(d == 1)
			return 2;
		else if(d == 2)
			return 3;
		else
			return 0;
	}
	
}
