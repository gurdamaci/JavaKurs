package ikinciGunOdev.entities.concretes;

import ikinciGunOdev.entities.abstracts.Entity;

//https://www.kodlama.io/p/sorular bu sayfadaki yapıyı nesne olarak düşünürsek.
public class FrequentlyAskedQuestion implements Entity {

	private int id;
	private String question; 
	private String answer;
	
	public FrequentlyAskedQuestion() {}
	public FrequentlyAskedQuestion(int id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getId() {
		return id;
	}

}
