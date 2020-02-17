package com.javastudio.tutorial.web.controller;

import com.javastudio.tutorial.web.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Controller
public class ProductController {

    Logger logger = Logger.getLogger(ProductController.class.getName());

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String entry() {
        return "product/insert";
    }

    @RequestMapping(value = "/product/entry", method = RequestMethod.GET)
    public ModelAndView entry(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("product/insert");
        view.addObject("product", new Product());
        return view;
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String save(HttpServletRequest request, Model model) {
        logger.info("name: " + request.getParameter("name"));
        model.addAttribute("message", "Product saved successfully");
        return "product/index";
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public String index() {
        return "product/index";
    }
}
