
public class VariableScope {
	
	int globalScope = 10; // 변수 사용범위: 클래스 전체
	static int staticVal = 30;
	
	public void ScopeTest(int value) { // ScopeTest 메소드 생성
		int localScope = 20; // 변수 사용범위: 메소드 내부
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		System.out.println(staticVal);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); // 에러 발생
//		System.out.println(value);      // 에러 발생
		System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) { // static: 인스턴스를 만들지 않아도 사용할 수 있음. static한 필드(속성)만 사용 가능
//		System.out.println(globalScope); // 에러 발생 - 클래스는 인스턴스화 하지 않은 채로 사용 불가. static하지 않음
//		System.out.println(localScope);  // 에러 발생
//		System.out.println(value);       // 에러 발생
//		System.out.println(value2);      // 에러 발생
		System.out.println(staticVal);
		
		VariableScope v1 = new VariableScope();
		System.out.println(v1.globalScope);
		VariableScope v2 = new VariableScope();
		System.out.println(v2.globalScope);
		v1.globalScope = 1;
		v2.globalScope = 2;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope); // 값 저장공간이 계속 생김 - 인스턴스 변수
		
		v1.staticVal = 3;
		v2.staticVal = 4;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal); // 값 저장공간이 1개 - 클래스 변수
		System.out.println(VariableScope.staticVal);
		
	}

}
