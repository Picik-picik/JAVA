public class _05_Boolean {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(3 < 4);
		System.out.println(3 > 4);
	}

}

/*
'참'과 거짓을 표현하기 위한 자료형 : boolean
논리형이라고도 한다. 프로그램상에서는 참과 거짓을 표현해야만 하는 상황이 매우 빈번하게 등장한다.
그래서 자바는 참과 거짓의 표현을 위해서 두 개의 키워드를 정의하고 있다.

* true  참을 의미하는 값
* false 거짓을 의미하는 값

true와 false는 그 자체를 '참'과 '거짓'의 표현을 위한 약속된 형태의 데이터로 인식하는 것이 적절하다.
그리고 이러한 데이터의 표현 및 변수 선언을 위해 정의된 자료형을 boolean으로 인식하기 바란다.
앞으로 true와  false가 유용하게 사용되는 상황을 조금씩 접하게 될 것이다.
그러한 과정을 거치며 true와 false, 그리고 더불어서 boolean에 대해서도 구체적으로 이해하게 될 것이다.

앞서 Chapter 01에서 우리는 System.out.println(3+5)의 결과로 8이 출력됨을 확인하였다.
이는 3+5의 연산결과로 8이 만들어진 결과인데, 이러한 현상을 보고 일반적으로 "8이 반환되었다."라고 표현한다.
여러분은 반환되었다는 표현을 "연산의 결과로 값이 만들어졌다."는 듯으로 이해하면 되겠다.
부등호가 나타내는 바가 참이라면 true, 거짓이라면 false를 반환하는 연산자들이다.
부등호 연산이 끝나서 다음의 문장으로 이루어진다고 볼 수 있다.

System.out.println(true);
System.out.println(false);

그리하여 각각 true와 false가 출력되었다. 이처럼 true와 false는 참과 거짓을 표현하는 용도로 사용이 되는데,
이는 하나의 예일 뿐이고, 보다 의미 있게 사용이 된다는 사실만 기억하면 좋겠다.
*/