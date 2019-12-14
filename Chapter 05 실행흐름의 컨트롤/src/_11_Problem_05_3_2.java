public class _11_Problem_05_3_2 {

	public static void main(String[] args) {
		System.out.println("문제 5-3 [switch문의 이해와 활용]");
		System.out.println("문제 2)");
		
		int n = 24;
		
		switch (n / 10) {
		case 0 :
			System.out.println("0 이상 10 미만의 수");
			break;
		case 1 :
			System.out.println("10 이상 20 미만의 수");
			break;
		case 2 :
			System.out.println("20 이상 30 미만의 수");
			break;
		default :
			System.out.println("음수 혹은 30 이상의 수");
		}
	}

}