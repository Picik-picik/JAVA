public class _01_MethodDefAdd {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램의 끝");
	}

	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
	}
}

/* 
우리는 예제를 작성할 때마다 main이라는 이름의 메소드를 정의하고 있다. 그리고 우리는 이 메소드가 실행되는 원리를 이해함으로써
메소드의 기본적인 성질을 파악할 수 있다.

■ main 메소드에 대해서 우리가 아는 것과 모르는 것
main이 메소드이고, 이 메소드는 클래스라는 것의 내부에 존재해야 함을 간단히 보였으며, 지금까지 작성한 많은 예제들을 통해서
이미 이러한 사실에는 익숙ㅎ져 있으리라 생각한다. 그렇다면 다음의 메소드를 보면서, 우리가 아는 것과 모르는 것들을 정리해 보겠다.

   public static void main(String[] args) {
      int num1 = 5, num2 = 7;
      System.out.println("5 + 7 = " + (num1 +num2));
   }
   
아는 것은 다음 두 가지 정도로 정리가 된다.

* 메소드의 이름은 main이다.
* 메소드의 중괄호 내에 존재하는 문장들이 위에서 아래로 순차적으로 실행된다.

모르는 것들은 다음과 같다.

* public, static 그리고 void가 왜 붙어있어야 하는가?
* 이름은 왜 항상 main이어야 하는가?
* 메소드의 이름 옆에 있는 소괄호와 그 안에 존재하는 String[] args, 이건 또 뭔가?

이번 Chapter에서도 public과 static에 대해서는 언급하지 않는다. 이 둘은 보다 적절한 시기에 설명하는 것이 여러분의
이해에 부담이 없기 때문이다. 따라서 당분간은 "그냥 붙여줘야 하는 키워드" 정도로 기억하고 있자. 아쉽지만 말이다.

■ 다른 이름의 메소드를 만들어 보자.
우리가 지금까지 만들어온 메소드의 이름이 항상 main인 이유는 다음과 같은 약속에 근거를 한다.

"자바 프로그램의 시작은 main이라는 이름의 메소드를 실행하는 데서부터 시작한다."

따라서 프로그램의 시작을 목적으로 메소드를 만드는 것이 아니라면, 굳이 이름이 main일 필요는 없다.
즉 다음과 같이 main이 아닌 다른 이름의 메소드도 얼마든지 만들 수 있다.

   public static void hiEveryone(int age) {
      System.out.println("좋은 아침입니다.");
      System.out.println("제 나이는 " + age + "세 입니다.);
   }
   
위 메소드의 이름은 hiEveryone이다. 따라서 이러한 경우 "hiEveryone"이라는 이름의 메소드를 정의하였다."라고 한다.
메소드를 만드는 것을 가리켜 '메소드의 정의'라 하기 때문이다. 그럼 이번에는 메소드의 이름 오른편에 있는 소괄호를 보자.
이곳에는 age라는 이름의 변수 선언이 와 있다. main 메소드의 경우에는 "String[] args"라는 선언이 와 있었는데, 이것
역시 일종의 변수 선언이다. 다만 아직 우리가 이해하기에는 무리가 있는 변수선언이므로, 필자는 이를 대신하여, 우리가 이해할
수 있는 변수의 선언을 삽입하였다.

여러분은 실행결과와 소스코드를 참조하여 메소드의 호출과 관련된 프로그램의 흐름을 이해할 수 있을 것이다.
5행에서 hiEveryone 메소드가 호출되면서 값의 전달이 이뤄지고, hiEveryone 메소드가 실행된 후 다시 반환이 되어서
5행으로 돌아온다.

"메소드 호출문을 접하면, 해당 메소드의 실행이 완료된 다음에야 비로소 그 다음을 실행하게 된다."

더불어 위 예제를 통해서 추가로 다음 사항들도 이해할 수 있다.

* 메소드의 이름 오른편에 등장하는 변수에 저장되는 값에 대하여
* 메소드의 실행방법과 데이터를 전달하는 방법
* 메소드는 한번 정의되면 여러 번 실행이 가능하다는 사실

메소드의 정의에서 메소드의 이름 오른편에 등장하는 변수를 가리켜 '매개변수(parameter)'라 하는데, 위 예제에서 보이듯이,
메소드의 호출 시 전달되는 값의 저장을 위한 용도로 사용되므로, 메소드 호출 시 전달되는 값의 자료형과 매개변수의 자료형은
항상 일치해야 한다. 또한 메소드가 정의되는 위치는 프로그램에 영향을 미치지 않음도 기억하자. 즉 위 예제의 경우 main 메소드가
hiEveryone 메소드보다 먼저 등장을 하건, 나중에 등장을 하건 프로그램의 실행결과에는 아무런 차이가 없다.
*/