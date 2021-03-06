package main.java.vutichenko.play.toys;

import main.java.vutichenko.play.annots.RandomInt;

/**
 * Created by vutichenko on 11.05.2016.
 */
//@Juxtapose(jux = JackInBox.class)
public class SpeakingDolly implements Toy {
    private String somethingToWrite;

    @RandomInt(max=10)
    private int times;

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getSomethingToWrite() {
        return somethingToWrite;
    }

    public void setSomethingToWrite(String somethingToWrite) {
        this.somethingToWrite = somethingToWrite;
    }

    public void writeOnFace(){
        System.out.println(somethingToWrite);
    }

}
