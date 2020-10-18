import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in); // 키보드로부터 값을 입력받을 클래스 변수 "scan"
		
		do {
			// 반복할 문장
			value = scan.nextInt();
			System.out.println("입력받은 값: " + value);
		}while(value != 10);
		
		System.out.println("반복문 종료");
		scan.close();
	}

}
