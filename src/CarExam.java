
public class CarExam {

	public static void main(String[] args) {
		// Car() ������: �޸𸮿� ��ü(�ν��Ͻ�)�� ������ ��ɾ�
		// c1, c2 = �������  Car ��ü�� �����ϴ� ����
		Car c1 = new Car();
		Car c2 = new Car();
		Car2 c3 = new Car2("������"); // �����ڸ� �������� ��!
		System.out.println(c3.name);
		
		// ��ü�� �Ӽ� �߰��ϱ�
		c1.name = "�ҹ���";
		c1.number = 1234;
		
		c2.name = "������";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		
		// ��ü�� �޼ҵ� �߰��ϱ�
		Car myclass = new Car();
		myclass.method1();
		myclass.method2(2);
		int value1 = myclass.method3();
		System.out.println("method3�� ���ϰ� = " + value1);
		myclass.method4(2, 4);
		int value2 = myclass.method5(5);
		System.out.println("method5�� ���ϰ� = " + value2);
	}

}
