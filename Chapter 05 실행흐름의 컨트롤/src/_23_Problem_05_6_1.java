
public class _23_Problem_05_6_1 {

	public static void main(String[] args) {
		System.out.println("���� 5-6 [continue���� break���� Ȱ��]");
		System.out.println("���� 1)");
		
		int count = 0;
		
		for (int num = 1; num <= 100; num++) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;
			count++;
			System.out.println(num);
		}
		
		System.out.println("count : " + count);
	}

}
