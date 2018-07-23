
public class StrawberryParfait extends AbstractParfait{
	public StrawberryParfait(int price) {
		super(price);
	}

	public StrawberryParfait() {
		this(400);
	}

	@Override
	public void showContent(){
		System.out.println("ストロベリーパフェ:" + price + "円");
	}

}
