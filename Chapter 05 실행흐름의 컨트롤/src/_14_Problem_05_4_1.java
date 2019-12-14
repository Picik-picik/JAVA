public class _14_Problem_05_4_1 {

	public static void main(String[] args) {
		System.out.println("문제 5-4 [while문과 do~while문의 활용]");
		System.out.println("문제 1)");
		/* 반복문과 관련해서는 많은 예제를 보는 것 보다 많은 문제를 풀어보는 것이 열 배는 더 효율적이다.
		      따라서 여기서 제시하는 문제들은 반드시 해결을 하고 진도를 이어가기 바란다. */
		
		int num = 1, sum = 0;
		
		while (num < 100) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
	}

}