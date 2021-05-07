package ikinciGunOdev.business.concretes;


import java.util.ArrayList;
import java.util.List;

import ikinciGunOdev.business.abstracts.FrequentlyAskedQuestionService;
import ikinciGunOdev.entities.concretes.FrequentlyAskedQuestion;

public class FrequentlyAskedQuestionManager implements FrequentlyAskedQuestionService{

	private List<FrequentlyAskedQuestion> frequentlyAskedQuestionList;
	
	public FrequentlyAskedQuestionManager() {
		FrequentlyAskedQuestion question1  = new FrequentlyAskedQuestion(1,"Engin Hocayı seviyor musunuz?","Evet, elbette.");
		frequentlyAskedQuestionList = new ArrayList<FrequentlyAskedQuestion>();
		frequentlyAskedQuestionList.add(question1);
	}
		
	@Override
	public void add(FrequentlyAskedQuestion frequentlyAskedQuestion) {
		// TODO Auto-generated method stub
		System.out.println("SSS Eklendi => "+ frequentlyAskedQuestion.getQuestion());
		frequentlyAskedQuestionList.add(frequentlyAskedQuestion);
	}

	@Override
	public FrequentlyAskedQuestion getById(int id) {
		// TODO Auto-generated method stub	
		return frequentlyAskedQuestionList.get(id);
	}

	@Override
	public List<FrequentlyAskedQuestion> getAll() {
		// TODO Auto-generated method stub
		return frequentlyAskedQuestionList;
		
	}

	@Override
	public void addList(List<FrequentlyAskedQuestion> pfrequentlyAskedQuestionList) {
		// TODO Auto-generated method stub
		frequentlyAskedQuestionList.addAll(frequentlyAskedQuestionList);
	}


}
