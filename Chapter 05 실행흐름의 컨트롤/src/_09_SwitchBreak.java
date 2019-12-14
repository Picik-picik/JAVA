public class _09_SwitchBreak {

	public static void main(String[] args) {
		int n = 3;
		
		switch (n) {
		case 1 :
			System.out.println("Simple Java");
			break;
		case 2 :
			System.out.println("Funny Java");
			break;
		case 3 :
			System.out.println("Fantastic Java");
			break;
		default :
			System.out.println("The best programming language");
		}
	
		System.out.println("Do you like coffee?");
	}

}

/*   
■ switch문 + break문 : switch문의 일반적인 사용 모델
실행의 흐름을 컨트롤하는데 사용되는 키워드 중에서 break라는 것이 있다. 이는 switch문 안에서 사용할 수 있으며,
switch문 안에서는 다음의 의미를 지닌다.

"switch문을 그냥 빠져 나가겠습니다!"

따라서 switch문 안에서 break문을 적절히 활용하면, 다음과 같은 구조의 실행을 기대할 수 있다.
전에 보여준 switch문은 특정 레이블의 위치부터 switch문의 마지막까지 쫙~ 실행하는 구조였다면,
지금 보여드리는 형식은 각 레이블마다 영역을 형성하여, 해당 영역만 실행하는 구조이다.

   switch (n) {
   case 1 :    --
      . . . .  -- <- case 1 영역
      break;   --
   case 2 :      --
      . . . .    -- <- case 2 영역
      break;     --
   case 3 :        --
      . . . .      -- <- case 3 영역
      break;       --
   default :         -- <- default 영역
      . . . .        --
   }
   
실질적인 차이는 break문의 존재여부 하나이다. 하지만 이 break문 덕분에 레이블 별로(case 1, 2, 3, default)
영역을 형성하여, 해당 영역만 실행할 수 있게 되었다. 예를 들어 switch문에 2가 전달되었다고 가정해 보자. 그렇다면 일단
case 2의 위치로 이동해서 실행을 시작할 것이다. 그러다가 break문을 만나면서 switch문을 벗어나게 된다.
결과적으로는 case 2가 구성한 영역만 실행이 된다.

레이블(라벨)을 책의 한 페이지에 둘 이상 붙일 수 있듯이, switch문의 레이블 역시 한 줄에 둘 이상 붙일 수 있음을 기억하고
필요 시 활용하기 바란다. 즉 다음과 같은 형태의 switch문 구성도 가능하다는 것을 기억하자.

   switch (n) {
   case 1 : case 2 : case 3 :
      System.out.println("Simple Java");
      break;
   case 4 : case 5 :
      System.out.println("Funny Java");
      break;
   . . . . .
   }
   
위의 switch문의 경우 switch문에 전달되는 정수가 1, 2, 3인 경우, 동일하게 다음의 두 문장이 실행된다.

      System.out.println("Simple Java");
      break;
      
그리고 switch문에 전달되는 정수가 4, 5인 경우에는 동일하게 다음의 두 문장이 실행된다.

      System.out.println("Funny Java");
      break;
*/