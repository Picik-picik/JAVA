public class _14_PrefixOp {

	public static void main(String[] args) {
		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;  // num1�� 8�� ��
		num3 = --num1;  // num1�� �ٽ� 7�� ��
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}

/*  
�� ����, ���� ������(++, --) : prefix
�̹����� ������ ����� ���� �ϳ� ���� �� ���ҽ�Ű�� ����� �����ڸ� �Ұ��ϰ��� �Ѵ�.
�̵��� Ȱ���� �󵵰� �ſ찡 �����鼭�� ȥ���ϱ� ����Ƿ� Ȯ���� �����ϰ� �Ѿ�� �Ѵ�.

������          �������� ���                            ���չ���
++       �ǿ����ڿ� ����� ���� 1 ����      ��
(prefix) ��) val = ++n;
--       �ǿ����ڿ� ����� ���� 1 ����      ��
(prefix) ��) val = --n;

�� �� �����ڴ� prefix �������̴�.(prefix�� ���λ��� ���̴�.) ���� �����ϸ� �ǿ������� �պκп� �ٴ� �����ڶ�� ���̴�.
*/