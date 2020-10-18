
public class Array {
	
	public static void main(String[] args) {
		int[] array1 = new int[100];
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4};
		
		int[] array3 = {1,2,3,4};
		System.out.println("array3[3] = " + array3[3]);
		int value = array3[0];
		System.out.println("value = " + value);
		
		
		// for 반복문을 이용하여 배열 사용하기
		int[] iarray = new int[100];
		System.out.println("iarray.length = " + iarray.length);
		for(int i=0; i<iarray.length; i++) {
			iarray[i] = i + 1; // 1부터 100까지
		}
		
		int sum = 0;
		for(int i=0; i<iarray.length; i++) {
			sum += iarray[i]; // 배열에 담긴 숫자의 합
		}
		System.out.println("sum = " + sum);
		
		
		// 2차원 배열
		int[][] array4 = new int[3][4];
		array4[0][0] = 10;
		
		int[][] array5 = new int[3][]; // index가 가리키고 있는 부분이 없음
		// array5[0][0] = 10; // 오류 발생
		// 가로줄 개수
		array5[0] = new int[1];
		array5[1] = new int[2];
		array5[2] = new int[3];
		
		int[][] array6 = {{1}, {1,2}, {1,2,3}};
		System.out.println("array6[0][0] = " + array6[0][0]);
		System.out.println("array6[2][2] = " + array6[2][2]);
		
		
		// for each
		int[] iarr = {10,20,30,40,50};
		for(int i=0 ; i<iarr.length; i++) {
			int value1 = iarr[i];
			System.out.println(value1);
		}
		// for each문을 활용한 같은 명령어
		for(int value2:iarr) {
			System.out.println(value2);
		}
		
	}

}
