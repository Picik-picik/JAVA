public class _14_Problem_05_4_1 {

	public static void main(String[] args) {
		System.out.println("���� 5-4 [while���� do~while���� Ȱ��]");
		System.out.println("���� 1)");
		/* �ݺ����� �����ؼ��� ���� ������ ���� �� ���� ���� ������ Ǯ��� ���� �� ��� �� ȿ�����̴�.
		      ���� ���⼭ �����ϴ� �������� �ݵ�� �ذ��� �ϰ� ������ �̾�� �ٶ���. */
		
		int num = 1, sum = 0;
		
		while (num < 100) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
	}

}