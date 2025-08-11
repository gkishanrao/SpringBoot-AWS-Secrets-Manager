package com.nirwantech.springboot_aws_secrets_manager.UtilJavaTestingCode;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;


public class BookService {

    private static final Logger logger = LogManager.getLogger(BookService.class);

    public List<Book> getBooksinStor(){
        List<Book> books=new BootDAO().getBooks();
       /* Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return 0;
            }
        });
        return books;*/

        //Lambda expression

        Collections.sort(books,(o1,o2)->o1.getName().compareTo(o1.getName()));
        logger.info("Return Books!");
        return books;
    }
    public  static void main(String[] arg){
        System.out.println(new BookService().getBooksinStor());
    }
}



