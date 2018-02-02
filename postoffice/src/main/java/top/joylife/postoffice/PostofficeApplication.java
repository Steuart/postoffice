package top.joylife.postoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "top.joylife.postoffice.dao.mapper")
public class PostofficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostofficeApplication.class, args);
    }
}
