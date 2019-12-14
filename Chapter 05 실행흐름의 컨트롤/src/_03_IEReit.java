public class _03_IEReit {

	public static void main(String[] args) {
		int num = 120;
		
		if (num < 0) {
			System.out.println("0 미만");
		}
		else {
			if (num < 100) {
				System.out.println("0 이상 100 미만");
			}
			else {
				System.out.println("100 이상");
			}
		}
	}

}

/*  
■ if~else문의 중첩 그리고 중괄호의 생략
필요하다면 if문, 그리고 if~else문 내에 또 다시 if문이나 if~else문을 삽입할 수 있다. 다음 예제에서 보이듯이 말이다.

6행의 비교연산에 의해서 num이 0보다 작다면 7행이 실행되면서 프로그램은 종료된다. 그러나 num이 0보다 작지 않으면
else의 중괄호 내에 존재하는 10~15행이 실행되는데, 이 부분도 if~else문으로 구성되어 있으므로 num이 100보다
작으면 11행이 실행되고 프로그램은 종료되며, 반대로 num이 100 이상이라면 14행이 실행되면서 프로그램은 종료된다.
즉 num의 값에 따라서 7행, 11행, 14행 중 하나만 실행이 되는 구조로써 다음과 같이 정리가 된다.

* num < 0 이라면 7행 실행
* 0 <= num <= 100 이라면 11행 실행
* 100 <= num 이라면 14행 실행

매우 간단한 것을 코드상에서 보니 오히려 복잡하다는 느낌이 든다. 그래서 위의 코드를 조금 변경하고자 한다.
우선 불필요한 중괄호를 빼 보자. 하나의 문장으로 이뤄진 경우에는 중괄호를 생략할 수 있으므로, 다음과 같이 변경이 가능하다.

   if (num < 0)
      System.out.println("0 미만");
   else {
      if (num < 100)
         System.out.println("0 이상 100 미만");
      else
         System.out.println("100 이상");
   }
   
그런데 아직 완벽하게 제거가 되지 않았다. 필자가 if~else문이 하나의 문장이라고 하지 않았는가?
따라서 위의 코드는 다음과 같이 되어야 제거 가능한 중괄호를 완벽히 제거한 꼴이 된다.

   if (num < 0)
      System.out.println("0 미만");
   else
      if (num < 100)
         System.out.println("0 이상 100 미만");
      else
         System.out.println("100 이상");

마지막으로 라인을 좀 정리하고자 한다. 여차피 라인의 조절은 코드에 영향을 미치지 않으니 다음과 같이 정리가 가능하다.

   if (num < 0)
      System.out.println("0 미만");
   else if (num < 100)
      System.out.println("0 이상 100 미만");
   else
      System.out.println("100 이상");
      
어떤가? 한결 간단하게 정리되지 않았는가? if~else문을 이렇게 구성하면 코드를 작성하기도, 코드를 분석하기도 한결
수월해진다. 그리고 위의 구조는 얼마든지 다음과 같은 형태로 일반화가 가능하다.

   if ( . . . )
      System.out.println(". . .");   ---
   else if ( . . .)
      System.out.println(". . .");   ---
   else if ( . . .)
      System.out.println(". . .");   ---   >   조건의 만족 여부에 따라서 하나만 실행
   else if ( . . .)
      System.out.println(". . .");   ---
   else
      System.out.println(". . .");   ---
      
얼마든지 중간에 else if (. . .)를 삽입할 수 있다. 그리고 if의 소괄호에 존재하는 모든 조건이 만족되지 않으면 마지막에
있는 else에 의해서 마지막 문장이 실행되므로, 최소한 하나의 문장은 실행되는 구조이다. 물론 중괄호를 이용해서 조건의
만족여부에 따라 둘 이상의 문장을 실행하도록 구성하는 것도 가능하다.
*/