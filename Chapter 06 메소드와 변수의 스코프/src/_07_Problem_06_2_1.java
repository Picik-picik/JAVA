public class _07_Problem_06_2_1 {

	public static void main(String[] args) {
		System.out.println("문제 6-2 [값을 반환하는 메소드의 정의]");
		System.out.println("문제 1)");
		
		System.out.println("입력한 원의 넓이 : " + Area(3.5));
		System.out.println("입력한 원의 둘레 : " + circumference(3.5));
	}

	public static double Area(double i) {
		return 3.14 * i * i;
	}
	
	public static double circumference(double i) {
		return i * 2 * 3.14;
	}
}