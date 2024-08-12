package Lms1.model;

public class Book {
	private int bokId;
    private String name;
    private String author;
    private String publisher;
    private int count;
    
    
	@Override
	public String toString() {
		return "Book [bokId=" + bokId + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", count=" + count + "]";
	}
	public int getBookId() {
		return bokId;
	}
	public void setBookId(int bookId) {
		bokId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
