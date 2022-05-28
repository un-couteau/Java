package pw3.n2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library(Book book) {
        books.add(book);
    }

    public Library() {
        
    }

    public void setBook(Book book) {
        books.add(book);
    }

    public void information() {
        if (books.size() >= 1) {
            int pagesFromAllBooks = 0;
            for (Book book : books) {
                pagesFromAllBooks += book.getPages();
            }
            System.out.println("Общее количество страниц: " + pagesFromAllBooks);
            System.out.println("Среднее кол-во страниц на книгу: " + pagesFromAllBooks / books.size());
        } else {
            System.out.println("Библиотека пуста!");
        }
    }
}
