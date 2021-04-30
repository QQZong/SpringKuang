import com.qin.service.Service;
import com.qin.service.ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void T(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*动态代理代理的是接口*/
        Service bean = context.getBean("serviceImpl",Service.class);
        bean.add();
    }
}
