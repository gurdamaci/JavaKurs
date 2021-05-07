 package dorduncuGunOdev.Odev2.business.concretes;

import dorduncuGunOdev.Odev2.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Neroya göre implemente edildi." + customer.getFirstName());
	}



}
