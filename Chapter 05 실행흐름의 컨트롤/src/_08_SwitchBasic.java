public class _08_SwitchBasic {

	public static void main(String[] args) {
		int n = 3;
		
		switch (n) {
		case 1 :
			System.out.println("Simple Java");
		case 2 :
			System.out.println("Funny Java");
		case 3 :
			System.out.println("Fantastic Java");
		default :
			System.out.println("The best programming language");
		}
	
		System.out.println("Do you like coffee?");
	}
	
}
/*   
6행 : 변수 n이 switch문에 전달되고 있다. 이 값에 따라서 실행의 위치가 달라진다. 변수 n의 값을 변경해 가면서 실행을
해봐야 한다. 그리고 이 위치에는 반드시 정수(또는 문자)가 와야 한다는 사실을 기억하자. 다시 말해서 소수점 이하의 값을 지니는
실수는 올 수 없다. 물론 연산의 결과로 정수를 반환하는 연산식은 올 수 있다.
7, 9, 11행 : 정수 1, 2, 3으로 case 레이블이 구성되었다. 이렇듯 case 레이블 구성에는 반드시 정수(또는 문자)가
와야 하며, 6행에서와 달리 변수가 올 수 없으며, 정수를 반환한다 할지라도 연산식 또한 올 수 없다. 쉽게 말해서 상수의 형태로
정수 또는 문자만 올 수 있다.

실행결과의 결론은 레이블이 지정하는 위치부터 switch문의 마지막까지 실행되고, 그 다음을 이어서 실행하게 된다는 것이다.
*/

/*   
이번에 소개하는 switch문도 조건에 따라서 실행시킬 코드를 구분한다는 측면에서는 if문, 그리고 if~else문과 유사하다.
그러나 조건의 따른 실행의 경우 수가 많다면 switch문이 좋은 선택이 될 수 있다.

■ switch문의 기본 구성
switch문은 키워드 switch와 case, 그리고 default로 구성이 된다.

   switch (n) {
   case 1 :   <- n이 1이면 여기서부터 시작입니다.
      . . . .
      . . . .
   case 2 :   <- n이 2이면 여기서부터 시작하세요
      . . . .
      . . . .
   case 3 :   <- n이 3이면 여기서부터 시작입니다.
      . . . .
      . . . .
   default :  <- 이도 저도 아니면 여기서부터 시작!
      . . . .
   }
   
switch문을 이해하려면 키워드 case와 default가 지니는 의미를 먼저 이해해야 한다. 따라서 이를 이해하는 데서부터 시작을
하고자 한다. case와 default를 가리켜 '레이블(label)'이라 한다.

"레이블은 위치를 표시해 두기 위해 사용된다."

즉 case와 default는 위치 정보를 표시하기 위해 사용된다. switch문은 처음보면 다소 복잡하게 보인다.
그러나 case와 default가 위치 정보를 표시하는데 사용된 레이블이라는 사실을 알면 상당히 간단한 구성임을 알 수 있다.
예를 들어 case 2라는 레이블이 있다. 이는 다음 의미를 지닌다.

"n이 2이면, 이 위치부터 실행하겠습니다."

마찬가지로 case 3이라는 레이블은 다음의 의미를 지닌다.

"n이 3이면, 이 위치부터 실행하겠습니다."

그리고 case 레이블과 달리 default 레이블은 다음의 의미를 지닌다. 그리고 불필요하다면 생략도 가능하다.

"n에 해당하는 레이블이 없으면, 여기서부터 실행하겠습니다."

즉 레이블은 실행 위치를 지정하는 역할을 담당한다.
*/