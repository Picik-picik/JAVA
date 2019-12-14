public class _09_SwitchBreak {

	public static void main(String[] args) {
		int n = 3;
		
		switch (n) {
		case 1 :
			System.out.println("Simple Java");
			break;
		case 2 :
			System.out.println("Funny Java");
			break;
		case 3 :
			System.out.println("Fantastic Java");
			break;
		default :
			System.out.println("The best programming language");
		}
	
		System.out.println("Do you like coffee?");
	}

}

/*   
�� switch�� + break�� : switch���� �Ϲ����� ��� ��
������ �帧�� ��Ʈ���ϴµ� ���Ǵ� Ű���� �߿��� break��� ���� �ִ�. �̴� switch�� �ȿ��� ����� �� ������,
switch�� �ȿ����� ������ �ǹ̸� ���Ѵ�.

"switch���� �׳� ���� �����ڽ��ϴ�!"

���� switch�� �ȿ��� break���� ������ Ȱ���ϸ�, ������ ���� ������ ������ ����� �� �ִ�.
���� ������ switch���� Ư�� ���̺��� ��ġ���� switch���� ���������� ��~ �����ϴ� �������ٸ�,
���� �����帮�� ������ �� ���̺��� ������ �����Ͽ�, �ش� ������ �����ϴ� �����̴�.

   switch (n) {
   case 1 :    --
      . . . .  -- <- case 1 ����
      break;   --
   case 2 :      --
      . . . .    -- <- case 2 ����
      break;     --
   case 3 :        --
      . . . .      -- <- case 3 ����
      break;       --
   default :         -- <- default ����
      . . . .        --
   }
   
�������� ���̴� break���� ���翩�� �ϳ��̴�. ������ �� break�� ���п� ���̺� ����(case 1, 2, 3, default)
������ �����Ͽ�, �ش� ������ ������ �� �ְ� �Ǿ���. ���� ��� switch���� 2�� ���޵Ǿ��ٰ� ������ ����. �׷��ٸ� �ϴ�
case 2�� ��ġ�� �̵��ؼ� ������ ������ ���̴�. �׷��ٰ� break���� �����鼭 switch���� ����� �ȴ�.
��������δ� case 2�� ������ ������ ������ �ȴ�.

���̺�(��)�� å�� �� �������� �� �̻� ���� �� �ֵ���, switch���� ���̺� ���� �� �ٿ� �� �̻� ���� �� ������ ����ϰ�
�ʿ� �� Ȱ���ϱ� �ٶ���. �� ������ ���� ������ switch�� ������ �����ϴٴ� ���� �������.

   switch (n) {
   case 1 : case 2 : case 3 :
      System.out.println("Simple Java");
      break;
   case 4 : case 5 :
      System.out.println("Funny Java");
      break;
   . . . . .
   }
   
���� switch���� ��� switch���� ���޵Ǵ� ������ 1, 2, 3�� ���, �����ϰ� ������ �� ������ ����ȴ�.

      System.out.println("Simple Java");
      break;
      
�׸��� switch���� ���޵Ǵ� ������ 4, 5�� ��쿡�� �����ϰ� ������ �� ������ ����ȴ�.

      System.out.println("Funny Java");
      break;
*/