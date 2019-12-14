public class _06_CondOp {

	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big, diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println(big);
		
		diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println(diff);
	}

}

/*   
■ if~else와 유사한 성격의 조건 연산자
조건 연산자는 피연산자가 세 개인 유일한 연산자이다.
이러한 조건 연산자는 간단한 if~else문을 대체하는 용도로 자주 사용된다.

   true of false ? 숫자 1 : 숫자 2
   
기호 ? 와 : 이 하나의 연산자를 이루는 구조다 보니 조금 어색할 수 있다. 그러나 복잡한 구조는 아니며, 연산의 방식도 다음과
같이 두 가지로 나눠서 정리할 수 있다.

* ? 기호의 왼편에 true가 등장하면, : 기호의 왼편에 있는 숫자가 반환된다.
* ? 기호의 왼편에 flase가 등장하면, : 기호의 오른편에 있는 숫자가 반환된다.

물론 ? 기호의 왼편에 true나 false를 직접 입력하지는 않는다. 대신에  true 또는 false를 반환하는 연산문이 등장하는
것이 일반적이다.

   (num1 > num2) ? num1 : num2;

우선 여기서 소괄호는 생략할 수 있으며 이는 조건 연산자의 일부도 아니다. 그러나 코드를 읽기 쉽도록 소괄호를 사용하는 것이
보편적이라서 이를 보이고자 하였다. 자! 이 상황에서  num1의 값이 num2의 값보다 크다면, > 연산의 결과로 ? 기호의
왼편에 있는 true가 온다. 따라서 num1이 반환되는데, 이렇듯 조건 연산자는 값을 반환하기 때문에 다음과 같은
형태로 사용이 된다.

   bit = (num1 > num2) ? num1 : num2;
   
결과적으로 이 문장의 실행결과로 num1 > num2가 true라면 num1의 값이, false라면 num2의 값이 변수 big에 저장
된다. 그리고 숫자가 와야 할 자리에 숫자가 아닌, 숫자를 반환하는 연산문이 올 수 있음을 더불어 기억하기 바란다.
*/