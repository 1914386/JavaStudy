
public interface Calculator {
	
	public int plus(int x, int y);
	public int multiple(int x, int y);
	
	// default 메소드
	default int exec(int x, int y) {
		return x + y; // 구현해도 오류 발생하지 않음
	}
	
	// static 메소드
	public static int exec2(int x, int y) {
		return x * y; // 구현해도 오류 발생하지 않음
	}

}
