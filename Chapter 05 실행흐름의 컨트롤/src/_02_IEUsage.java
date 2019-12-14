public class _02_IEUsage {

	public static void main(String[] args) {
		int num = 10;
		
		if (num > 0)
			System.out.println("num은 0보다 크다.");
		
		if ((num % 2) == 0) 
			System.out.println("num은 짝수");
		else
			System.out.println("num은 홀수");
	}

}

/*   
실행시킬 문장이 하나라면 중괄호를 생략할 수 있다.

참고
- if~else문은 하나의 문장입니다.
자바는 하나의 문장을 둘 이상의 라인에 구성할 수 있을 뿐 아니라, 두 개의 문장을 하나의 라인에 구성할 수도 있다.
즉 자바에서 라인의 수는 결코 중요하지 않다. 앞서 설명한 if~else문도 하나의 문장이다. 따라서 반드시 한 줄에 표현해야
할 필요는 없지만, 그 중간에 다른 문장이 오면 에러가 발생한다.
*/