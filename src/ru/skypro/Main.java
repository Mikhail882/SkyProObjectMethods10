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
    }
}