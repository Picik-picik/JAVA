public class _08_Problem_06_2_2 {

	public static void main(String[] args) {
		System.out.println("문제 6-2 [값을 반환하는 메소드의 정의]");
		System.out.println("문제 2)");
		
		for (int i = 1; i <= 100; i++) {
			if (isPrimeNumber(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrimeNumber(int num) {
		if (num == 1)
			return false;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}

}