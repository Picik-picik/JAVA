public class _21_ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while (num++ < 100) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;
			count++;
			System.out.println(num);
		}
		
		System.out.println("count : " + count);
	}

}

/*
�� continue��
�̹��� �Ұ��� continue���� break���� �򰥸� �� �־ ��Ȯ�� ���ذ� �ʿ��ϴ�. continue���� �ݺ����� Ż���
�Ÿ��� �ִ�. continue���� �����ϴ� �ݺ����� ������ �κ��� �����ϰ� ���α׷��� �帧�� ���ǰ˻� �κ����� �̵���ų ���̴�.

   while (n < 100){
      if (x == 20)
         break;   -> while�� Ż�� ��
      . . . . .
   }
   . . . . .

   while (n < 100){
      if (x == 20)
         continue;   -> ���� �˻�� �̵� ��
      . . . . .
   }
   . . . . .

continue���� ������ �Ǹ�, �ݺ����� ������ �κ��� �������� �ʰ�, �ݺ����� �� ���� �̵��Ͽ� ���ǰ˻���� �ٽ� ������
�̾����.(��, do~while���� ��� ���ǰ˻簡 �����ϴ� �� �Ʒ��� �̵�)

�� ������ �ſ� ����������, continue���� Ȱ��Ǵ� �������� ���� �����ش�. �׸��� �̸� ��Ȯ�� �����ߴٸ�
continue���� if���� �Բ� �����ϰ� ���� �� ������ �� �� ���� ���̴�.
*/