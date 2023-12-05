
public class Main12 {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		
		int[] arrayA = { 1, 2, 3 };
		arrayA = null; // nullとは「参照を切る」という意味を持つ
		
//		System.out.println(arrayA[0]); //参照している配列がないため例外が発生する  java.lang.NullPointerException:
		System.out.println(arrayA); //arrayAの状態（null)が表示される

		int a = 10;
//		a = null; 基本データ型に「null」は使えない！
	}
}
