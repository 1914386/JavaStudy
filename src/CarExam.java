
public class CarExam {

	public static void main(String[] args) {
		// Car() ������: �޸𸮿� ��ü(�ν��Ͻ�)�� ������ ��ɾ�
		// c1, c2 = �������  Car ��ü�� �����ϴ� ����
		Car c1 = new Car();
		Car c2 = new Car();
		
		// ��ü�� �Ӽ� �߰��ϱ�
		c1.name = "�ҹ���";
		c1.number = 1234;
		
		c2.name = "������";
		c2.number = 1111;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
