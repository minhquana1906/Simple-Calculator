package Controller;

import Model.MyFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventsHandler implements ActionListener, MouseListener, Constances {

    private MyFrame frame;
    double input1, input2;
    private String operator ;
    public EventsHandler(MyFrame frame) {
        this.frame = frame;
        operator = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        System.out.println(cmd);

        input2 = 0;
        double res=0;

        try{
            if(PERCENT.equalsIgnoreCase(cmd)){
                res = Double.parseDouble(frame.getResDisplay().getText());
                frame.getResDisplay().setText(res / 100 + "");
            }
            if(CLEAR.equalsIgnoreCase(cmd)){
                frame.getResDisplay().setText("0");
                frame.getOperatorDisplay().setText("");
                input1 = 0;
                input2 = 0;
                res=0;
            }
            if(CLEAR_ENTIRE.equalsIgnoreCase(cmd)){
                if(!frame.getOperatorDisplay().getText().isEmpty()){
                    frame.getResDisplay().setText("0");
                    if(frame.getOperatorDisplay().getText().contains("=")){
                        frame.getOperatorDisplay().setText("");
                    }
                }
                else{
                    frame.getResDisplay().setText("0");
                    frame.getOperatorDisplay().setText("");
                }
            }
            if(BACKSPACE.equalsIgnoreCase(cmd)){
                if(!frame.getResDisplay().getText().isEmpty()) {
                    frame.getResDisplay().setText(frame.getResDisplay().getText().substring(0, frame.getResDisplay().getText().length() - 1));
                }
            }
            if(ONE_DIVIDED_BY.equalsIgnoreCase(cmd)){
                res = Double.parseDouble(frame.getResDisplay().getText());
                frame.getResDisplay().setText(1 / res + "");
            }
            if(SQUARE.equalsIgnoreCase(cmd)){
                res = Double.parseDouble(frame.getResDisplay().getText());
                frame.getResDisplay().setText(res * res + "");
            }
            if(SQUARE_ROOT.equalsIgnoreCase(cmd)){
                res = Double.parseDouble(frame.getResDisplay().getText());
                frame.getResDisplay().setText(Math.sqrt(res) + "");
            }
            if(NEGATE.equalsIgnoreCase(cmd)){
                res = Double.parseDouble(frame.getResDisplay().getText());
                frame.getResDisplay().setText(-res + "");
            }
            if (DOT.equalsIgnoreCase(cmd)) {
                if (!frame.getResDisplay().getText().contains(".")) {
                    frame.getResDisplay().setText(frame.getResDisplay().getText() + ".");
                }
            }
            if(ZERO.equalsIgnoreCase(cmd)){
                if(!frame.getResDisplay().getText().equalsIgnoreCase("0")) {
                    frame.getResDisplay().setText(frame.getResDisplay().getText() + "0");

                }
            }
            else if(ONE.equalsIgnoreCase(cmd) || TWO.equalsIgnoreCase(cmd) || THREE.equalsIgnoreCase(cmd) ||
                    FOUR.equalsIgnoreCase(cmd) || FIVE.equalsIgnoreCase(cmd) || SIX.equalsIgnoreCase(cmd) ||
                    SEVEN.equalsIgnoreCase(cmd) || EIGHT.equalsIgnoreCase(cmd) || NINE.equalsIgnoreCase(cmd)) {
                //nhap input thu nhat
                if(frame.getResDisplay().getText().equalsIgnoreCase("0")) {
                    frame.getResDisplay().setText("");
                }
                frame.getResDisplay().setText(frame.getResDisplay().getText() + cmd);
            }

            if (ADD.equalsIgnoreCase(cmd) || MINUS.equalsIgnoreCase(cmd) ||
                    MULTIPLY.equalsIgnoreCase(cmd) || DIVIDE.equalsIgnoreCase(cmd)) {
                operator = cmd;
                input1 = Double.parseDouble(frame.getResDisplay().getText());
                frame.getOperatorDisplay().setText(frame.getResDisplay().getText() + " " + cmd + " ");

                frame.getResDisplay().setText("");
            }
            else if (EQUALS.equalsIgnoreCase(cmd)) {
                input2 = Double.parseDouble(frame.getResDisplay().getText());
                frame.getOperatorDisplay().setText(frame.getOperatorDisplay().getText() + " " + input2 + " = ");

                if (ADD.equalsIgnoreCase(operator)) {
                    res = input1 + input2;
                } else if (MINUS.equalsIgnoreCase(operator)) {
                    res = input1 - input2;
                } else if (MULTIPLY.equalsIgnoreCase(operator)) {
                    res = input1 * input2;
                } else if (DIVIDE.equalsIgnoreCase(operator)) {
                    if(input2 != 0){
                        res = input1 / input2;
                    }else{
                        frame.getResDisplay().setText("Cannot divide by zero");
                        return;
                    }
                }
                frame.getResDisplay().setText(Double.toString(res));

            }
        }catch (Exception ex){
            frame.getResDisplay().setText("Error");
        }
    }

    // MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
        return;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

//    private void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        if (isHover) {
//            g.setColor(hoverColor);
//        } else {
//            g.setColor(color);
//        }
//        g.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
//    }


//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2D = (Graphics2D) g;
//        if (hovering) {
//            g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, HOVER_ALPHA));
//        } else {
//            g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, NORMAL_ALPHA));
//        }
//        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//
//        // Paint border
//        g2D.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
//        // g2D.setColor(getBackground());
//        g2D.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
//        super.paintComponent(g);
//    }
}
