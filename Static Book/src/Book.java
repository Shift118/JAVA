public class Book {
	private String title,author;
	static int totalBooks;
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
		totalBooks++;
	}
}
