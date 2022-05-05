package ru.skypro;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + authorFistName + '\'' +
                ", subname='" + authorSecondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Author author = (Author) a;
        return authorFistName.equals(author.authorFistName) && authorSecondName.equals(author.authorSecondName);
    }

    @Override
    public int hashCode() { return Objects.hash(authorFistName, authorSecondName);
    }
}

