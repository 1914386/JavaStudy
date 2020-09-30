
public class TypeCasting {
	
	public static void main(String[] args) {
		int x = 50000;
		long y = x;
		
		long x2 = 5;
		int y2 = (int) x2;
		
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1; //연산자를 바꾸려면 - 를 사용!! 
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // i3 = i3+1 더하고 대입
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; // 대입하고 더해짐
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / (double) j);
		//정수끼리의 연산은 정수값으로 리턴퇴므로 최소한 하나를 실수로 변환해야 함
		System.out.println(i % j);
	}

}
