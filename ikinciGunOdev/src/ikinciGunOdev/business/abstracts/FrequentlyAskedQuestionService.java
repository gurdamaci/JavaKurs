package ikinciGunOdev.business.abstracts;

import java.util.List;

import ikinciGunOdev.entities.concretes.FrequentlyAskedQuestion;

public interface FrequentlyAskedQuestionService {
	void add(FrequentlyAskedQuestion frequentlyAskedQuestion);
	void addList(List<FrequentlyAskedQuestion> pfrequentlyAskedQuestionList);
	FrequentlyAskedQuestion getById(int id);
	List<FrequentlyAskedQuestion> getAll();
}
