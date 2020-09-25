package stduy.bookmanagement;

public class Book { // 상태가 있는 클래스 (Vo)
	private String title;
	private String writer;
	private String publisher;
	private int year;
	private int price;
	
	public Book(String title, String writer, String publisher, int year, int price) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
