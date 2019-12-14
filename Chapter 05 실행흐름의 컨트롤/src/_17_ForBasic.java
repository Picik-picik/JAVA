public class _17_ForBasic {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			System.out.println("I love Java " + i);
	}

}

/*
■ for 반복문
while문을 이용해서 "I love Java"라는 문장을 총 5회 출력하기 위해서는 다음의 형태로 문장을 구성해야 한다.

   int num = 0;	
   while (num < 5) {
      System.out.println("I love Java");
      num++;
   }

그런데 이처럼 반복의 횟수가 정해져 있는 상황에서는 for문을 이용하여 다음과 같이 보다 간단히 구현할 수가 있다.
(반복의 대상이 한 문장이므로 중괄호는 생략 가능하다.)

   for (int num = 0; num < 5; num++) {
      System.out.println("I love Java");
   }

이렇듯 정해진 횟수의 반복을 위해서 존재하는 것이 for문이다.

   int num = 0;   <- 1.
   while (num < 5) {   <- 2.
      System.out.println("I love Java");
      num++;   <- 3.
   }

        1.           2.       3.
   for (int num = 0; num < 5; num++) {
      System.out.println("I love Java");
   }
   
while문과 for문의 1, 2, 3이 갖는 의미는 둘 다 다음과 같다.
1. -> 반복의 횟수를 세기 위한 변수
2. -> 반복의 조건
3. -> 반복의 조건을 무너뜨리기 위한 연산

for문은 while문과 달리 반복에 필요한 모든 것을 한 줄에 나열하고 있음을 알 수 있다. 이것이 바로 for문의 장점이다.

        1.         2.     4.
   for (int i = 0; i < 3; i++)
      System.out.println("I love Java " + i);  3.

첫 번째 루프의 흐름
1 > 2 > 3 > 4 [i=1]
두 번째 루프의 흐름
2 > 3 > 4 [i=2]
세 번째 루프의 흐름
2 > 3 > 4 [i=3]
네 번째 루프의 흐름
2 [i=3] 따라서 탈출 !

for문에 진입하게 되면 제일 먼저 변수의 선언 및 초기화가 이뤄진다. 그리고 반복의 조건이 만족되는지를 확인한 다음에
반복영역을 실행하게 된다. 그리고 나서 마지막으로 i 값의 증가가 진행되어, for문을 한 바퀴 돌고 나면, i는 1이 된다.
그 다음부터는 변수의 선언을 제외한 나머지 과정을 반복한다고 생각하면 된다. 즉 2, 3, 4를 순서대로 반복 실행하게 된다.

참고
- for문과 콤마 연산자
콤마 연산자를 이용해서 다음의 형태로 for문을 구성하는 것도 가능하다.
   for (int i=0, i = 7; i < j; i++, j--)
      System.out.println("I love Java " + i + j);
      
반복의 조건을 명시하는 위치에는 콤마 연산자를 사용할 수 없지만, 그 이외의 영역에서는 콤마 연산자를 사용해서 둘 이상의 변수
선언 및 둘 이상의 연산문 삽입이 가능하다. 참고로 위의 문장을 실행하면 다음의 출력결과를 확인할 수 있다.
I love Java 07
I love Java 16
I love Java 25
I love Java 34

그리고 for문의 반복을 위해 1에 선언되는 변수는 for문 내에서만 유효한 변수이다. 따라서 for문의 외부나 다른 for문
내에서는 동일한 이름의 변수 선언이 가능하다.
*/