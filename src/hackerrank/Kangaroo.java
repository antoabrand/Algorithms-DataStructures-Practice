package hackerrank;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print(kangaroo(0, 3, 4, 2));
		System.out.print(kangaroo(0, 2, 5, 3));
	}

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		// kangaroo 1
		int kang1Position = x1;
		int jump1Distance = v1;

		// kangaroo 2
		int kang2Position = x2;
		int jump2Distance = v2;

		int maxDistance = 10000;

		if (kang1Position < kang2Position && jump1Distance < jump2Distance) {
			return "NO";
		}

		for (int i = 0; i < maxDistance; i++) {
			kang1Position += jump1Distance;
			kang2Position += jump2Distance;

			if (kang1Position == kang2Position) {
				return "YES";
			}

		}
		return "NO";
	}

}
