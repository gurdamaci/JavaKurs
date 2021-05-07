package dorduncuGunOdev.Odev2.core.abstracts;

import dorduncuGunOdev.Odev2.entities.concretes.Customer;

public interface AuthenticationService {
	boolean CheckIfRealPerson(Customer customer);
}
