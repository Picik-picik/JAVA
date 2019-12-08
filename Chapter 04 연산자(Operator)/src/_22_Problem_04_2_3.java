public class _22_Problem_04_2_3 {

	public static void main(String[] args) {
		System.out.println("문제 4-2 [비트 연산자 그리고 비트 쉬프트 연산자]");
		System.out.println("문제 3)");
		
		int num = 7;
		int bitset = 1 << 30;
		num |= bitset;   // num = num | bitset;
		System.out.println(num);
		System.out.println(num <<= 1);
		
		num = -12;
		bitset = ~0;
		bitset ^= (1 << 30);   // bitset = bitset ^ (1<<30);
		num &= bitset;         // num = num & bitset;
		System.out.println(num);
		System.out.println(num <<= 1);
	}

}

/*   
답안 해설
예제를 작성하기에 앞서 어떠한 경우에 엉뚱한 결과를 보이는지 먼저 파악해야 한다. 먼저 int형 양의 정수에서 문제가 발생하는
경우를 예로 들면 다음과 같다.

   01000000 00000000 00001000 00100000
   
이 비트의 열의 왼쪽에서 두 번째 비트는 현재 1이다. 이러한 정수를 왼쪽으로 한 칸씩 이동시키면 다음과 같이 되어서 음의 정수가
되어버린다.

   10000000 00000000 00010000 01000000
   
이렇듯 비트의 이동으로 인해서 MSB가 0에서 1로 바뀌면 엉뚱한 결과를 보이게 된다. 유사하게 다음과 같은 int형 음의 정수를
왼쪽으로 한 칸씩 이동시켜도 문제가 발생한다.

   10000001 00000000 11100000 01110000
   
이동의 결과, 1이었던 MSB가 다음과 같이 0으로 바뀌어서 전혀 상관이 없는 양의 정수가 되어버린다.
   
   00000010 00010001 11000000 11100000
   
종합해 보면 MSB가 0에서 1로, 그리고 1에서 0으로 바뀌는 상황에서 엉뚱한 결과가 만들어진다고 정리할 수 있다.
그럼 예제를 통해서 이를 다시 한번 확인해 보겠다. 그런데 이의 확인을 위한 예제의 작성이 그리 쉽지만은 않다.
코드상에서 2진수를 직접 표현하는 방법이 없기 때문이다.

위 예제 7행에서는 변수 num을 선언과 동시에 양의 정수 7로 초기화하고 있다. 이제 비트 쉬프트 연산을 했을 때,
MSB가 0에서 1로 바뀔 수 있도록 변수 num의 31번재 비트(MSB의 바로 오른편에 있는 비트)에 1을 채워주고자 한다.
이를 위해서 8행에서는 변수 bitset을 선언하고 1 << 30의 연산결과로 초기화하였다. 따라서 변수 bitset에는 다음의
비트 열이 저장된다. 이는 정수 1의 비트 열을 30칸 왼쪽으로 이동시킨 결과이다.

   01000000 00000000 00000000 00000000
   
따라서 9행의 연산에 의해서 변수 num의 31번째 비트는 1이 된다. 이제 11행의 출력결과를 통해서 MSB가 0에서 1로 변경되었음
을 확인할 수 있다.

음수와 관련해서도 이와 유사한 방식으로 진행이 되고 있다. 일단  13행에서는 변수 num에 -12를 저장하고 있다.
이제 비트 쉬프트 연산을 했을 때, MSB가 1에서 0으로 바뀔 수 있도록 변수 num의 31번째 비트를 0으로 바꿔줄 차례이다.
이를 위해서 14행에서는 정수 0의 비트 열을 반전시켜서 다음의 비트 열 정보를 변수 bitset에 저장하였다.

   11111111 11111111 11111111 11111111
   
그리고 15행의 연산에 의해 bitset에 저장된 비트 열의 정보는 다음과 같이 변경된다.(31번째 비트가 0으로 바뀌었다.)

   10111111 11111111 11111111 11111111
 
따라서 16행의 연산에 의해서 변수 num의 31번째 비트는 0이 된다. 이제 18행의 출력결과를 통해서 MSB가 1에서 0으로 변경되었음
을 확인할 수 있다.
*/