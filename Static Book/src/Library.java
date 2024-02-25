public class Library {
	static void addBook(Book b) {
		Book list[] = new Book[100];
		list[b.totalBooks-1] = b;
	}
	static int getTotalBooks(Book b) {
		return b.totalBooks;
	}
}
