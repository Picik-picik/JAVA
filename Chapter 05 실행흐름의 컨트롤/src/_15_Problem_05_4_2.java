public class _15_Problem_05_4_2 {

	public static void main(String[] args) {
		System.out.println("���� 5-4 [while���� do~while���� Ȱ��]");
		System.out.println("���� 2)");
		
		int num1 = 1, num = 100;
		
		do {
			System.out.println(num1);
			num1++;
		} while (num1 <= 100);
		
		System.out.println("�Ųٷ�");
		
		while (num > 0) {
			System.out.println(num);
			num--;
		}
	}

}

/*
�ҽ��ڵ� ���
   int num = 1;
   
   while (num <= 100)
      System.out.println(num++);

   do {
      System.out.println(--num);
   } while (num > 1);
*/