import com.alibaba.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2017/12/1.
 *
 * @author zlf
 * @since 1.0
 */
public class Consumrer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
