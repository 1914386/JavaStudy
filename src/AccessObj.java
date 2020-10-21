
public class AccessObj {
	
	public int p = 3;  // 어떤 클래스라도 접근 가능
	
	protected int p2 = 4;  // 같은 패키지인 경우, 상속받은 다른 패키지인 경우 접근 허용
	
	int k = 2;  // 디폴트 접근지정자. 자기 자신과 같은 패키지에서만 접근 가능

	private int i = 1;  // 자기 자신만 접근 가능
	

}
