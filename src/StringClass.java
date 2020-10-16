 
public class StringClass {

	public static void main(String[] args) {
		// String Ŭ����: ���ڿ��� ǥ���ϴ� �ڹٿ��� ���� ���� �̿��ϴ� Ŭ����.
		String str1 = "Hello";  // ��� ������ ����
		String str2 = "Hello";  // str1�� str2�� ���� ��ü(�ν��Ͻ�)�� ���� = ���� ���۷���
		
		
		// new �����ڸ� �̿����� �ʰ� ��ü(�ν��Ͻ�)�� ���� �� �ִ�.
		String str3 = new String("Java");  // ��� ������ �������� �ʰ�, �� ��ü(�ν��Ͻ�)�� heap ������ ����
		String str4 = new String("Java");  // str3�� str4�� �ٸ� ���۷���
		
		if (str1 == str2)
			System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
		
		if (str1 == str3)
			System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
		
		if (str3 == str4)
			System.out.println("str3�� str4�� ���� ���۷����Դϴ�.");
		
		
		// String Ŭ�������� Ư¡ - �� �� �����Ǹ� ������ �ʴ´�
		System.out.println(str1);
		System.out.println(str1.substring(3)); // 3�� �ε������� ���
		System.out.println(str1); // ���� �� �Һ�
		
		
		// String Ŭ������ equals �޼ҵ�: ������ ���۷����� �ƴ�, ������ �����ϴ� ���ڿ��� ������ Ȯ���ϰ� ���� ��
		if (str1.equals("Hello"))
			System.out.println("str1�� Hello�� �����ϴ�.");
		
		if (str3.equals(str4)) {
			System.out.println("str3�� str4�� ���� ���� ������ �ֽ��ϴ�.");
		}
		else {
			System.out.println("str3�� str4�� �ٸ� ���� ������ �ֽ��ϴ�.");
		}
		
		if (str1.equals(str4)) {
			System.out.println("str1�� str4�� ���� ���� ������ �ֽ��ϴ�.");
		}
		else {
			System.out.println("str1�� str4�� �ٸ� ���� ������ �ֽ��ϴ�.");
		}
		
		
		// String Ŭ������ �����ϴ� �޼ҵ�
		String str = "hello";
		
		System.out.println(str.length()); // ���ڿ��� ����
		System.out.println(str.concat(" world")); // ���ڿ� ���̱�
		System.out.println(str); // str ���� ������ ����
		
		str = str.concat(" world");
		System.out.println(str); // ���� �۾��� ��ġ�� str ���� ����
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7)); // ���ڿ� �ڸ���
	}

}
