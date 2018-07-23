
public class Capsicum extends Solanaceae implements PlantZokuInterface{
	String syuName = "トウガラシ";
	String kind = PlantZokuInterface.KIND;

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
