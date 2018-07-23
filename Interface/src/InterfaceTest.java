
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cabbage cab = new Cabbage();
		Broccoli broccoli = new Broccoli();
		System.out.println(cab.getSyuMei());
		System.out.println(broccoli.getSyuMei());

		AburanaInterface [] abus = new AburanaInterface[3];
		abus[0] = new Cabbage();
		abus[1] = new Broccoli();
		abus[2] = new Broccoli();

		for (AburanaInterface abu : abus) {
			if (abu.getClass() == Cabbage.class) {
				((Cabbage)abu).setSanchi("嬬恋");
			}else {
				((Broccoli)abu).setHinsyu("山本さんちのブロッコリー");
			}
			System.out.println(abu.getSyuMei());
		}

	}

}
