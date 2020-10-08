package Oefenopdracht4;

import javax.swing.*;
public class View extends JPanel{
    private JLabel display;
    public View(){
        display = new JLabel("Random");
        this.add(display);
    }
    public void setDisplay(String text){
        display.setText(text);
    }
}