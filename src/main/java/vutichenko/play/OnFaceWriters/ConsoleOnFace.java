package main.java.vutichenko.play.OnFaceWriters;

/**
 * Created by vutichenko on 11.05.2016.
 */
public class ConsoleOnFace {
    private String somethingToWrite;

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
