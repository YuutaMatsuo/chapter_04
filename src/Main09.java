import java.util.Arrays;
public class Main09 {

	public static void main(String[] args) {
		int[] numbers = { 500, 300, 600, 200, 100 };
		int[] numbers2 = new int[numbers.length];
		int count = 0;

		System.out.println("配列の中身を出力します");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("配列の中身を逆から出力します");
		for (int j = numbers.length - 1; j >= 0; j--) {
			numbers2[count] = numbers[j];
			count++;
		}
		for (int k = 0; k < numbers.length; k++) {
			System.out.println(numbers2[k]);
		}

		count = 0;
		System.out.println("配列の中身を小さい順に並び変え出力します");
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
