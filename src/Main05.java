
public class Main05 {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		//デフォルト初期値の確認
		System.out.println(numbers[0]);
		
		double[] number02 = new double[3];
		System.out.println(number02[1]);
		
		boolean[] isBoolean = new boolean[10];
		System.out.println(isBoolean[5]);
		
		char[] words = new char[3];
		System.out.println(words[1]);
		
		String msg = ""; //空文字を入れる。
		String msg02 = null; //null（空文字でも無い）が入る
		String msg03; //上と同じnullが入る
		
		System.out.println(msg);
		System.out.println(msg02);
		
		String[] msgs = new String[10];
		System.out.println(msgs[4]);
	}
}
