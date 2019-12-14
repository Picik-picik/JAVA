public class _01_IEBasic {

	public static void main(String[] args) {
		if (true) {
			System.out.println("if & true");
		}
		
		if (false) {
			System.out.println("if & false");
		}
		
		else {
			System.out.println("if~else & false");
		}
	}

}

/*  
특정 조건이 만족될때에만 실행하고픈 문장이 있다면 키워드 if를 사용하면 된다. 그리고 조건에 따라서 실행하고픈 문장을
달리하고 싶다면 키워드 else를 추가로 사용하면 된다.

■ if문과 if~else문
영어는 문장을 통으로 공부하는 것이 효율적이라고 했던가? 자바의 각종 문법들도 예제를 통해서 통으로 공부하는 것이 효율적이다.

위 예제 4행~6행에서 보이는 부분을 가리켜 if문이라 하는데,(둘 이상의 라인에 형성되어 있어도 하나의 문장으로 간주한다.)
이 문장의 기본골격은 다음과 같다.

   if (true or false) {
      // true 시 실행되는 영역
   }
   
먼저 키워드 if의 오른편에 있는 소괄호를 보자. 이 소괄호에는 참과 거짓을 의미하는 true 또는 false가 오게 되어 있다.
그리고 이곳에 true가 오면, 이어서 등장하는 중괄호 내부가 실행되고, 반대로 false가 등장하면 중괄호 내부가 실행되지 않는
방식으로 if문은 동작한다. if문의 소괄호에 true가 왔으니, 중괄호 내에 존재하는 5행은 당연히 실행이 된다. 만약에
이 부분에 false를 삽입하고 다시 컴파일 및 실행을 한다면 5행이 실행되지 않음을 확인할 수 있다.
물론 if문의 소괄호 안에다가 대 놓고 true 또는 false를 써 넣는 일은 없다. 처음부터 false를 써 넣을 생각이었다면
애초에 문장을 삽입하지 않으면 되고, true를 써 넣을 생각이었다면 if문 없이 그냥 실행하고픈 문장을 삽입하면 되니 말이다.
true 또는 false가 올 수 있다는 것은 true 또는 false를 반환하는 연산문이 올 수 있다는 것으로 확장이 가능하기 때문에
의미가 있는데, 잠시 후에 별도로 예제를 제시하겠다.

   if (true or false) {
      // true 시 실행되는 영역
   }
   
   else {
      // false 시 실행되는 영역
   }
   
if~else문은 소괄호에 true가 오면 if에 이어서 등장하는 중괄호 내부가 실행되고,
if의 소괄호에 false가 오면 else에 이어서 등장하는 중괄호 내부가 실행이 된다.
*/