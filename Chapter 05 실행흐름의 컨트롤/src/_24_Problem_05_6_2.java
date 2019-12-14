public class _24_Problem_05_6_2 {

	public static void main(String[] args) {
		System.out.println("문제 5-6 [continue문과 break문의 활용]");
		System.out.println("문제 2)");
		
		int num = 1, sum = 0;
		
		while (true) {
			if (num % 2 != 0 || num % 3 == 0)
				sum += num;
			
			if (sum > 1000) {
				System.out.println(num + " 더할 때 1000을 초과한다.");
				System.out.println("1000을 초과한 값 : " + sum);
				break;
			}
			num++; 
		}
	}

}