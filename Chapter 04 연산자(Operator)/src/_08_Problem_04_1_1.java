public class _08_Problem_04_1_1 {

	public static void main(String[] args) {
		System.out.println("문제 4-1 [연산자의 활용과 연산의 특성 파악]");
		System.out.println("문제 1)");
		
		int num1 = 10, num2 = 20, num3 = 30;
		
		num1 = num2 = num3;
		
		System.out.println(num1);
		System.out.println("대입 연산자 = 는 오른쪽에 있는 값을 왼쪽에 대입하기 때문이다.");
	}

}

/*   
답안 해설
출력결과를 통해서 num1, num2, num3에 모두 30이 저장되어 있음을 알 수 있다. 그렇다면 이러한 결과가 나온 이유는
어디에 있을까?
위 예제 9행의 문장에는 = 연산자가 두 개 존재하는데, 이 연산자의 결합방향이 ←(오른쪽에서 왼쪽)이므로 오른쪽에 있는 = 연산이
먼저 진행된다. 즉 연산의 순서는 다음과 같다.

   num1 = (num2 = num3);

때문에 1차적으로 num3에 저장된 값이 num2에 저장이 되고, num2에 저장된 값이 다시 num1에 저장이 되어서
num1, num2, num3에 모두 30이 저장되는 것이다.
*/