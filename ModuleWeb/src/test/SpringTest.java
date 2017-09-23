import static org.junit.Assert.*;

import com.ossic.service.UserService;
import mySystem.SayHello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundSystem.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class SpringTest {

    @Autowired
    private CompactDisc cd;
    @Autowired
    private SayHello sayHello;
    @Autowired
    UserService userService;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
        cd.play();
    }

    @Test
    public void sayHelloNotNull(){
        assertNotNull(sayHello);
        sayHello.sayHello();
    }

    //TODO
    @Test
    public void testGetNameByUid(){
        int id = 2;
        System.out.println("id:" + id + " name:" + userService.getUserNameById(id));
    }

}
