package intergaceex;

public class CustomerTest {
	public static void  main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		sell seller = customer;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer customer2 =(Customer) seller;
			customer2.selld();
			
		}
	}
}
