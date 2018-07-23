
public class Nasues {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Tomato tom = new Tomato();
		System.out.println(tom.getFullName());

		Potato pot = new Potato();
		System.out.println(pot.getFullName());

		Capsicum tog = new Capsicum();
		System.out.println(tog.getName());

		PlantFamilyInterface pf = new Tomato();
		System.out.println(pf.getName()+pf.getKind());
	}

}
