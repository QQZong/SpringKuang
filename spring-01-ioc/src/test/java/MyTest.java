
import com.qin.dao.daoImpl.UserDaoMysql;
import com.qin.dao.daoImpl.UserDaoOracle;
import com.qin.server.UserServer;
import com.qin.server.serverImpl.UserServerImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServer userServer =  new UserServerImpl();
        ((UserServerImpl) userServer).setUserDao(new UserDaoOracle());
        userServer.getData();
    }
}
