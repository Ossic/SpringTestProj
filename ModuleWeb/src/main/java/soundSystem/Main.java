package soundSystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext.xml");
        context.start();

        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.play();
    }
}
