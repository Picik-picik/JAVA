public class _03_Problem_06_1_1 {

	public static void main(String[] args) {
		System.out.println("문제 6-1 [메소드의 정의]");
		System.out.println("문제 1)");
		
		cal(5, 2);
	}

	public static void cal(int i, int j) {
		System.out.println("덧셈 : " + (i + j));
		System.out.println("뺄셈 : " + (i - j));
		System.out.println("곱셈 : " + (i * j));
		System.out.println("몫 : " + (i / j));
		System.out.println("나머지 : " + (i % j));
	}
}