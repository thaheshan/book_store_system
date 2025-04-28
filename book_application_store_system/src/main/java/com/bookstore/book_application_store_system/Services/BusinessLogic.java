//package com.bookstore.book_application_store_system.Services;
//
//import com.bookstore.book_application_store_system.Models.Author;
//import com.bookstore.book_application_store_system.Models.Book;
//import com.bookstore.book_application_store_system.Models.Cart;
//import com.bookstore.book_application_store_system.Models.Customer;
//import com.bookstore.book_application_store_system.Models.Order;
//import com.bookstore.book_application_store_system.resources.DataStore;
//
//import com.liferay.headless.commerce.delivery.cart.dto.v1_0.CartItem;
//import java.util.Calendar;
//import java.util.List;
//
//public class BusinessLogic {
//
//    // ---------- BOOKS ----------
//    public static Book addBook(Book book) {
//        validatePublicationYear(book.getPublicationYear());
//        return DataStore.addBook(book);
//    }
//
//    public static List<Book> getAllBooks() {
//        return DataStore.getAllBooks();
//    }
//
//    public static Book getBook(int id) {
//        return DataStore.getBook(id);
//    }
//
//    public static Book updateBook(int id, Book book) {
//        validatePublicationYear(book.getPublicationYear());
//        return DataStore.updateBook(id, book);
//    }
//
//    public static void deleteBook(int id) {
//        DataStore.deleteBook(id);
//    }
//
//    // ---------- AUTHORS ----------
//    public static Author addAuthor(Author author) {
//        return DataStore.addAuthor(author);
//    }
//
//    public static List<Author> getAllAuthors() {
//        return DataStore.getAllAuthors();
//    }
//
//    public static Author getAuthor(int id) {
//        return DataStore.getAuthor(id);
//    }
//
//    public static Author updateAuthor(int id, Author author) {
//        return DataStore.updateAuthor(id, author);
//    }
//
//    public static void deleteAuthor(int id) {
//        DataStore.deleteAuthor(id);
//    }
//
//    public static List<Book> getBooksByAuthor(int authorId) {
//        return DataStore.getBooksByAuthor(authorId);
//    }
//
//    // ---------- CUSTOMERS ----------
//    public static Customer addCustomer(Customer customer) {
//        return DataStore.addCustomer(customer);
//    }
//
//    public static List<Customer> getAllCustomers() {
//        return DataStore.getAllCustomers();
//    }
//
//    public static Customer getCustomer(int id) {
//        return DataStore.getCustomer(id);
//    }
//
//    public static Customer updateCustomer(int id, Customer customer) {
//        return DataStore.updateCustomer(id, customer);
//    }
//
//    public static void deleteCustomer(int id) {
//        DataStore.deleteCustomer(id);
//    }
//
//    // ---------- CART ----------
//    public static void addToCart(int customerId, CartItem item) {
//        if (item.getQuantity() <= 0) {
//            throw new IllegalArgumentException("Cart item quantity must be greater than zero.");
//        }
//        Cart.addToCart(customerId, item);
//    }
//
//    public static List<CartItem> getCart(int customerId) {
//        return Cart.getCartItems(customerId);
//    }
//
//    public static CartItem updateCartItem(int customerId, int bookId, CartItem item) {
//        if (item.getQuantity() <= 0) {
//            throw new IllegalArgumentException("Updated cart item quantity must be greater than zero.");
//        }
//        return Cart.updateCartItem(customerId, bookId, item);
//    }
//
//    public static void removeCartItem(int customerId, int bookId) {
//        Cart.removeCartItem(customerId, bookId);
//    }
//
//    // ---------- ORDERS ----------
//    public static Order placeOrder(int customerId) {
//        List<CartItem> cartItems = Cart.getCartItems(customerId);
//        if (cartItems == null || cartItems.isEmpty()) {
//            throw new IllegalStateException("Cart is empty. Cannot place order.");
//        }
//        return Cart.placeOrder(customerId);
//    }
//
//    public static List<Order> getOrders(int customerId) {
//        return Cart.getOrders(customerId);
//    }
//
//    public static Order getOrderById(int customerId, int orderId) {
//        return Cart.getOrderById(customerId, orderId);
//    }
//
//    // ---------- VALIDATION ----------
//    private static void validatePublicationYear(int year) {
//        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
//        if (year > currentYear) {
//            throw new IllegalArgumentException("Publication year cannot be in the future.");
//        }
//    }
//}
