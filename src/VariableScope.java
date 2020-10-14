
public class VariableScope {
	
	int globalScope = 10; // ���� ������: Ŭ���� ��ü
	static int staticVal = 30;
	
	public void ScopeTest(int value) { // ScopeTest �޼ҵ� ����
		int localScope = 20; // ���� ������: �޼ҵ� ����
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		System.out.println(staticVal);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); // ���� �߻�
//		System.out.println(value);      // ���� �߻�
		System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) { // static: �ν��Ͻ��� ������ �ʾƵ� ����� �� ����. static�� �ʵ�(�Ӽ�)�� ��� ����
//		System.out.println(globalScope); // ���� �߻� - Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ��� �Ұ�. static���� ����
//		System.out.println(localScope);  // ���� �߻�
//		System.out.println(value);       // ���� �߻�
//		System.out.println(value2);      // ���� �߻�
		System.out.println(staticVal);
		
		VariableScope v1 = new VariableScope();
		System.out.println(v1.globalScope);
		VariableScope v2 = new VariableScope();
		System.out.println(v2.globalScope);
		v1.globalScope = 1;
		v2.globalScope = 2;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope); // �� ��������� ��� ���� - �ν��Ͻ� ����
		
		v1.staticVal = 3;
		v2.staticVal = 4;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal); // �� ��������� 1�� - Ŭ���� ����
		System.out.println(VariableScope.staticVal);
		
	}

}
