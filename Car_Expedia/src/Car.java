
public class Car {
	private String maker;

	public Car(String maker) {
		this.maker = maker;
	}

	public Car() {
		this("不明");
	}

	public void showMaker() {
		System.out.println("メーカー名:" + maker);
	}

}
