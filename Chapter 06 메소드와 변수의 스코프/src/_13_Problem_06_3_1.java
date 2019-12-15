public class _13_Problem_06_3_1 {

	public static void main(String[] args) {
		System.out.println("문제 6-3 [재귀 메소드의 정의]");
		System.out.println("문제 1)");
		
		System.out.println("2의 5승 : " + twoSquare(5));
		System.out.println("2의 3승 : " + twoSquare(3));
		System.out.println("2의 15승 : " + twoSquare(15));

	}

	public static int twoSquare(int n) {
		if (n == 0)
			return 1;
		return 2 * twoSquare(n-1);
	}
}