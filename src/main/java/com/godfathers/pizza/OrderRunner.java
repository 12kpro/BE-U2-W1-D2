package com.godfathers.pizza;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaApplication.class);
//        log.info(ctx.getBean("margherita").toString());
//        log.info(ctx.getBean("hawaiian").toString());
//        log.info(ctx.getBean("salami").toString());
//        log.info((String) ctx.getBean("cheeseextra"));
//        log.info((String) ctx.getBean("hamextra"));
//        log.info((String) ctx.getBean("onionsextra"));
//        log.info((String) ctx.getBean("pineappleextra"));
//        log.info((String) ctx.getBean("salamiextra"));
//        log.info(ctx.getBean("lemonade").toString());
//        log.info(ctx.getBean("water").toString());
//        log.info(ctx.getBean("wine").toString());
//        log.info(ctx.getBean("shirts").toString());
//        log.info(ctx.getBean("mug").toString());
//        ctx.close();
    }
}
