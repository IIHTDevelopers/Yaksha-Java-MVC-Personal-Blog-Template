package com.yaksha.training.blog.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.blog.entity.Blog;

@Controller
public class BlogController {

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) Long id) {
        return "";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid Blog blog, BindingResult result) {
        return "";
    }

    @GetMapping("/blogs")
    public String getBlogs(Model model) {
        return "";
    }

    @GetMapping("/blogs/{id}")
    public String deleteBlog(@PathVariable("id") Long id, Model model) {
        return "";
    }
}
