import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.dao.UserDaoSqlserverImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        // 用户实际调用的是业务层，dao层他们不需要接触！
        UserService userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoSqlserverImpl());
        userService.getUser();
    }
}
