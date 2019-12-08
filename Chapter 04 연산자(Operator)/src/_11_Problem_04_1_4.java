public class _11_Problem_04_1_4 {

	public static void main(String[] args) {
		System.out.println("문제 4-1 [연산자의 활용과 연산의 특성 파악]");
		System.out.println("문제 4)");
		
		int num = 3;
		
		System.out.println(num += 6);
		System.out.println(num += 9);
		System.out.println(num += 12);
	}

}

/*   
답안 해설
덧셈의 수를 최소화하려면 이전 덧셈의 결과를 변수에 저장해야 한다.
   int result = 3 + 6;
   System.out.println("3 + 6 = " + result);
   
   result += 9;
   System.out.println("3 + 6 + 9 = " + result);
   
   result += 12;
   System.out.println("3 + 6 + 9 + 12 = " + result);
*/