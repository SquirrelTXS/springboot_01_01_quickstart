package cn.itheima;

import cn.itheima.pojo.Blue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

    @Bean("blue1")
    public Blue blue() {
        return new Blue();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Blue blue = context.getBean(Blue.class);
        System.err.println(blue);
    }

}
