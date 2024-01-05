import com.kuang.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("UserService");

        userService.add();
    }
}
