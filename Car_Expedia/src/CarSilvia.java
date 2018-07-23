
public class CarSilvia extends Car {
	private int type;

	public CarSilvia(int type) {
		super("NISSAN");
		this.type = type;
	}

	public CarSilvia() {
		// TODO 自動生成されたコンストラクター・スタブ
		this(1);
	}

	public void showType() {
		System.out.println(type + "代目");
	}

	@Override
	public void showMaker() {
		System.out.println("シルビア");
		super.showMaker();
		showType();
	}
}
