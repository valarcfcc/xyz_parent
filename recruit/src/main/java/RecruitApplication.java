import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @Auther: valarcfcc
 * @Date: 2020/4/25 21:56
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.xyz.base.mapper")
public class RecruitApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecruitApplication.class,args);
    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
