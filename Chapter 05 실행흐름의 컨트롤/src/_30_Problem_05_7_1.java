public class _30_Problem_05_7_1 {

	public static void main(String[] args) {
		System.out.println("문제 5-7 [반복문의 중첩]");
		System.out.println("문제 1)");
		
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
					if (i == j)
						break;
				}
				System.out.println(" ");
			}
		}
	}

}

/*
소스코드 답안
   for (int i = 2; i < 10; i++) {
      for(int j = 1; j < 10; j++) {
         System.out.println(i + " x " + j + " = " + i * j);
         if (j >= i);
            break;
      }
   }
*/