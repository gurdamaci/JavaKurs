package dorduncuGunOdev.Odev2.business.concretes;

import dorduncuGunOdev.Odev2.core.abstracts.AuthenticationService;
import dorduncuGunOdev.Odev2.core.adapters.NviCheckIdentityNumberAdapter;
import dorduncuGunOdev.Odev2.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
	
		
		if (CheckIfPerson(customer)) {
			System.out.println("Nvi Doğrulama başarılı. Starbuck'sa göre implemente edildi." + customer.getFirstName());
		} else {
			System.out.println("Nvi Doğrulama başarısız. Starbuck'sa göre implemente edilmedi." + customer.getFirstName());
		}
	}
	
	private boolean CheckIfPerson(Customer customer) {
		boolean res = false;
		
		AuthenticationService authService = new NviCheckIdentityNumberAdapter();
		
		res = authService.CheckIfRealPerson(customer);
				
		return res;
	}

}
