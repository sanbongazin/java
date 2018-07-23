
public class Solanum extends Solanaceae implements PlantZokuInterface{
	String zokuName = "ナス";
	String kind = PlantZokuInterface.KIND;

	@Override
	public String getKind() {
		return kind;
	}

	@Override
	public String getName() {
		return zokuName;
	}

	@Override
	public String getFullName() {
		return super.getFullName()+zokuName+kind;
	}
}
