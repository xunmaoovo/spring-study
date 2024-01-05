import com.kuang.config.MyConfig;
import com.kuang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User abc = (User) context.getBean("user");
        System.out.println(abc.getName());


    }
}
