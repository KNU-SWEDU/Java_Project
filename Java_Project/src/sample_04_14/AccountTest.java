package sample_04_14;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account user1 = new Account();
		Account test = new Account();
		user1.setName("Tom");
		user1.setBalance(100000);
		System.out.println("Name : "+user1.getName() + " Balance : "+user1.getBalance());
		test = user1.eq(user1);
		user1.setBalance(555555);
		System.out.println("Name : "+user1.getName() + " Balance : "+user1.getBalance());
		System.out.println("Name : "+test.getName() + " Balance : "+test.getBalance());
		
		
	}

}
