package com.bookstore.book_application_store_system.Datas;

import com.bookstore.book_application_store_system.Models.Author;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorData {
    private static List<Author> authors = new ArrayList<>();
    private static int currentId = 1;

    public static List<Author> getAllAuthors() {
        return authors;
    }

    public static Author getAuthorById(int id) {
        Optional<Author> author = authors.stream().filter(a -> a.getAuthorId() == id).findFirst();
        return author.orElse(null);
    }

    public static Author addAuthor(Author author) {
        author.setAuthorId(currentId++);
        authors.add(author);
        return author;
    }

    public static Author updateAuthor(int id, Author updatedAuthor) {
        Author existingAuthor = getAuthorById(id);
        if (existingAuthor != null) {
            existingAuthor.setFirstName(updatedAuthor.getFirstName());
            existingAuthor.setLastName(updatedAuthor.getLastName());
            existingAuthor.setBiography(updatedAuthor.getBiography());
            existingAuthor.setEmail(updatedAuthor.getEmail());
        }
        return existingAuthor;
    }

    public static boolean deleteAuthor(int id) {
        return authors.removeIf(author -> author.getAuthorId() == id);
    }
}
