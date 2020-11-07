
public class _Solution {
	public int solution(int n) {
		int answer = 0; // 약수의 합
		
		// n을 1부터 n까지 나누어서 나머지이 0이 되는 몫을 answer에 저장
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}
}
