
public class MyAbstractTest1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstractParfait [] pfs = new AbstractParfait[3];
		pfs[0] = new ChocolateParfait();
		pfs[1] = new StrawberryParfait();
		pfs[2] = new BananaPerfait();

		int totalPtice = 0;
		for (AbstractParfait abstractParfait : pfs) {
			abstractParfait.showContent();
			totalPtice += abstractParfait.price;
		}
		System.out.println("総額:" + totalPtice + "円");
	}

}
