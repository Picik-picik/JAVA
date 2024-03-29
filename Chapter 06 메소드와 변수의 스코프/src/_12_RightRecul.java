public class _12_RightRecul {

	public static void main(String[] args) {
		showHi(3);
	}
	
	public static void showHi(int cnt) {
		System.out.println("Hi~ ");
		if (cnt == 1)
			return;
		showHi(--cnt);
	}

}

/*
위의 예제를 통해서 기억해야 할 재귀 메소드 정의의 주의 사항 두 가지는 다음과 같다.

* 재귀의 연결 고리를 끊기 위한 조건검사의 위치가 적절해야 한다.
* 재귀의 연결 고리를 끊기 위한 조검검사가 true가 되도록 적절한 연산이 이뤄져야 한다.

마지막으로 재귀 메소드로 문제를 해결할 때에는 번번한 메소드의 호출(메소드의 호출이 완료되지 않은 상태에서 계속해서 메소드가
다시 호출됨.)이 문제가 될 수 있다. 이는 과도한 메모리의 사용으로 인해서 성능의 저하로 이어지기 때문이다. 그럼에도 불구하고
재귀 메소드가 지니는 다음의 장점으로 인해서 제귀는 자료구조와 알고리즘에서 매우 중요한 위치를 차지한다.

* 재귀적 사고는 복잡한 문제를 간결하게 해결하는 열쇠가 된다.
* 수백 줄 이상의 코드가 요구되는 문제를 불과 수십 중의 코드로 해결할 수 있다.

무엇보다도 이전과 달리 컴퓨터 성능의 놀라운 발전으로 인해서 실무 프로그램에서도 재귀 메소드를 활용하고 있다는 점에
주목할 필요가 있다.
*/