
public class Solanaceae implements PlantKaInterface{
	String KaName = "ナス";
	String Kind = PlantKaInterface.KIND;

	@Override
	public String getKind() {
		return Kind;
	}

	@Override
	public String getName() {
		return KaName;
	}

	@Override
	public String getFullName() {
		return KaName + Kind;
	}
}
