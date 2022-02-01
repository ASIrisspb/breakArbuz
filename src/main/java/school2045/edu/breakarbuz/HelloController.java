package school2045.edu.breakarbuz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Timer;

public class HelloController {
    int lastLunka = 0;
    int neededLunka;
    int currentIndex = 0;
    public Button[] buttons = new Button[16];
    {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button();
            buttons[i].setVisible(true);

        }
    }
    public Button start;

    public void randomLunka() {
        while (true) {
            neededLunka = (int) (Math.random() * 16);
            if (neededLunka != lastLunka) {
                lastLunka = neededLunka;
                currentIndex = neededLunka;
                break;
            }
        }
        lunkaClick();
    }
    @FXML
    public void lunkaClick() {
        buttons[currentIndex].setVisible(false);
        randomLunka();
        System.out.println(1);
    }

    @FXML
    protected void Start() {
//        start.setVisible(false);
        lunkaClick();

    }
}