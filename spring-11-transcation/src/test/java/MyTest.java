import com.qin.mapper.UserMapper;
import com.qin.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapperImpl");
        List<User> users = userMapper.queryUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
