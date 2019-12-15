public class _04_Problem_06_1_2 {

	public static void main(String[] args) {
		System.out.println("문제 6-1 [메소드의 정의]");
		System.out.println("문제 2)");
		
		absolute(5, 3);
		absolute(3, 8);
		absolute(10, -9);
		absolute(-5, -9);
	}

	public static void absolute(int i, int j) {
		if (i > j)
			System.out.println(i - j);
		else
			System.out.println(j - i);
	}
}