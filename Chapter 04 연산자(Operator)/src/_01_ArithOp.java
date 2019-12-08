public class _01_ArithOp {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;
		
		int result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
		
		result = n1 - n2;
		System.out.println("뺄셈 결과 : " + result);
		System.out.println("곱셈 결과 : " + n1 * n2);
		System.out.println("나눗셈 결과 : " + n1 / n2);
		System.out.println("나머지 결과 : " + n1 % n2);
		/* 
		프로그래머들 중 상당수는 연산자의 우선순위를 고려해서 문장을 구성하지 않는다.
		즉 위 예제의 12, 13, 14행은 다음과 같이 구성하는 것이 일반적이다.
		
	  	   System.out.println("곱셈 결과 : " + (n1 * n2));
		   System.out.println("나눗셈 결과 : " + (n1 / n2));
		   System.out.println("나머지 결과 : " + (n1 % n2));
		
		이러한 소괄호를 가리켜 '구분자'라 하는데, 이는 여러분이 알고 있는 수학에서의 소괄호와 의미가 동일하다.
		따라서 이렇게 소괄호로 연산문의 일부를 묶어주면, 묶여있는 부분이 먼저 연산이 된다.(구분이 되어 먼저 연산이 된다)
		그리고 이렇게 소괄호를 사용하면, 연산자의 우선순위를 기억하지 않고도
		원하는 형태의 연산문을 구성할 수 있기 때문에 실수를 할 확률도 줄어든다.
		때문에 프로그래머들 중 상당수는 이렇듯 소괄호를 이용해서 연산자의 연산순서를 결정한다.
		*/
	}

}

/*
이항 연산자(binary operator)란 피연산자가 둘인 연산자를 의미한다.
따라서 앞서 본 + 연산자와 = 연산자도 이항 연산자에 속한다.

■ 자바의 연산자
일단 자바에서 제공하는 모든 연산자를 하나의 표로 정리하고자 한다.
이는 이후에 참조할 수 있도록 편의를 제공하기 위한 것이다.

연산기호                                                                                 결합방향     우선순위
[], .                                         →       1(높음)
expr++, expr--                                ←       2
++expr, --expr, +expr, -expr, ~, !, (type)    ←       3
*, /, %                                       →       4
+, -                                          →       5
<<, >>, >>>                                   →       6
<, >, <=, >=, instanceof                      →       7
==, !=                                        →       8
&                                             →       9
^                                             →       10
|                                             →       11
&&                                            →       12
||                                            →       13
? expr : expr                                 ←       14
=, +=, -=, *=, &=, ^=, |=, <<=, >>=, >>>=     ←       15(낮음)

위의 표를 보면 '결합방향'과 '우선순위'에 대한 정보를 볼 수 있는데, 이들은 하나의 연산식 안에 둘 이상의 연산자가
존재하는 경우의 연산 진행 순서를 결정하는 요소들이므로 부담을 가질 필요가 없다.

다음 수식을 계산해 본다고 할 때 
2 - 1 - 3 X 2

당연히 곱셈을 먼저 진행해야 한다. 그리고 이는 다음과 같은 수학적 배경을 기초로 한다.

"덧셈과 뺄셈보다는 곱셈과 나눗셈이 먼저 계산되어야 한다."

이것이 바로 연산자의 '우선순위'이다. 즉 여러분은 이미 연산자의 우선순위를 바탕으로 수학문제를 풀어온 것이다.
곱셈이 계산되었으니 뺄셈만 두 개 남았다. 어떤 뺄셈을 먼저 하느냐에 따라서 결과가 달라지는데,
이 때에는 다음과 같은 수학적 배경을 기초로 계산이 이뤄진다.

"뺄셈은 왼쪽에서부터 순서대로 진행한다."

이를 컴퓨터 프로그래밍에서는 다음과 같이 이야기 한다.

"뺄셈 연산자의 결합방향은 왼쪽에서 오른쪽으로 이동한다."

즉 동일한 연산자가 하나의 연산식 안에 둘 이상 놓여있을 때, 연산의 순서를 결정짓는 요소가 바로 연산자의 '결합방향'이다.
결합뱡항이 두 가지로 표시되고 있다.
하나는 ← 인데 이는 결합방향이 오른쪽에서 왼쪽으로 이동함을 의미한다. 쉽게 말해서 오른쪽에 있는 연산자부터 먼저 계산됨을 의미한다.
다른 하나는 → 인데 이는 결합방향이 왼쪽에서 오른쪽으로 이동함을 의미한다. 즉 왼쪽에 있는 연산자부터 먼저 계산됨을 의미한다.
정리하면 연산식의 연산순서를 결정짓은 1차적인 요소는 연산자의 '우선순위'이고, 2차적인 요소는 연산자의 '결합방향'이다.

■ 대입 연산자(=)와 산술 연산자(+, -, *, /, %)
지금 소개하는 대입 연산자와 산술 연산자는 대표적인 이항 연산자들이다.

연산자    연산자의 기능                                                                                              결합방향
=     연산자 오른쪽에 있는 값을 연산자 왼쪽에 있는 변수에 대입한다.                ←
            예) val = 20;            
+     두 피연산자의 값을 더한다.                                       →
            예) val = 4 + 3;
-     왼쪽의 피연산자의 값에서 오른쪽 피연산자 값을 뺀다.                       →
            예) val = 4 - 1;
*     두 피연산자의 값을 곱한다.                                       →
            예) val = 4 * 3;
/     왼쪽의 피연산자 값을 오른쪽의 피연산자 값으로 나눈다.                      →
            예) val = 7 / 3;
%     왼쪽의 피연산자 값을 오른쪽의 피연산자 값으로 나눴을 때 얻게 되는 나머지를 반환한다.  →
            예) val = 7 % 3;
*/ 