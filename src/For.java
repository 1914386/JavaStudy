
public class For {
	
	public static void main(String[] args) {
		//1���� 100���� ��
		int total = 0;
		
		for(int i=1; i<=100; i++) {
			total += i;
		}
		
		System.out.println("1���� 100������ ��: " + total);
		
		
		//1���� 100 �� ¦���� ��
		int sum = 0;
		
		for(int j=1; j<=100; j++) {
			if(j % 2 != 0) {
				continue; // Ȧ���� �Ѿ�� �ٽ� �ݺ��� ����
			}
			sum += j;
//			if (j == 50) {
//				break; // j = 50�� �Ǹ� �ݺ��� ����
//			}
		}
		
		System.out.println("1���� 100������ ���� �� ¦���� ��: "+ sum);
//		System.out.println("1���� 50������ ��: "+ sum);
	}

}
