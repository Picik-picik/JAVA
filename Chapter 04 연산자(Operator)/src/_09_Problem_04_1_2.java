public class _09_Problem_04_1_2 {

	public static void main(String[] args) {
		System.out.println("���� 4-1 [�������� Ȱ��� ������ Ư�� �ľ�]");
		System.out.println("���� 2)");
		
		int num1 = 0, num2 = 0;
		boolean result;
		
		num1 += 10;
		num2 += 10;
		result = num1 < 0 && num2 > 0;
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		num1 += 10;
		num2 += 10;
		result = num1 > 0 || num2 > 0;
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}

}

/*   
��� �ؼ�
+= �����ڰ� �� �����ڿ� �Բ� �־ ������ �� ���̹Ƿ� �� ���� ������ ���忡�� ����ǵ��� �����ϸ� �ȴ�.
��� ������ �����ϴ� ������ ���� �þ����� ������ �ξ� ����������.
�׸��� SCE.java���� ���� ��ġ�ʴ� ����� �߻����� �ʰ� �Ǿ���.
*/