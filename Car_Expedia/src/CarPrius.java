
public class CarPrius extends Car {
	private int haikiryo;

	public CarPrius(int haikiryo) {
		super("TOYOTA");
		this.haikiryo = haikiryo;
	}

	public CarPrius() {
		// TODO 自動生成されたコンストラクター・スタブ
		this(1500);
	}

	public void showHaikiryo() {
		System.out.println(haikiryo + "CC");
	}
	@Override
	public void showMaker() {
		System.out.println("プリウス");
		super.showMaker();
		showHaikiryo();
	}
}
