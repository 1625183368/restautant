import com.itmao.restaurant.ShowIndex8001;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShowIndex8001.class)
public class test {
    @Autowired
    @Qualifier("IRedis")
    private RedisTemplate redisTemplate;
    @Test
    public void testindex(){
        redisTemplate.opsForValue().set("keystaple","皮蛋瘦肉粥");
        System.out.println(redisTemplate.opsForValue().get("keystaple"));
    }
}
