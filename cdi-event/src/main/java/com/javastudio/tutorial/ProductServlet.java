package com.javastudio.tutorial;

import com.javastudio.tutorial.event.ProductRegistrationEvent;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

    @Inject
    Event<ProductRegistrationEvent> productRegistrationComplete;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        productRegistrationComplete.fire(new ProductRegistrationEvent("Computer"));
        request.getRequestDispatcher("product/index.jsp").forward(request, response);
    }
}
