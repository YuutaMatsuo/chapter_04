
public class Main10 {
	public static void main(String[] args) {
		int[] numbers = {100,200,300,400,500};
		
		for(int i = 0;i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//空白行を入れる
		System.out.println();
		
		//拡張for文を使ったコード
		for(int number : numbers) {
			System.out.println(number);
		}
	}
}
