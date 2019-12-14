public class _20_BreakBasic {

	public static void main(String[] args) {
		int num = 1;
		boolean search = false;
		
		while (num < 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				search = true;
				break;
			}
			num++;
		}
		
		if (search)
			System.out.println("찾는 정수 : " + num);
		else
			System.out.println("찾지 못했습니다.");
	}

}

/*   
continue와 break는 반복문 내에 삽입이 되어, 반복문의 실행 흐름을 조절하는데 사용되는 키워드이다.
따라서 이 둘을 적절히 활요하면, 보다 다양한 형태의 반복문을 구성할 수 있다.

■ break문
break문은 앞서 switch문을 빠져나가는 용도로 소개한 바 있는데, 마찬가지로 반복문을 빠져나가는 용도로도 사용이 된다.
보통은 if문과 함께 사용이 되어서 특정 조건이 만족될 때, 반복문을 빠져나가도록 구성이 된다.

이렇게 break문을 실행하게 되면, 해당 break문을 감싸고 있는 반복문 하나를 빠져나가게 된다.
물론 break문을 직접 감싸고 있는 것은 if문이다. 그러나 이는 문제가 되지 않는다. break문이 실행되면, 가장 근접한
거리에서 자신을 감싸는 반복문을 찾아서, 해당 반복문을 빠져나가기 때문이다. 즉 break문이 실행되면, 이 break문을
가장 근접한 거리에서 감싸는 while문을 빠져나가게 된다. 그리고 이어서 15행을 실행하게 된다.
이처럼 break문은 그 이름이 의미하듯이 반복문의 반복을 중단시킨다. 그리고 이러한 break문의 기능을 정확히 이해했다면,
위의 예제에서는 1이상 100미만의 자연수 중에서 5의 배수이자 7의 배수인 가장 작은 자연수를 찾아서 출력하고 있음을 알 수 있다.
*/