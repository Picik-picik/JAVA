public class _02_VariableDecl {

	public static void main(String[] args) {
		double num1, num2, result;
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		
		System.out.println(result);
	}

}

/*
키워드 - 자바의 문법을 구성하는 단어를 의미 -> 자료형(data type)
자바에서 기본적으로 제공하는 자료형들은 총 8가지이다.

boolean / char / byte / short / int / long / float / double

종류에 따라서 크게 네 가지로 구분이 된다.
* 정수 표현            byte, short, int, long
* 실수 표현            float, double
* 문자 표현            char
* 참과 거짓의 표현      boolean

이중 정수의 표현에(저장에) 사용되는 자료형과 실수의 표현에 사용되는 자료형은 바이트의 크기에 따라서
그 종류가 둘 이상씩 되는데, 이는 표현하고자 하는(저장하고자 하는) 값의 범위에 다라서 적절한 자료형을
선택할 수 있도록 하기 위함이다. 물론 바이트 크기가 크면 그만큼 표현할 수 있는 값의 범위는 커지기 마련이다.

자바는 기본적으로 대소문자를 구분한다. Num1과 num1이라는 이름은 서로 다른 이름으로 인식된다.
때문에 자료형의 이름 int를 대신하여 Int를 사용할 수 없다. 변수의 이름을 짓는데 있어서 제약사항도 존재한다.

"변수의 이름은 숫자로 시작할 수 없습니다."
"$과 _ 이외의 다른 특수문자는 사용할 수 없습니다."
"키워드는 변수의 이름으로 사용할 수 없습니다."

대표적인 키워드
boolean   if         interface  class       true
char      else       package    volatile    false
byte      final      switch     while       throws
float     private    case       return      native
void      protected  break      throw       implements
short     public     default    try         import
double    static     for        catch       synchronized
int       new        continue   finally     const
long      this       do         transient   enum
abstract  super      extends    instanceof  null
이들은 외울 대상이 아니다. 다만 여러분이 앞으로 공부하게 될 내용들을 한번 보였을 뿐이다.

정수는 1바이트, 2바이트 그리고 8바이트로도 표현할 수 있다. 바이트 크기가 크면 클수록
표현할 수 있는 정수의 범위는 넓어진다. 그러나 값을 표현하는 기본 원리는 동일하다.

0 0 0 1 1 0 0 1
가장 왼쪽에 존재하는 비트는 부호를 표현하는데 사용이 된다.
0이면 양수, 1이면 음수를 의미하는데, 이 비트가 0인 경우 나머지 일곱 비트는 데이터의 양적인 크기를 의미한다.
나머지 일곱 비트가 0011001이므로 값은 +25

참고
- MSB(Most Significant Bit)
부호를 결정짓는 가장 왼쪽에 존재하는 비트를 가리켜 MSB라 한다. 가장 중요한 비트라는 뜻을 지닌다.
이 비트의 설정에 따라서 값의 부호도 달라지고, 나머지 일곱 비트의 해석방식도 달라지기 때문에
가장 중요한 비트임에 틀림이 없다.

"양의 정수 값에 2의 보수를 취하면 그것이 바로 음의 정수 값이 됩니다."

1과 2 사이에만도 무한개의 실수가 존재한다.
따라서 소수점 이하 자리수까지 표현해야 하는 실수를 컴퓨터로 표현하는데 한계가 있다.

정수는 오차 없이 표현이 가능하다. 오차 없이 완벽히 음의 정수와 양의 정수를 표현해 낼 수 있다.
그러나 오차를 허용하지 않으면서까지 그 광대한 실수를 표현한다는 것은 불가능하다.
때문에 결국엔 다음과 같은 결론에 도달하게 된다.

"정밀도를 포기하고, 대신에 표현의 범위를 넓히자."

정밀도만 포기하면 폭넓게 실수를 표현할 수 있다.

참고
- IEEE(Institute of Electrical and Electronics Engineers)
미국에 있는 IEEE('아이 트리플 이'라 읽는다)는 전기전자공학의 최대 기술조직으로서 주요 표준을 결정하고
발전시키는 역할을 담당한다. 이곳에서 실수 표현방식에 관한 표준도 정의를 하였으며, 이를 가리켜 IEEE 754라 한다.
따라서 여러분이 실수 표현의 정확한 표준을 알고 싶다면 IEEE 754에서 정의하고 있는 32비트로 표현되는
단정도(Single precision)와 64비트로 표현되는 배정도(double precision)를 살펴보면 된다.

정수의 표현방식과 실수의 표현방식을 알게 되었다. 중요한 것은 표현방식이 다르다는 사실뿐만 아니라,
실수의 표현에 오차가 존재할 수 밖에 없는 이유를 이해하는 것이다.
*/
