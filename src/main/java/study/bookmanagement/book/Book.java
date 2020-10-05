package study.bookmanagement.book;

public class Book { 
	private Integer id;
	private String title;
	private String author;
	private Integer stock;
	private Integer year;
	private Integer price;
	
	public Book() {}
	
	public Book(String title, String author, Integer stock, Integer year, Integer price) {
		this.title = title;
		this.author = author;
		this.stock = stock;
		this.year = year;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}
