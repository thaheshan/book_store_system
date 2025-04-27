//package com.bookstore.book_application_store_system.resources;
//
//import com.bookstore.book_application_store_system.Exceptions.AuthorNotFoundException;
//import com.bookstore.book_application_store_system.Models.Author;
//import com.bookstore.book_application_store_system.Models.Book;
//import com.bookstore.book_application_store_system.Models.Customer;
//import com.bookstore.book_application_store_system.Models.Cart;
//import com.bookstore.book_application_store_system.Models.Order;
//import com.liferay.headless.commerce.delivery.cart.dto.v1_0.CartItem;
//
//import java.util.*;
//
///**
// * Acts as the in-memory database for Books, Authors, Customers, Carts, and Orders.
// */
//public class DataStore {
//
//    private static Map<Integer, Book> books = new HashMap<>();
//    private static Map<Integer, Author> authors = new HashMap<>();
//    private static Map<Integer, Customer> customers = new HashMap<>();
//    private static Map<String, Cart> carts = new HashMap<>(); // Key: Customer ID (e.g., "CUST1")
//    private static Map<Integer, Order> orders = new HashMap<>();
//
//    private static int bookIdCounter = 1;
//    private static int authorIdCounter = 1;
//    private static int customerIdCounter = 1;
//    private static int orderIdCounter = 1;
//
//    // === BOOK METHODS ===
//    public static Book addBook(Book book) {
//        book.SetBook_ID(bookIdCounter++);
//        books.put(book.getBook_ID(), book);
//        return book;
//    }
//
//    public static Book getBook(int id) {
//        return books.get(id);
//    }
//
//    public static List<Book> getAllBooks() {
//        return new ArrayList<>(books.values());
//    }
//
//    public static boolean deleteBook(int id) {
//        return books.remove(id) != null;
//    }
//
//    public static Book updateBook(int id, Book book) {
//        if (books.containsKey(id)) {
//            book.SetBook_ID(id);
//            books.put(id, book);
//            return book;
//        }
//        return null;
//    }
//
//    public static List<Book> getBooksByAuthor(int authorId) {
//        List<Book> authorBooks = new ArrayList<>();
//        for (Book book : books.values()) {
//            if (book.getAuthor_ID() == authorId) {
//                authorBooks.add(book);
//            }
//        }
//        return authorBooks;
//    }
//
//    // === AUTHOR METHODS ===
//    public static Author addAuthor(Author author) {
//        author.SetAuthor_ID(authorIdCounter++);
//        authors.put(author.GetAuthor_ID(), author);
//        return author;
//    }
//
//    public static Author getAuthor(int id) throws AuthorNotFoundException {
//        Author author = authors.get(id);
////        if (author == null) {
////            throw new AuthorNotFoundException("Author not found with ID: " + id);
////        }
//        return author;
//    }
//
//    public static List<Author> getAllAuthors() {
//        return new ArrayList<>(authors.values());
//    }
//
//    public static boolean deleteAuthor(int id) {
//        return authors.remove(id) != null;
//    }
//
//    public static Author updateAuthor(int id, Author author) {
//        if (authors.containsKey(id)) {
//            author.SetAuthor_ID(id);
//            authors.put(id, author);
//            return author;
//        }
//        return null;
//    }
//
//    // === CUSTOMER METHODS ===
//    public static Customer addCustomer(Customer customer) {
//        customer.setID("CUST" + customerIdCounter++);
//        customers.put(Integer.parseInt(customer.getID().replace("CUST", "")), customer);
//        return customer;
//    }
//
//    public static Customer getCustomerById(String id) {
//        int numericId = Integer.parseInt(id.replace("CUST", ""));
//        return customers.get(numericId);
//    }
//
//    public static Customer getCustomer(int id) {
//        return customers.get(id);
//    }
//
//    public static List<Customer> getAllCustomers() {
//        return new ArrayList<>(customers.values());
//    }
//
//    public static boolean deleteCustomer(String id) {
//        int numericId = Integer.parseInt(id.replace("CUST", ""));
//        return customers.remove(numericId) != null;
//    }
//
//    public static Customer updateCustomer(int id, Customer customer) {
//        if (customers.containsKey(id)) {
//            customer.setID("CUST" + id);
//            customers.put(id, customer);
//            return customer;
//        }
//        return null;
//    }
//
//    // === CART METHODS ===
//    public static Cart addOrUpdateCart(Cart cart) {
//        carts.put(cart.GetCustomerID(), cart);
//        return cart;
//    }
//
//    public static Cart getCartByCustomerId(String customerId) {
//        return carts.get(customerId);
//    }
//
//    public static boolean deleteCartByCustomerId(String customerId) {
//        return carts.remove(customerId) != null;
//    }
//
//    public static void addToCart(int customerId, CartItem item) {
//        String customerKey = "CUST" + customerId;
//        Cart cart = carts.getOrDefault(customerKey, new Cart(customerKey));
//        cart.getItems().add(item);
//        carts.put(customerKey, cart);
//    }
//
//    public static void removeCartItem(int customerId, int bookId) {
//        String customerKey = "CUST" + customerId;
//        Cart cart = carts.get(customerKey);
//        if (cart != null) {
//            cart.getItems().removeIf(item -> item.getId() == bookId);
//        }
//    }
//
//    public static CartItem updateCartItem(int customerId, int bookId, CartItem newItem) {
//        String customerKey = "CUST" + customerId;
//        Cart cart = carts.get(customerKey);
//        if (cart != null) {
//            for (int i = 0; i < cart.getItems().size(); i++) {
//                if (cart.getItems().get(i).getId() == bookId) {
//                    cart.getItems().set(i, newItem);
//                    return newItem;
//                }
//            }
//        }
//        return null;
//    }
//
//    public static List<CartItem> getCartItems(int customerId) {
//        Cart cart = carts.get("CUST" + customerId);
//        if (cart != null) {
//            return (List<CartItem>) cart.getItems();
//        }
//        return new ArrayList<>();
//    }
//
//    // === ORDER METHODS ===
//    public static Order addOrder(Order order) {
//        order.setOrderID(orderIdCounter++);
//        orders.put(order.getOrderID(), order);
//        return order;
//    }
//
//    public static Order getOrderById(int id) {
//        return orders.get(id);
//    }
//
//    public static List<Order> getAllOrders() {
//        return new ArrayList<>(orders.values());
//    }
//
//    public static boolean deleteOrder(int id) {
//        return orders.remove(id) != null;
//    }
//
//    public static Order placeOrder(int customerId) {
//        String customerKey = "CUST" + customerId;
//        Cart cart = carts.get(customerKey);
//        if (cart == null || cart.getItems().isEmpty()) {
//            return null;
//        }
//
//        Order order = new Order();
//        order.setOrderID(orderIdCounter++);
//        order.setCustomerID(customerKey);
//        order.setItems(new ArrayList<>(cart.getItems()));
//        orders.put(order.getOrderID(), order);
//
//        // Clear cart after placing order
//        carts.remove(customerKey);
//        return order;
//    }
//
//    public static List<Order> getOrders(int customerId) {
//        String customerKey = "CUST" + customerId;
//        List<Order> result = new ArrayList<>();
//        for (Order order : orders.values()) {
//            if (order.getCustomerID().equals(customerKey)) {
//                result.add(order);
//            }
//        }
//        return result;
//    }
//
//    public static Order getOrderById(int customerId, int orderId) {
//        Order order = orders.get(orderId);
//        if (order != null && order.getCustomerID().equals("CUST" + customerId)) {
//            return order;
//        }
//        return null;
//    }
//
//    public static void deleteCustomer(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
