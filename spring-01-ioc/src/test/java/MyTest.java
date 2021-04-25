
import com.qin.server.serverImpl.UserServerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*IOC方式*/
        /*UserServer userServer =  new UserServerImpl();
        ((UserServerImpl) userServer).setUserDao(new UserDaoOracle());
        userServer.getData();*/
        /*Spring方式*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServerImpl server = (UserServerImpl) context.getBean("server");
        server.getData();
    }
}
