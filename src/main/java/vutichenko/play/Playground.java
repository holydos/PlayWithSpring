package main.java.vutichenko.play;

import main.java.vutichenko.play.toys.JackInBox;
import main.java.vutichenko.play.toys.SpeakingDolly;
import main.java.vutichenko.play.toys.Toy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vutichenko on 11.05.2016.
 */
public class Playground {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.xml");

        Toy toy = context.getBean("dolly", Toy.class);
        toy.writeOnFace();
        System.out.println(toy.getTimes());
    }
}
