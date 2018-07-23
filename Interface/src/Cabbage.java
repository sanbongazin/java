
public class Cabbage implements AburanaInterface{
	private String sanchi;
	public Cabbage() {
		setSanchi("不明");
	}
	@Override
	public String getSyuMei() {
		return ZOKU + "属キャベツ（産地" + sanchi + ")";
	}

	public void setSanchi(String sanchi) {
		this.sanchi = sanchi;
	}
}
