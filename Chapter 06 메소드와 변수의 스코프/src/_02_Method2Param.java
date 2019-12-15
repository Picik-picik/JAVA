public class _02_Method2Param {

	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}
	
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}

/*
메소드에 대해서 간단히 설명을 하였는데, 여러분이 공부하는 자바가 객체지향 프로그래밍 언어가 아니었다면,(절차지향 프로그래밍
언어였다면) 이 시점에서 메소드가 지니는 의미(또는 장점)도 함께 공부를 해야 한다. 그러나 여러분은 자바를 이용해서 객체지향
프로그래밍을 공부하고 있기 때문에, 아직은 이른 감이 있다. 따라서 이번 Chapter에서는 메소드의 문법적인 구성과 문제를 통한
기본적인 활용 능력을 키우는데 초점을 맞추기 바란다.
*/