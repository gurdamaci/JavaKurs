package ikinciGunOdev.business.concretes;

import ikinciGunOdev.business.abstracts.CourseCardService;
import ikinciGunOdev.entities.concretes.CourseCard;

public class CourseCardManager implements CourseCardService{

	@Override
	public void add(CourseCard courseCard) {
		// TODO Auto-generated method stub
		System.out.println("Eklenen kurs kart => " + courseCard.getTitleName());
	}

}
