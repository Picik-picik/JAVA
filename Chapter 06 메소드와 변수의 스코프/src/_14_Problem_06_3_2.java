public class _14_Problem_06_3_2 {

	public static void main(String[] args) {
		System.out.println("문제 6-3 [재귀 메소드의 정의]");
		System.out.println("문제 2)");
		
		toBinary(10);
	}
	
	public static int toBinary(int decimal) {
		if (decimal > 0) {
			int bin;
			bin = decimal % 2;
			decimal /= 2;
			toBinary(decimal);
			System.out.println(bin);
		}
		return 0;
	}

}