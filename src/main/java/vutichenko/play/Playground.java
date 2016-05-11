package main.java.vutichenko.play;

import main.java.vutichenko.play.OnFaceWriters.ConsoleOnFace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vutichenko on 11.05.2016.
 */
public class Playground {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.xml");

        ConsoleOnFace consoleWriter = context.getBean(ConsoleOnFace.class);
        consoleWriter.writeOnFace();
    }
}
