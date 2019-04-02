import com.SSMdemo.bean.UserBean;
import com.SSMdemo.dao.IUserDao;
import com.SSMdemo.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    @Test
    public void test1() {
        //加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl dao = (UserDaoImpl) context.getBean(IUserDao.class);
        UserBean userBean=dao.findById(2);
        System.out.println(userBean.getAddress());
    }

}
