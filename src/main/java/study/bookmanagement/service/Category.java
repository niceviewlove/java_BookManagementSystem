package study.bookmanagement.service;

public class Category {
	private Integer id;
	private Integer number;
	private String name;


	public Category() {}
	
	public Category(Integer number, String name) {
		this.number = number;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
