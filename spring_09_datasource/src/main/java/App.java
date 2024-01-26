import com.brli.dao.BookDao;
import com.brli.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = ctx.getBean("bookDao", BookDaoImpl.class);
        //DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
        //DataSource dataSource2 = ctx.getBean("dataSource2", DataSource.class);
        //System.out.println(dataSource);
        //System.out.println(dataSource2);
        bookDao.save();
    }
}
