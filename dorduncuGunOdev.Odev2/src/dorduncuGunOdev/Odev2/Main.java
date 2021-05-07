package dorduncuGunOdev.Odev2;

import java.util.Date;

import dorduncuGunOdev.Odev2.business.abstracts.CustomerService;
import dorduncuGunOdev.Odev2.business.concretes.NeroCustomerManager;
import dorduncuGunOdev.Odev2.business.concretes.StarbucksCustomerManager;
import dorduncuGunOdev.Odev2.entities.concretes.Customer;

//https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL eklerken hata veriyordu. JavaSE- 1.8' e çekince hata vermeden devam edebildi.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService neroService = new NeroCustomerManager();
		CustomerService starbucksService = new StarbucksCustomerManager();
							
		Customer realPerson = new Customer(1,"Adil","Kudu","**",new Date(1993,04,9));
		Customer fakePerson = new Customer(1,"Adil","Kudu","**",new Date(1990,04,9));		

		neroService.save(realPerson);
		starbucksService.save(realPerson);
		
		System.out.println();
		neroService.save(fakePerson);
		starbucksService.save(fakePerson);
				
	}

}
