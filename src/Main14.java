
public class Main14 {
	public static void main(String[] args) {
		String[] studentNames = new String[5];

//		String[][] studentNames1st = new String[3][5];

		String[][] studentNames1st =
			{ 
					{ "阿部", "井上", "江藤", "田中" }, //[0]
					{ "伊藤", "岡崎", "加藤", "山田" }, //[1]
					{ "相場", "江崎", "岡田", "渡辺" }  //[2]
			};
		//画面に加藤さんを出力する
//		System.out.println(studentNames1st[1][2]);
		
		//2次元配列に格納された値全てを頭から順に取り出す「拡張for文のネスト」
		for (String[] studentClass : studentNames1st) { //2次元配列から１次元配列をstudentClassにすべて取り出す
			for(String studentName : studentClass) { //取り出したstudentClassから値をstudentNameにすべて取り出す
				System.out.println(studentName); //画面に出力する
			}
		}
	}
}
