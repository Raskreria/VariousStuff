package com.example.ptjfront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontMapping {

    @GetMapping("product-detail")
    public String productDetail(){
        return "/products/detail";
    }
    @GetMapping("login")
    public String login(){
        return "/login/login";
    }

    @GetMapping("join")
    public String join(){
        return "/join/join";
    }

    @GetMapping("cart")
    public String cart(){
        return "/products/cart";
    }


}
