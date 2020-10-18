
public class While {
	
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			System.out.println(i);
			i++; // i=i+1
		}
		
		int total = 0;
		int a = 1;
		
		while(a <= 100) {
			total += a; // total = total + 1
			a++;
		}
		
		System.out.println("1부터 100까지의 합 = " + total);
		
	}

}
