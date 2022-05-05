package ru.skypro;

public class Author {
    public String authorFistName;
    public String authorSecondName;

    public Author(String authorFistName, String authorSecondName) {
        this.authorFistName = authorFistName;
        this.authorSecondName = authorSecondName;
    }
    public String getAuthorName() {
        return authorFistName + authorSecondName;
    }
    public String getAuthorFistName() {
        return authorFistName;
    }
    public String getAuthorSecondName() {
        return authorSecondName;
    }
}
