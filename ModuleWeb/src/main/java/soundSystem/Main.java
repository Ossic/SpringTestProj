package soundSystem;

import com.ossic.db.dao.UserInfoDao;
import com.ossic.db.entity.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext.xml");
        context.start();

        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.play();

        UserInfoDao userInfoDao = context.getBean(UserInfoDao.class);
//        userInfoDao.addUser(new UserInfo(1,"Ossic"));

        Iterator<UserInfo> iterator = userInfoDao.allUserInfo().iterator();
        while(iterator.hasNext()){
            UserInfo info = iterator.next();
            System.out.println("id:" + info.getId() + " name:" + info.getName());
        }
    }
}
