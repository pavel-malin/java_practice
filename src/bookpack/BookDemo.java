package bookpack;

class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("Java: beginner's guide 7th edition", "Herbert Schildt", 2018);
        books[1] = new Book("Java: complete guide, 10th edition", "Herbert Schildt", 2018);
        books[2] = new Book("The Art of Java Programming", "Herbert Schildt", 2005);
        books[3] = new Book("Red storm rises", "Tom Clancy", 2006);
        books[4] = new Book("On the way", "Jack Kercak", 2012);

        for (int i = 0; i < books.length; i++)
            books[i].show();
    }
}
