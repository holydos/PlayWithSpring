package main.java.vutichenko.play.toys;

import main.java.vutichenko.play.annots.RandomInt;

/**
 * Created by vutichenko on 17.05.2016.
 */
public class JackInBox implements Toy{
    @RandomInt(max=1069)
    private int times;

    public String getSomethingToWrite() {
        return somethingToWrite;
    }

    public void setSomethingToWrite(String somethingToWrite) {
        this.somethingToWrite = somethingToWrite;
    }

    private String somethingToWrite;

    public void writeOnFace() {
        System.out.println("Pick-a-boo");
    }

    public int getTimes() {
        return times;
    }
}
