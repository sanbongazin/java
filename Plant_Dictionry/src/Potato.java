
public class Potato extends Solanum implements PlantSyuInterface{
	String syuName = "ジャガイモ";
	String kind = PlantSyuInterface.KIND;

	@Override
	public String getKind() {
		return kind;
	}

	@Override
	public String getName() {
		return syuName;
	}

	@Override
	public String getFullName() {
		return super.getFullName()+syuName+kind;
	}

}
