
public class Broccoli implements AburanaInterface{
	private String kind;

	public Broccoli() {
		setHinsyu("不明");
	}

	@Override
	public String getSyuMei() {
		return ZOKU + "属ブロッコリー（品種：" + kind + ")";
	}

	public void setHinsyu(String kind) {
		this.kind = kind;
	}
}
