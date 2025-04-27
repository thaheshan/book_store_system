package com.bookstore.book_application_store_system.resources;

import com.bookstore.book_application_store_system.Datas.BookData;
import com.bookstore.book_application_store_system.Models.Book;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    @POST
    public Response addBook(Book book) {
        Book newBook = BookData.addBook(book);
        return Response.status(Response.Status.CREATED)
                       .entity(newBook)
                       .build();
    }

    @GET
    public List<Book> getBooks() {
        return BookData.getAllBooks();
    }

    @GET
    @Path("/{id}")
    public Response getBook(@PathParam("id") int id) {
        Book book = BookData.getBookById(id);
        if (book != null) {
            return Response.ok(book).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                           .entity("{\"error\":\"Book not found\"}")
                           .build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateBook(@PathParam("id") int id, Book updatedBook) {
        Book book = BookData.updateBook(id, updatedBook);
        if (book != null) {
            return Response.ok(book).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                           .entity("{\"error\":\"Book not found for update\"}")
                           .build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteBook(@PathParam("id") int id) {
        boolean deleted = BookData.deleteBook(id);
        if (deleted) {
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                           .entity("{\"error\":\"Book not found for deletion\"}")
                           .build();
        }
    }
}
