package ikinciGunOdev;

import java.util.ArrayList;
import java.util.List;

import ikinciGunOdev.business.concretes.CourseCardManager;
import ikinciGunOdev.business.concretes.FrequentlyAskedQuestionManager;
import ikinciGunOdev.entities.concretes.CourseCard;
import ikinciGunOdev.entities.concretes.FrequentlyAskedQuestion;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FrequentlyAskedQuestion> questionList = new ArrayList<FrequentlyAskedQuestion>();
		
		CourseCardManager courseCardService = new CourseCardManager();
		FrequentlyAskedQuestionManager frequentlyAskedQuestionManager = new FrequentlyAskedQuestionManager();
		
		//Kurs kart işlemleri
		CourseCard javaCourseCard = new CourseCard(1,"Java Kurs İmage","Java Kurs",75,1);
		courseCardService.add(javaCourseCard);
		
		//Sık sorulan sorular işlemleri https://www.kodlama.io/p/sorular
		System.out.println();
		FrequentlyAskedQuestion question1  = new FrequentlyAskedQuestion(1,"Yazılım Geliştirici Yetiştirme Kampı ücretsiz mi olacak?","Evet, ücretsiz olacak.");
		FrequentlyAskedQuestion question2  = new FrequentlyAskedQuestion(2,"Yazılım Geliştirici Yetiştirme Kamp programı ne kadar sürecek?"," Ücretsiz olarak vereceğim bu kamp 2 ay boyunca sürecek.");
		
		questionList.add(question1);
		questionList.add(question2);
			
		//SSS tek tek ekleme.
		for (FrequentlyAskedQuestion frequentlyAskedQuestion : questionList) {
			frequentlyAskedQuestionManager.add(frequentlyAskedQuestion);
		}
			
		//id' ye göre SSS getirme
		System.out.println();
		System.out.println("Cevabı bilinen bir sık sorulan soruyu id' sine göre getir");
		FrequentlyAskedQuestion question = frequentlyAskedQuestionManager.getById(0);
		System.out.println(question.getQuestion()+ " => " + question.getAnswer());
		
		//SSS hepsini getir
		System.out.println();
		System.out.println("Sık Sorulan Sorular");
		List<FrequentlyAskedQuestion> frequentlyAskedQuestionList =  frequentlyAskedQuestionManager.getAll();
		
		for (FrequentlyAskedQuestion frequentlyAskedQuestion : frequentlyAskedQuestionList) {
			System.out.println(frequentlyAskedQuestion.getQuestion()+ " => " + frequentlyAskedQuestion.getAnswer());
		}
		
		//liste olarak ekleme. frequentlyAskedQuestionManager
		frequentlyAskedQuestionManager.addList(questionList);
					
	}


}
