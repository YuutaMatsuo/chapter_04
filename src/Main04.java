
public class Main04 {
	public static void main(String[] args) {
		//文字列型の配列「results」を、要素数４で生成
		String[] results = new String[4];
		
		//乱数生成(0-3)
		int i = new java.util.Random().nextInt(4); 
		
		//配列(results)の先頭の要素から順に「大吉」「中吉」「吉」「凶」を格納する
		results[0] = "大吉";
		results[1] = "中吉";
		results[2] = "吉";
		results[3] = "凶";
		
		//乱数生成した数値をresultsのインデックスとしておみくじの結果を取得
		String result = results[i];
		
		//おみくじの結果を出力表示
		System.out.println("おみくじの結果は：" + result);
	}
}
