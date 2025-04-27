//package com.bookstore.book_application_store_system.resources;
//
//import com.bookstore.book_application_store_system.Datas.CustomerData;
//
//import com.bookstore.book_application_store_system.Models.Customer;
//import jakarta.ws.rs.Consumes;
//import jakarta.ws.rs.DELETE;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.POST;
//import jakarta.ws.rs.PUT;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;
//import java.util.List;
//
//@Path("/Customers")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class CustomerResource {
//    
//    @POST
//    public Response addCustomer(Customer customer) {
//        Customer newCustomer = CustomerData.addCustomer(customer);  // Using CustomerData correctly
//        return Response.status(Response.Status.CREATED).entity(newCustomer).build();
//    }
//
//    @GET
//    public List<Customer> getCustomers() {
//        return CustomerData.getAllCustomers();  // Consistent use of CustomerData
//    }
//
//    @GET
//    @Path("/{id}")
//    public Customer getCustomer(@PathParam("id") int id) {
//        return CustomerData.getCustomer(id);  // Consistent use of CustomerData
//    }
//
//    @PUT
//    @Path("/{id}")
//    public Customer updateCustomer(@PathParam("id") int id, Customer customer) {
//        return CustomerData.updateCustomer(id, customer);  // Consistent use of CustomerData
//    }
//
//    @DELETE
//    @Path("/{id}")
//    public Response deleteCustomer(@PathParam("id") int id) {
//        boolean deleted = CustomerData.deleteCustomer(id);  // Delete using CustomerData
//        if (deleted) {
//            return Response.noContent().build();
//        } else {
//            return Response.status(Response.Status.NOT_FOUND).build();
//        }
//    }
//}
