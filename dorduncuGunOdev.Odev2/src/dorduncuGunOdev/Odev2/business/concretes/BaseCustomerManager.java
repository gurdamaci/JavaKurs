package dorduncuGunOdev.Odev2.business.concretes;

import dorduncuGunOdev.Odev2.business.abstracts.CustomerService;

public abstract class BaseCustomerManager implements CustomerService{
	//bu methodu override etmeden herkes kullanabilir. Ama CustomerService interface' imdeki methodları override etmek zorundalar.
	public final void abstractTest() {
		System.out.println("Bu method kalıtım alaln hepsinde hazır olarak gelecek");
	}
	
}
