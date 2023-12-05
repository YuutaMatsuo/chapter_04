
public class Main07 {
	public static void main(String[] args) {
		//省略記法をマスターする
		
		//int型の配列「numbers」を、好きな値で５つ配列の宣言と生成を行う
		int[] numbers = {10,20,30,40,50};
		
		//double型の配列「heights」を、好きな値で3つ配列の宣言と生成を行う
		double[] heights = {180.3,173.5,166.5};
		
		//String型の配列「words」を、好きな値で4つ配列の宣言と生成を行う
		String[] words = {"おはようございます","こんにちは","こんばんは","はじめまして"};
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		for(int j=0;j<heights.length;j++) {
			System.out.println(j+1 + "人目の身長を入力してください");
			heights[j] = new java.util.Scanner(System.in).nextDouble();
		}
		for(int k=0;k<heights.length;k++) {
			System.out.println(heights[k]);
		}
		
		System.out.println(numbers.length);
		System.out.println(heights.length);
		System.out.println(words.length);
	}
}
