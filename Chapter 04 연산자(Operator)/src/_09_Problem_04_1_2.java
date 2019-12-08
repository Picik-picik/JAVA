public class _09_Problem_04_1_2 {

	public static void main(String[] args) {
		System.out.println("문제 4-1 [연산자의 활용과 연산의 특성 파악]");
		System.out.println("문제 2)");
		
		int num1 = 0, num2 = 0;
		boolean result;
		
		num1 += 10;
		num2 += 10;
		result = num1 < 0 && num2 > 0;
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		num1 += 10;
		num2 += 10;
		result = num1 > 0 || num2 > 0;
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}

}

/*   
답안 해설
+= 연산자가 논리 연산자와 함께 있어서 문제가 된 것이므로 이 둘을 별도의 문장에서 실행되도록 변경하면 된다.
비록 예제를 구성하는 문장의 수는 늘었지만 문장은 훨씬 간결해졌다.
그리고 SCE.java에서 보인 원치않는 결과도 발생하지 않게 되었다.
*/