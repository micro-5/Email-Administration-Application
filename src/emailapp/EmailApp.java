package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Yash", "Kumar");
//		
//		em1.changePassword("qwertyui");
//		em1.setAlternateEmail("example.name@example.com");
//		em1.setMailboxCapacity(600);
//		
//		System.out.println(em1.getPassword());
		System.out.println(em1.showInfo());
	}

}
