public class _07_Problem_05_2 {

	public static void main(String[] args) {
		System.out.println("문제 5-2 [조건 연산자]");

		int num1 = 50, num2 = 100;
		int big, diff;
		
		if (num1 > num2)
			big = num1;
		else
			big = num2;
		System.out.println(big);
		
		if (num1 > num2)
			diff = num1 - num2;
		else
			diff = num2 - num1;
		System.out.println(diff);
	}

}