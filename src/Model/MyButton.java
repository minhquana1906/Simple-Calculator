package Model;

import Controller.EventsHandler;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    private Color color;
    private Color hoverColor;
    private Color pressColor;
    private boolean isHover;
    private int radius;

    private EventsHandler eventHandler;
    public MyButton(String text){
        super(text);
        init();

        //dang ky su kien
        this.addMouseListener(eventHandler);
    }

    private void init(){
        setContentAreaFilled(false);    //Remove default background
        setFocusPainted(false);
        setBorderPainted(false);

        color = new Color(50, 50, 49);

    }
}
