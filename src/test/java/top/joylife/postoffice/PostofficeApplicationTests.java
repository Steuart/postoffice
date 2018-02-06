package top.joylife.postoffice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

public class PostofficeApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void sendMail(){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.163.com");
        mailSender.setPort(25);
        mailSender.setUsername("jianmo_o@163.com");
        mailSender.setPassword("wuhaiming17951");
        SimpleMailMessage simpleMailMsg = new SimpleMailMessage();
        simpleMailMsg.setTo("wuhaiming@souche.com");
        simpleMailMsg.setFrom("jianmo_o@163.com");
        simpleMailMsg.setSubject("测试邮件");
        simpleMailMsg.setText("生存还是死亡");
        mailSender.send(simpleMailMsg);

    }
}
