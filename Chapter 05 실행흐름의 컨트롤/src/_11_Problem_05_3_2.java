public class _11_Problem_05_3_2 {

	public static void main(String[] args) {
		System.out.println("���� 5-3 [switch���� ���ؿ� Ȱ��]");
		System.out.println("���� 2)");
		
		int n = 24;
		
		switch (n / 10) {
		case 0 :
			System.out.println("0 �̻� 10 �̸��� ��");
			break;
		case 1 :
			System.out.println("10 �̻� 20 �̸��� ��");
			break;
		case 2 :
			System.out.println("20 �̻� 30 �̸��� ��");
			break;
		default :
			System.out.println("���� Ȥ�� 30 �̻��� ��");
		}
	}

}