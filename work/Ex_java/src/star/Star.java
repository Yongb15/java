package star;

public class Star {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 5; i > 0; i--) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		
		double a = 1 / 1.0 + 1 / 2.0 + 1 / 3.0 + 1 / 4.0 + 1 / 5.0;
		float b = 1 / 1.0f + 1 / 2.0f + 1 / 3.0f + 1 / 4.0f + 1 / 5.0f;
		
		System.out.println(a + " " + b);
		
		if(a == b) {
			System.out.println("같음");
		}
		
		
	}
}