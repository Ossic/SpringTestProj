package start;

import com.ossic.aop.param.MP3Player;
import com.ossic.aop.simple.Performance;
import com.ossic.db.dao.UserInfoDao;
import com.ossic.db.po.UserInfo;
import com.ossic.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import soundSystem.CompactDisc;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                new String[]{"classpath*:spring/applicationContext.xml",
                        "classpath*:spring/spring-aop.xml"});
        context.start();

        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.play();
        // 测试简单的AOP
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        // 测试JDBC操作
//        UserInfoDao userInfoDao = context.getBean(UserInfoDao.class);
//        Iterator<UserInfo> iterator = userInfoDao.allUserInfo().iterator();
//        while (iterator.hasNext()) {
//            UserInfo info = iterator.next();
//            System.out.println("id:" + info.getId() + " name:" + info.getName());
//        }
//        // 测试带参数的AOP
//        MP3Player player = context.getBean(MP3Player.class);
//        System.out.println("请输入曲目编号:");
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String in = scanner.next();
//            if (!player.isLegal(in)) {
//                System.out.println("请输入正确的曲目编号:");
//                continue;
//            }
//            player.play(Integer.parseInt(in));
//            System.out.println("请输入曲目编号:");
//        }
        UserService userService = context.getBean(UserService.class);
        int id = 2;
        String name = userService.getUserNameById(id);
        System.out.println("id:" + id + " name:" + name);


    }

}
