import java.util.Random;

public class Command {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if(args.length != 2) {
		System.out.println("入力法：乱数範囲　個数");
			System.exit(1);
		}
		int rmax = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		Random rnd = new Random();

		for(int i = 0; i < n ; i++) {
			System.out.println(rnd.nextInt(rmax)+1);
		}
	}

}
