package main.java.vutichenko.play.actors;

/**
 * Created by vutichenko on 24.05.2016.
 */
public class SimonAspect {
    public void sayBefore(){
        System.out.println("Simon says: before");
    }

    public void sayAfter(){
        System.out.println("Simon says: after");
    }

    public void sayAround(){
        System.out.println("Simon says: around");
    }

    public void sayAfterSuccess(){
        System.out.println("Simon says: Woo-hooo!");
    }

    public void sayIfFailed(){
        System.out.println("Simon says: Something goes wrong!");
    }
}
