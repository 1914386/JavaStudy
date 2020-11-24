package boj;

public class _함수 {

	public static void main(String[] args) {
		Test boj = new Test();
		
		// 15596번: 정수 N개의 합
		int[] ex = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(boj.sum(ex));
		
		// 4672번: 셀프 넘버
		boolean[] check = new boolean[10001];
		for(int i=1; i<=10000; i++) {
			int n = d(i);
			
			if(n < 10001) // 10000보다 작거나 같은 생성자가 "있는" 숫자들 = true
				check[n] = true;
		}
		
		for(int i=1; i<=10000; i++) {
			if(!check[i]) // 10000보다 작거나 같은 생성자가 "없는" 숫자들(셀프 넘버) = false
				System.out.println(i);
		}
		
	}
	
	static int d(int n) {
		String nStr = Integer.toString(n);
		int result = n;
		for(int i=0; i<nStr.length(); i++) {
			result += nStr.charAt(i) - '0';
		}
		return result;
	}

}
