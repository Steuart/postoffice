package top.joylife.postoffice;

import org.junit.Test;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;

/**
 * created by wuhaiming on 2018/2/5
 */
public class WebMagicTest {

    @Test
    public void doSomething(){
        Spider.create(new TestPageProcessor())
                .addUrl("https://github.com/code4craft")
                .thread(5)
                .run();
    }
}
