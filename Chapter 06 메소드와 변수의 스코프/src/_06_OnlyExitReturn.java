public class _06_OnlyExitReturn {

	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
	}
	
	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 값을 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 : " + (num1 / num2));
	}

}

/*
■ 키워드 return이 지니는 두 가지 의미
키워드 return에 대해서 조금 더 설명하고자 한다. return은 다음 두 가지 의미를 담고 있다.

* 값의 반환
* 메소드의 종료

따라서 메소드 중간에 return문이 실행되면, 메소드의 나머지 부분은 실행이 이뤄지지 않고 메소드를 빠져나가게 된다. 그리고
다음 예제에서 보이듯이 반환형으로 void 표시가 된 메소드 내에서도 값의 반환 목적이 아닌, 오로지 메소드의 종료를 목적으로
return문을 사용할 수 있다.

위 예제 12행에 있는 return문은 반환의 대상 없이 그냥 키워드 return으로만 구성이 되어있는데, 이것이 의미하는 바는
다음과 같다.

"값을 반환하지 않고, 단순히 이 메소드를 빠져나가겠다(종료하겠다)."

따라서 반환형이 void인 메소드 내에서도 return문은 삽입이 가능하다. 반환의 대상만 명시하지 않으면 말이다.
*/