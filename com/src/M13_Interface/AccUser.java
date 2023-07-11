package M13_Interface;

public class AccUser implements HDFCBank {
	
	@Override
	public void deposite() {
		System.out.println("Usre in depositing ");
		
	}

	@Override
	public void withdraw() {
		System.out.println("User is withdrawing");
		
	}
		
	public static void main(String[] args) {
		AccUser ac = new AccUser();
		ac.deposite();
		ac.withdraw();	
	}

}
