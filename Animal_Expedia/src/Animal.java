
public class Animal {
	private String kind;

	public Animal(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Animal:" + kind;
	}

}
