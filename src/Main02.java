
public class Main02 {
	public static void main(String[] args) {
		
		int[] numbers = new int[6];
//		numbers[0] = 10;
		int num = numbers.length;
		System.out.println("配列nubbersの要素の数は、" + num);
//		System.out.println("配列の１番目の数値は、" + numbers[0]);
		 numbers[0] = (int)10.0; //配列numbersのインデックス[0]に１０を代入する
		 System.out.println("numbers[0]の中身は" + numbers[0]);
		 
		 
		
		//配列の生成の上書きテスト
//		numbers = new int[8];
//		num = numbers.length;
//		System.out.println("配列nubbersの要素の数は、" + num);
//		System.out.println("配列の１番目の数値は、" + numbers[0]);
	}
}
