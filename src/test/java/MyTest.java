import com.cc.pojo.Books;
import com.cc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * @author caichengjie
 * @date 2020/7/16
 */


public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for (Books books:bookServiceImpl.queryAllBooks()){
            System.out.println(books);
        }
    }
}
