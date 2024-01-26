import com.brli.config.SpringConfig;
import com.brli.dao.BookDao;
import com.brli.service.BookService;
import com.brli.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        bookDao.save();
        BookService bookService = ctx.getBean(BookServiceImpl.class);
        bookService.save();
    }
}
