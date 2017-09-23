import com.ossic.aop.param.MP3Player;
import com.ossic.aop.simple.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-aop.xml")
public class AOPTest {

    @Autowired
    private Performance performance;
    @Autowired
    private MP3Player mp3Player;

    @Test
    public void perform() {
        performance.perform();
    }

    @Test
    public void testParamAOP() {
        mp3Player.play(5);
    }
}
