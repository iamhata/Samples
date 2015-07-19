package patterns.Iterator;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book(String aTitle, String aAuther, String aPublisher){
		title = aTitle;
		author = aAuther;
		publisher = aPublisher;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private String getAuthor() {
		return author;
	}

	private void setAuthor(String author) {
		this.author = author;
	}

	private String getPublisher() {
		return publisher;
	}

	private void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

}
