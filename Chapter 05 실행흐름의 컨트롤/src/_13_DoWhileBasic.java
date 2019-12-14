public class _13_DoWhileBasic {

	public static void main(String[] args) {
		int num = 0;
		
		do {
			System.out.println("I like Java " + num);
			num++;
		} while (num < 5);
	}

}

/*
■ do~while 반복문
while문과 do~while문의 유일한 차이점은 반복조건 검사의 시점에 있다. while문은 반복조건을 검사한 다음에 실행여부를
결정하는 반면, do~while문은 일단 한번 실행을 한 다음에 반복의 조건을 검사한다.

   do {
      System.out.println("I like Java " + num);  // 반복
      num++;                                     // 영역
   } while (num < 5);  // 반복 조건
   
do~while문은 while문과 달리 반복의 조건을 마지막 부분에 명시하게 되어 있다. 따라서 while문과는 달리 다음의 순서대로
실행이 된다.

   반복영역 실행 -> 반복조건 검사 -> true면 반복영역 실행 -> 반복 조건 검사 -> . . . .
   
do~while문은 while문과 달리 반복의 영역을 일단 한번 실행한 다음에 반복조건을 검사한다.
따라서 do~while문의 특징을 정리하면 다음과 같다.

* 반복영역을 먼저 실행 한 다음에 반복조건을 검사한다.
* 반복영역을 먼저 실행하기 때문에, 반복조건을 만족하지 않더라도 한 차례는 실행된다.

그래서 최소한 한 차례의 실행을 필요로 하는 경우에는 do~while문을 쓰고, 그 이외의 경우에는 while문, 또는 잠시 후에
소개하는 for문을 사용하는 것이 일반적이다.
*/