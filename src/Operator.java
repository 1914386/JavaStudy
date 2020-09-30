
public class Operator {
	
	public static void main(String[] args) {
		int i = 111;
		int j = 24;
		
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
		i += 10; // i = i + 10;
		System.out.println(i);
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println((a - b) * c);
		
		System.out.println(a > 5 && b > 5);
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5);
		System.out.println(a);
		
		System.out.println(b++ - 5);
		System.out.println(b);
	}

}
