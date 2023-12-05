
public class Main11 {
	public static void main(String[] args) {
		// 配列は参照型
		final int[] arrayA = { 1, 2, 3 }; //finalで宣言すると参照先は固定されるが、中の値が固定される訳ではない。
		
		int[] arrayB;
		arrayB = arrayA; // 参照渡し(対義語：値渡し)
		arrayB[0] = 100;
		System.out.println(arrayA[0]);

		int a = 10;
		int b = a; // 値渡し

		int[] arrayC = { 1, 2, 3 };
		
		//finalで宣言したarrayAの参照先を変えることはできない。
//		arrayA = arrayC; 

		if (arrayA[0] == arrayC[0]) {
			System.out.println("テスト１合格");
		}

		if (arrayA[0] == arrayB[0]) {
			System.out.println("テスト２合格");
		}

		if (arrayA == arrayB) {
			System.out.println("テスト３合格");
		}

		if (arrayA.equals(arrayB)) {
			System.out.println("テスト４合格");
		}

		if (arrayA == arrayC) {
			System.out.println("テスト5合格");
		}

		if (arrayA.equals(arrayC)) {
			System.out.println("テスト6合格");
		}
	}
}
