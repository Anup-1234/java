package M12_Encapsulation;

public class P4_Test {

	public static void main(String[] args) {
		P3_Car c = new P3_Car(-100);
		System.out.println("cost"+c.getCost());
		c.setCost(200);
		System.out.println("cost"+c.getCost());

	}

}
