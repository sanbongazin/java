import java.util.Random;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rnd = new Random();
		Animal [] anm = new Animal[3];

		for(int i = 0; i<3; i++) {
			anm[i] = (rnd.nextInt(2) == 0)? new Dog(): new Cat();
		}

		for(int i = 0; i<3;i++) {
			System.out.println(anm[i].getClass());
			if(anm[i].getClass() == Dog.class) {
				((Dog)anm[i]).bark();
			}else {
				((Cat)anm[i]).mew();
			}
		}

	}

}
