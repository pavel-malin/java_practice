package BookPack;

class Book1{
	protected String title;
	protected String author;
	protected int pubDate;

	public Book1(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
	}
}

class ExtBook extends bookpack.Book {
	private String publicsher;

	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publicsher = p;
	}

	public void show() {
		super.show();
		System.out.println(publicsher);
		System.out.println();
	}

	public String getPublicsher() {
		return publicsher;
	}
	public void getPublicsher(String p) {
		publicsher = p;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		title = t;
	}

	public String getAuthor() {
		return author;
	}
	public void getAuthor(String a) {
		author = a;
	}

	public int getPubDate() {
		return pubDate;
	}
	public void setPubDate(int d) {
		pubDate = d;
	}
}

public class ProtectDemo {
	public static void main(String[] args) {
		ExtBook books[] = new ExtBook[5];
		books[0] = new ExtBook("Java: beginner's guide 7th edition", "Herbert Schildt", 2018, "Williams");
		books[1] = new ExtBook("Java: complete guide, 10th edition", "Herbert Schildt", 2018, "Williams");
		books[2] = new ExtBook("The Art of Java Programming", "Herbert Schildt", 2005, "Dllectic");
		books[3] = new ExtBook("Red storm rises", "Tom Clancy", 2006, "Exmo");
		books[4] = new ExtBook("On the way", "Jack Kercak", 2012, "ABC");
		for(int i=0; i < books.length; i++)
			books[i].show();

		System.out.println("All books Herbert Schidt.");
		for(int i=0; i < books.length; i++)
			if(books[i].getAuthor() == "Herbert Schildt")
				System.out.println(books[i].getTitle());
		// books[0].title = "test title" !!! Error, not public!!!
	}
}
