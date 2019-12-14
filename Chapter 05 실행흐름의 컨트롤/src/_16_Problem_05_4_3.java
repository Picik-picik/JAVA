public class _16_Problem_05_4_3 {

	public static void main(String[] args) {
		System.out.println("문제 5-4 [while문과 do~while문의 활용]");
		System.out.println("문제 3)");
		
		int num = 1, sum = 0;
		
		while (num <= 1000) {
			if (num % 2 == 0 && num % 7 == 0) {
				System.out.println(num);
				sum += num;
			}
			num++;
		}
		
		System.out.println("합 : " + sum);
	}

}