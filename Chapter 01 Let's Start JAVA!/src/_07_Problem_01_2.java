public class _07_Problem_01_2 {

	public static void main(String[] args) {
		System.out.println("문제 1-2 [잘못된 주석처리]");
		System.out.println("문제 1)");
		
		System.out.println("One" /* One은 1 */);
		System.out.println("Two /* Two는 2 */");
		System.out.println("Three");
		
		/*
		System.out.println(2);
		// System.out.println("2");
		*/
		
		/*
		System.out.println(3);
		/* System.out.println("3"); */
		// 문제에서 제시한 코드는 이 자리에 */ 주석 기호가 있다. 없애야 실행이 되므로 행 주석처리를 하였다.
		
		// 블록 주석 내에 행 주석 처리는 가능하지만 블록 주석처리는 불가능하다.
		// 큰 따옴표 안의 주석 처리는 주석으로 인식이 되지 않는다.
	}

}