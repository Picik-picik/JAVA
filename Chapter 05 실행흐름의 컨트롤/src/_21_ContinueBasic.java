public class _21_ContinueBasic {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while (num++ < 100) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;
			count++;
			System.out.println(num);
		}
		
		System.out.println("count : " + count);
	}

}

/*
■ continue문
이번에 소개할 continue문은 break문과 헷갈릴 수 있어서 정확한 이해가 필요하다. continue문은 반복문의 탈출과
거리가 멀다. continue문은 실행하던 반복문의 나머지 부분을 생략하고 프로그램의 흐름을 조건검사 부분으로 이동시킬 뿐이다.

   while (n < 100){
      if (x == 20)
         break;   -> while문 탈출 ↓
      . . . . .
   }
   . . . . .

   while (n < 100){
      if (x == 20)
         continue;   -> 조건 검사로 이동 ↑
      . . . . .
   }
   . . . . .

continue문을 만나게 되면, 반복문의 나머지 부분을 실행하지 않고, 반복문의 맨 위로 이동하여 조건검사부터 다시 실행을
이어나간다.(단, do~while문의 경우 조건검사가 존재하는 맨 아래로 이동)

위 예제는 매우 간단하지만, continue문이 활용되는 전형적인 모델을 보여준다. 그리고 이를 정확히 이해했다면
continue문이 if문과 함께 유용하게 사용될 수 있음을 알 수 있을 것이다.
*/