public class _29_LabeledBreak {

	public static void main(String[] args) {
		outerLoop :
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println("[" + i + ", " + j + "]");
				if (i % 2 == 0 && j % 2 == 0)
					break outerLoop;
			}
		}
	}

}

/*
�� ������ 4���� 5���� for���� ���� ���̺��̴�. �� ������ ���� �����Ǿ�� �� ���� ���� ���� �� �ٿ� ���ļ� ǥ���� ������ �����ϸ� �ȴ�.

   outerLoop : for (int i = 0; i < 10; i++)
   
�׸��� 9���� break���� "outerLoop��� ǥ�õǾ� �ִ� �ݺ����� ���������ڴ�!"�� �������� �����ϸ� �ȴ�.
��������� 9���� ������ 5���� �ٱ��� for���� ������������ �������� ���ؼ� Ȯ���� �� �ִ�.
*/