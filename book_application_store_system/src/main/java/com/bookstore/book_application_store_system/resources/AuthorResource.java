package com.bookstore.book_application_store_system.resources;

import com.bookstore.book_application_store_system.Models.Author;
import com.bookstore.book_application_store_system.Models.Book;
import com.bookstore.book_application_store_system.Datas.AuthorData;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorResource {

    @POST
    public Response addAuthor(Author author) {
        Author newAuthor = AuthorData.addAuthor(author);
        return Response.status(Response.Status.CREATED).entity(newAuthor).build();
    }

    @GET
    public List<Author> getAuthors() {
        return AuthorData.getAllAuthors();
    }

    @GET
    @Path("/{id}")
    public Author getAuthor(@PathParam("id") int id) {
        return AuthorData.getAuthorById(id);
    }

    @PUT
    @Path("/{id}")
    public Author updateAuthor(@PathParam("id") int id, Author author) {
        return AuthorData.updateAuthor(id, author);
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAuthor(@PathParam("id") int id) {
        AuthorData.deleteAuthor(id);
        return Response.noContent().build();
    }

    @GET
    @Path("/{id}/books")
    public List<Book> getBooksByAuthor(@PathParam("id") int id) {
        return Author.getBooksByAuthor(id); // (For now throw unsupported, or you can later create book list)
    }
}
