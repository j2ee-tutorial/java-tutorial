package com.javastudio.tutorial.web.controller;

import com.javastudio.tutorial.web.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@RequestMapping("/product")
@Controller
public class ProductController {

    private static final Logger logger = Logger.getLogger(ProductController.class.getName());

    @RequestMapping(value = "/entry", method = RequestMethod.GET)
    public String entry() {
        return "product/insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView entry(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("product/insert");
        view.addObject("product", new Product());
        return view;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam String name, Model model) {
        logger.info("name: " + name);
        model.addAttribute("message", "Product saved successfully");
        return "product/index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index() {
        return "product/index";
    }
}
