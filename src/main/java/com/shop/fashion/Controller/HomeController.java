package com.shop.fashion.Controller;

import com.shop.fashion.Model.Category;
import com.shop.fashion.Model.Product;
import com.shop.fashion.Service.CategoryService;
import com.shop.fashion.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String homePage(Model model) {
        List<Category> categoryList = categoryService.listCategory();
        List<Product> productList = productService.listProduct();
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("productList", productList);
        return "index";
    }
}

