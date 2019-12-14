public class _27_ByTimes2 {

	public static void main(String[] args) {
		int i = 2, j;
		
		while (i < 10) {
			j = 1;
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
			System.out.println(" ");
		}
	}

}

/*
■ while문도 중첩해 봅시다.
반복문의 중첩을 for문을 통해서 이해하였다. 이 이해를 바탕으로 while문의 중첩도 시도해 보자.
기본 구성은 동일하다. for문의 예제를 통해서 얻은 이해를 그대로 반영하면 된다.
소스코드를 바로 보기에 앞서 여러분지 직접 while문의 중첩 형태로 ByTimes.java를 재 구현해보면 좋겠다.
만약에 성공한다면, 반복문의 중첩에 대한 자신감이 상당히 높아질 테니 말이다.

for문으로 구현했을 때보다 코드의 구성이 조금 더 복잡해보인다.
*/