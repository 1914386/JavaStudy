
public class Car3 {
	// 메소드 오버로딩 - 매개변수의 타입과 개수가 다르게 하여 동명의 메소드를 여러 개 생성
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int plus (int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus (String x, String y) {
		return x + y;
	}

}
