package ru.skypro;

public class Main {


    public static void main(String[] args) {
        Author firstAuthor = new Author("Имя ", "Фамилия");
        System.out.println("Автор книги " + firstAuthor.getAuthorName());
        Book firstBook = new Book("Книга с именем", firstAuthor, 2000);
        System.out.println("Старый год публикации " + firstBook.getPublishingYear());
        firstBook.setPublishingYear(2020);
        System.out.println("Новый год публикации " + firstBook.getPublishingYear());

        System.out.println(firstBook.getBookName() + " " + firstBook.getAuthorName().getAuthorName() + " " + firstBook.getPublishingYear());

        Author firstAuthor_1 = new Author("Имя ", "Фамилия");
        System.out.println("Автор книги " + firstAuthor.getAuthorName());
        Book firstBook_1 = new Book("Книга с именем", firstAuthor, 2000);
        System.out.println("Старый год публикации " + firstBook.getPublishingYear());
        firstBook_1.setPublishingYear(2020);
        System.out.println("Новый год публикации " + firstBook.getPublishingYear());

        System.out.println(firstBook.getBookName() + " " + firstBook.getAuthorName().getAuthorName() + " " + firstBook.getPublishingYear());

        System.out.println(firstAuthor.toString());
        System.out.println(firstBook.toString());

        System.out.println("Одинаковые авторы? " + firstAuthor.equals(firstAuthor_1));
        System.out.println("Одинаковые книги? " + firstBook.equals(firstBook_1));

        firstBook.setPublishingYear(2020);

        System.out.println("Одинаковые книги, если год поменять? " + firstBook.equals(firstBook_1));
        System.out.println(firstBook.hashCode());
        System.out.println(firstBook_1.hashCode());
    }
}