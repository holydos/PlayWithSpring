package main.java.vutichenko.play.annots;

/**
 * Created by vutichenko on 17.05.2016.
 */
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Juxtapose {
    Class jux();
}
