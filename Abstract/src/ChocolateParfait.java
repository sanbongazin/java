
public class ChocolateParfait extends AbstractParfait{
	public  ChocolateParfait(int price) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(price);
	}

	public ChocolateParfait() {
		// TODO 自動生成されたコンストラクター・スタブ
		this(400);
	}

	@Override
	public void showContent() {
		System.out.println("ストロベリーパフェ:" + price + "");
	}

}
