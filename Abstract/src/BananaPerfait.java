
public class BananaPerfait extends AbstractParfait{
	public BananaPerfait(int price) {
		super(price);
	}

	public BananaPerfait() {
		this(400);
	}

	@Override
	public void showContent(){
		System.out.println("バナナパフェ:" + price + "円");
	}

}
