import TimeWidget.Index;

import javafx.application.Application;
import org.junit.Test;

import java.time.Duration;

public class Main {

    @Test
    public void run() throws java.lang.InterruptedException {
        Thread app = new Thread(new Runnable() {
            @Override
            public void run() {
                Application.launch(Index.class);
            }
        });
        app.run();
    }

    @Test
    public void timerTest() {
        Thread app = new Thread(new Runnable() {
            @Override
            public void run() {
                Application.launch(TimerTest.class);
            }
        });
        app.run();
    }
}