package dorduncuGunOdev.Odev2.core.adapters;

import dorduncuGunOdev.Odev2.core.abstracts.AuthenticationService;
import dorduncuGunOdev.Odev2.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class NviCheckIdentityNumberAdapter implements AuthenticationService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		boolean res = true;
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		try {
			res = proxy.TCKimlikNoDogrula(
				 Long.parseLong(customer.getIdentityNumber()),
					customer.getFirstName(), 
					customer.getLastName(), 
					customer.getBirthDate().getYear());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return res;
	}

}
