package pw3.n2;

import pw3.Input;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(Input.Int("Введите кол-во страниц первой книги"));
        Book b2 = new Book(Input.Int("Введите кол-во страниц второй книги"));
        Book b3 = new Book(Input.Int("Введите кол-во страниц третьей книги"));

        library.setBook(b1);
        library.setBook(b2);
        library.setBook(b3);

        library.information();
    }
}
