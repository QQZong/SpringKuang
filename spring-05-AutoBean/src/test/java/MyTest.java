import com.qin.entity.Human;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        Human human = context.getBean("human",Human.class);
        System.out.println(human.getName());
        human.getCat().say();
        human.getDog().say();
    }
}
