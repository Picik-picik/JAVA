public class _31_Problem_05_7_2 {

	public static void main(String[] args) {
		System.out.println("���� 5-7 [�ݺ����� ��ø]");
		System.out.println("���� 2)");
		
		int A, B;
		
		for (A = 0; A < 10; A++) {
			for (B = 0; B < 10; B++) {
				if ((10 * A + B) + (10 * B + A) == 99)			
				System.out.println((10 * A + B) + " + " + (10 * B + A) + " = 99");
			}
		}
	}

}