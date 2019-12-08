public class _12_Problem_04_1_5 {

	public static void main(String[] args) {
		System.out.println("문제 4-1 [연산자의 활용과 연산의 특성 파악]");
		System.out.println("문제 5)");
		
		int A = ((25 + 5) + (36 / 4) - 72) * 5,
			B = ((25 * 5) + (36 - 4) + 71) / 4,
			C = (128 / 4) * 2;
		
		boolean result = (A > B) && (B > C);
		
		System.out.println(result);
	}

}