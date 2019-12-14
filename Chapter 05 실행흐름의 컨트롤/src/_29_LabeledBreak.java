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
위 예제의 4행은 5행의 for문에 붙은 레이블이다. 즉 다음과 같이 구성되어야 할 것을 보기 좋게 두 줄에 걸쳐서 표현한 것으로 생각하면 된다.

   outerLoop : for (int i = 0; i < 10; i++)
   
그리고 9행의 break문은 "outerLoop라고 표시되어 있는 반복문을 빠져나가겠다!"는 선언으로 이해하면 된다.
결과적으로 9행의 실행은 5행의 바깥쪽 for문을 빠져나갔음을 실행결과를 통해서 확인할 수 있다.
*/