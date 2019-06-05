package cn.lituo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cuiyang
 * @Date 2019/5/30 13:34
 * @Version 1.0.0
 */
@SpringBootApplication
@RestController
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }

    @RequestMapping("/aaa")
    public String index(){
        return "JAVA程序之家";
    }
}
