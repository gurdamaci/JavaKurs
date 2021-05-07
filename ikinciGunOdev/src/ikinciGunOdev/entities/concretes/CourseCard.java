package ikinciGunOdev.entities.concretes;

import ikinciGunOdev.entities.abstracts.Entity;

//ana sayfadaki kurs kartlarının özelliklerini tutan sınıf
public class CourseCard implements Entity{

	private int id;
	private String imageName;
	private String titleName;
	private int progressStatus;
	private int authorId;// ilgili kursun eğitmenine karşılık gelen id

	public CourseCard() {};

	public CourseCard(int id, String imageName, String titleName, int progressStatus, int authorId) {
		super();
		this.id = id;
		this.imageName = imageName;
		this.titleName = titleName;
		this.progressStatus = progressStatus;
		this.authorId = authorId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public int getProgressStatus() {
		return progressStatus;
	}

	public void setProgressStatus(int progressStatus) {
		this.progressStatus = progressStatus;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getId() {
		return id;
	}
}
