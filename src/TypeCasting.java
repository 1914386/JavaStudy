
public class TypeCasting {
	
	public static void main(String[] args) {
		int x = 50000;
		long y = x;
		
		long x2 = 5;
		int y2 = (int) x2;
		
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1; //�����ڸ� �ٲٷ��� - �� ���!! 
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1 ���ϰ� ����
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; // �����ϰ� ������
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / (double) j);
		//���������� ������ ���������� ������Ƿ� �ּ��� �ϳ��� �Ǽ��� ��ȯ�ؾ� ��
		System.out.println(i % j);
	}

}
