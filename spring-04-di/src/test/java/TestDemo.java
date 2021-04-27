import com.qin.pojo.Student;
import com.qin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student name = (Student) context.getBean("name");
        /**
         * Student{name='老秦', address=Address{address='浙江'},
         * book=[红楼梦, 西游记, 水浒传, 三国演义], hobbies=[听歌, 看电影, 学习, 健身],
         * cards={ICBC=6222148838793392, ABC=5248655438562870, CGB=5440332258247067, CBC=6222208911466496},
         * game=[LOL, CF, DNF], wife='null',
         * info={studentID=2015100126, password=QinZoning, sex=男, username=1003326090}}
         */
        System.out.println(name);
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("userC", User.class);
        System.out.println(user);
    }
}
