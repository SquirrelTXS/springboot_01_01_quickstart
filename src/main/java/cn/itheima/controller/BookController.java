package cn.itheima.controller;

import cn.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public String getById() {
        bookService.printService();
        System.out.println("BookController......");
        return "Springboot is running......";
    }

    @PostMapping("/{id}")
    public String addId(@PathVariable int id) {
        return "update......" + id;
    }
}
