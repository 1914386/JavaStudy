package boj;

// https://www.acmicpc.net/problem/15552
// 도움 받은 자료: https://snacky.tistory.com/10
// 답안: https://bcp0109.tistory.com/39

import java.io.*;
import java.util.*;

public class _15552_빠른덧셈 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write((A+B) + "\n");
		}
		
		bw.flush();

	}

}
