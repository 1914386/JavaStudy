
public class Car {
	// �ؾ = ��ü (Ŭ�������� ����� ��� �״�� ������ ��ü)
	// �ؾ�� Ʋ = Ŭ���� (��ü�� ������ ���� ���赵, Ʋ)
	
	// �Ӽ� (=�ʵ�): ��ü�� ����
	// �޼ҵ�: ��ü�� ����. �Է°�(�Ű�����, ����)�� �����(���ϰ�)
	// ex) �ڵ���(��ü)�� �̸��� ��ȣ(�ʵ�), ������ ���� ���(�޼ҵ�)
	
	
	// �ʵ� ����: Ÿ�� �ʵ��
	String name;
	int number;
	
	
	// �޼ҵ� ����: public ����Ÿ�� �޼ҵ�� (�Ű�����){ ��� }
	public void method1() {
		System.out.println("method1�� ����˴ϴ�.");
	}
	
	public void method2(int x) {
		System.out.println(x + "�� �̿��� method2�� ����˴ϴ�.");
	}
	
	public int method3() {
		System.out.println("method3�� ����˴ϴ�.");
		return 3;
	}
	
	public void method4(int x, int y) {
		System.out.println("method4�� ����˴ϴ�. �� ������ �� = " + x + y);
	}
	
	public int method5(int y) {
		System.out.println(y + "�� �̿��� method5�� ����˴ϴ�.");
		return y * 2;
	}
	
	// ������ ����
//	public Car(String n) {
//		name = n;
//	}
}
