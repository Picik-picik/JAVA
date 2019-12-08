public class _14_PrefixOp {

	public static void main(String[] args) {
		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;  // num1은 8이 됨
		num3 = --num1;  // num1은 다시 7이 됨
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}

/*  
■ 증가, 감소 연산자(++, --) : prefix
이번에는 변수에 저장된 값을 하나 증가 및 감소시키는 기능의 연산자를 소개하고자 한다.
이들은 활용의 빈도가 매우가 높으면서도 혼동하기 쉬우므로 확실히 이해하고 넘어가야 한다.

연산자   연산자의 기능                     결합방향
++       피연산자에 저장된 값을 1 증가      ←
(prefix) 예) val = ++n;
--       피연산자에 저장된 값을 1 감소      ←
(prefix) 에) val = --n;

이 두 연산자는 prefix 연산자이다.(prefix는 접두사라는 뜻이다.) 쉽게 설명하면 피연산자의 앞부분에 붙는 연산자라는 뜻이다.
*/
