package springIntro;

public class halfPyramidWithStars {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= (i * 2) + 1; j++) {
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}

	}

}
