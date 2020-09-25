import com.chong.pojo.Limit;
import com.chong.pojo.Users;
import com.chong.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyTest {
    public static void main(String[] args) {
        Limit limit = new Limit();




        System.out.println( limit.getCount());
    }

}
