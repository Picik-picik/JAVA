public class _11_InfRecul {

	public static void main(String[] args) {
		showHi(3);
	}
	
	public static void showHi(int cnt) {
		System.out.println("Hi~ ");
		showHi(--cnt);  // 원래 cnt--이었음. --cnt로 교체. 하지만 여전히 문제를 보인다.
		if (cnt == 1)
			return;
	}

}

/*
■ 잘못된 재귀 메소드의 정의 : 종료 조건이 없어요!
이번에는 잘못 정의된 재귀 메소드를 통해서 주의사항을 살펴보겠다.

위 예제의 showHi 메소드는 재귀의 고리를 끊을 수 없다. 이유는 10행의 조건을 만족시킬 수 없기 때문이다.
9행에 보면 cnt의 값을 감소시키는 코드가 다음의 형태로 존재한다.

   cnt--
   
문제가 무엇인가? -- 연산자가 cnt 변수 뒤에 붙었기 때문에 9행의 메소드 호출을 통해서 인자(매개변수에 전달되는 값)가
전달되고 난 다음에야 비로소 cnt의 값이 하나 감소한다. 따라서 4행에서 전달된 값 3은 줄지 않고 계속해서 매개변수의 초기화 값으로
사용이 된다. 이것이 바로 위 예제의 첫 번째 문제점이다. 그럼 이 문제를 해결해보자. 대략 다음과 같은 형태로 고쳐서 쉽게 해결이 가능하다.

   --cnt
 
이제 모든 문제가 해결이 되었는가? 아니다. 문제는 여전히 남아있다. 분명 cnt의 값은 하나씩 줄어들면서 showHi 메소드의 인자
로 전달이 된다. 그러나 재귀의 고리는 끊을 수 없다. 위 예제의 10행, 11행이 실행되지 않기 때문이다. 즉 재귀의 고리를 끊기
위한 조건 검사의 위치가 잘못 지정되었다. 조건 검사는 재귀 메소드가 호출되기 이전에 이뤄져야 한다. 그래야 조건 검사를 재귀의 매 과정마자
진행할 수 있을 것 아닌가? 따라서 위 예제는 다음과 같이 정정되어야 한다.
*/