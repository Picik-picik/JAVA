public class _24_Problem_05_6_2 {

	public static void main(String[] args) {
		System.out.println("���� 5-6 [continue���� break���� Ȱ��]");
		System.out.println("���� 2)");
		
		int num = 1, sum = 0;
		
		while (true) {
			if (num % 2 != 0 || num % 3 == 0)
				sum += num;
			
			if (sum > 1000) {
				System.out.println(num + " ���� �� 1000�� �ʰ��Ѵ�.");
				System.out.println("1000�� �ʰ��� �� : " + sum);
				break;
			}
			num++; 
		}
	}

}