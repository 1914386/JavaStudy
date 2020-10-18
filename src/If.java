
public class If {
	
	public static void main(String[] args) {
		int x = 150;
		int y = 60;
		
/*
		if (x < y) {
			System.out.println("x는 y보다 작습니다.");
			System.out.println("test");
		}
		
		if (x < y)
			System.out.println("x는 y와 같습니다.");
		System.out.println("test2");
*/
		
		if (x == y) {
			System.out.println("x는 y와 같습니다.");
		}else if (x < y) {
			System.out.println("x는 y보다 작습니다.");
		}else {
			System.out.println("x는 y보다 큽니다.");
		}
		
	}

}
