import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		String title,author;
		int x;
		
		System.out.print("How Many Books do you want to add: ");
		x = cs.nextInt();
		Book b[] = new Book[x];
		for(int i = 0 ; i < x ; i++) {
			System.out.print("Enter Book Title: ");
			title = cs.nextLine();
			cs.nextLine();
			System.out.print("Enter Book Author: ");
			author = cs.nextLine();
			b[i] = new Book(title,author);
			System.out.println("Book "+title+" has been added.");
		}
		
		System.out.println("Number of books: "+Library.getTotalBooks(b[0]));
		cs.close();
	}
}
