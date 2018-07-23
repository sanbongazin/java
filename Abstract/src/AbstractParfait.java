
abstract class AbstractParfait {
	protected int price;

	public AbstractParfait(int price){
		setPrice(price);
	}

	public AbstractParfait() {
		this(0);
	}

	void setPrice(int price) {
		this.price = price;
	}
	abstract void showContent();
}
