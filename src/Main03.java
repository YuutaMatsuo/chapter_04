
public class Main03 {
	public static void main(String[] args) {
		//文字列のデータを格納するための配列を、３つの要素数で生成する
		String[] greating = new String[3];
		
		//１で生成した配列の先頭の要素から順に「おはよう」「こんにちは」「こんばんは」を格納
		greating[0] = "おはよう";
		greating[1] = "こんにちは";
		greating[2] = "こんばんは";
		
		//繰り返し処理を用いて格納する
//		for(int i = 0;i < greating.length; i++) {
//			switch(i) {
//			case 0:
//				greating[i] = "おはよう";
//				break;
//			case 1:
//				greating[i] = "こんにちは";
//				break;
//			case 2:
//				greating[i] = "こんばんは";
//				break;
//			}
//			System.out.println(greating[i]);
//		}
		//配列から要素を指定し、「こんばんは」を出力する
		System.out.println(greating[2]);
	}
}
