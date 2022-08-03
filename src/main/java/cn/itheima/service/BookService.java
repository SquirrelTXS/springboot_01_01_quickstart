package cn.itheima.service;

import cn.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void printService() {
        bookDao.printDao();
        System.out.println("BookService......");
    }
}
