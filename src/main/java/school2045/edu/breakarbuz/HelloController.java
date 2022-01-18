package school2045.edu.breakarbuz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    int clickedLunka, neededLunka;
    public Button Lunka1;
    public Button Lunka2;
    public Button Lunka3;
    public Button Lunka4;
    public Button Lunka5;
    public Button Lunka6;
    public Button Lunka7;
    public Button Lunka8;
    public Button Lunka9;
    public Button Lunka10;
    public Button Lunka11;
    public Button Lunka12;
    public Button Lunka13;
    public Button Lunka14;
    public Button Lunka15;
    public Button Lunka16;
    public Button start;

    public void mainMethod()  {
        while (true) {
            neededLunka = (int) (Math.random() * 16 + 1);
            switch (neededLunka) {
                case 1 -> Lunka1.setVisible(true);
                case 2 -> Lunka2.setVisible(true);
                case 3 -> Lunka3.setVisible(true);
                case 4 -> Lunka4.setVisible(true);
                case 5 -> Lunka5.setVisible(true);
                case 6 -> Lunka6.setVisible(true);
                case 7 -> Lunka7.setVisible(true);
                case 8 -> Lunka8.setVisible(true);
                case 9 -> Lunka9.setVisible(true);
                case 10 -> Lunka10.setVisible(true);
                case 11 -> Lunka11.setVisible(true);
                case 12 -> Lunka12.setVisible(true);
                case 13 -> Lunka13.setVisible(true);
                case 14 -> Lunka14.setVisible(true);
                case 15 -> Lunka15.setVisible(true);
                case 16 -> Lunka16.setVisible(true);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (neededLunka) {
                case 1 -> Lunka1.setVisible(false);
                case 2 -> Lunka2.setVisible(false);
                case 3 -> Lunka3.setVisible(false);
                case 4 -> Lunka4.setVisible(false);
                case 5 -> Lunka5.setVisible(false);
                case 6 -> Lunka6.setVisible(false);
                case 7 -> Lunka7.setVisible(false);
                case 8 -> Lunka8.setVisible(false);
                case 9 -> Lunka9.setVisible(false);
                case 10 -> Lunka10.setVisible(false);
                case 11 -> Lunka11.setVisible(false);
                case 12 -> Lunka12.setVisible(false);
                case 13 -> Lunka13.setVisible(false);
                case 14 -> Lunka14.setVisible(false);
                case 15 -> Lunka15.setVisible(false);
                case 16 -> Lunka16.setVisible(false);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void Lunka1() {System.out.println(1);}
    @FXML
    protected void Lunka2() {System.out.println(2);}
    @FXML
    protected void Lunka3() {System.out.println(3);}
    @FXML
    protected void Lunka4() {System.out.println(4);}
    @FXML
    protected void Lunka5() {System.out.println(5);}
    @FXML
    protected void Lunka6() {System.out.println(6);}
    @FXML
    protected void Lunka7() {System.out.println(7);}
    @FXML
    protected void Lunka8() {System.out.println(8);}
    @FXML
    protected void Lunka9() {System.out.println(9);}
    @FXML
    protected void Lunka10() {System.out.println(10);}
    @FXML
    protected void Lunka11() {System.out.println(11);}
    @FXML
    protected void Lunka12() {System.out.println(12);}
    @FXML
    protected void Lunka13() {System.out.println(13);}
    @FXML
    protected void Lunka14() {System.out.println(14);}
    @FXML
    protected void Lunka15() {System.out.println(15);}
    @FXML
    protected void Lunka16() {System.out.println(16);}
    @FXML
    protected void Start() {
        start.setVisible(false);
        mainMethod();
    }
}