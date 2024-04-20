package Model;

import Controller.Constances;
import Controller.EventsHandler;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame implements Constances {

    private Dimension FRAME_SIZE;
    private JPanel contentPane;
    private JPanel displayPanel;
    private JPanel operatorPanel;

    private JTextField resDisplay;
    private JTextField operatorDisplay;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;

    //Buttons
    private JButton add;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private JButton percent;
    private JButton one_divided_by;
    private JButton square;
    private JButton squareRoot;
    private JButton backSpace;
    private JButton clear;
    private JButton clear_entire;
    private JButton equals;
    private JButton negate;
    private JButton dot;
    //numbers
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;

    //Menu
    private MyMenu menu;
    //events
    private EventsHandler eHandler;

    //getter & setter

    public JTextField getResDisplay() {
        return resDisplay;
    }
    public JTextField getOperatorDisplay(){
        return operatorDisplay;
    }

    public MyFrame(){
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(330, 540);
        FRAME_SIZE = this.getSize();
        setLocationRelativeTo(null);
        setResizable(false);

        initContentPane();

        //init components
        initComponent();


        setVisible(true);

        //dang ky su kien
        percent.addActionListener(eHandler);
        clear_entire.addActionListener(eHandler);
        clear.addActionListener(eHandler);
        backSpace.addActionListener(eHandler);
        one_divided_by.addActionListener(eHandler);
        square.addActionListener(eHandler);
        squareRoot.addActionListener(eHandler);
        divide.addActionListener(eHandler);
        multiply.addActionListener(eHandler);
        minus.addActionListener(eHandler);
        add.addActionListener(eHandler);
        negate.addActionListener(eHandler);
        dot.addActionListener(eHandler);
        equals.addActionListener(eHandler);
        zero.addActionListener(eHandler);
        one.addActionListener(eHandler);
        two.addActionListener(eHandler);
        three.addActionListener(eHandler);
        four.addActionListener(eHandler);
        five.addActionListener(eHandler);
        six.addActionListener(eHandler);
        seven.addActionListener(eHandler);
        eight.addActionListener(eHandler);
        nine.addActionListener(eHandler);
    }

    private void initContentPane(){
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        menu = new MyMenu(this);
        eHandler = new EventsHandler(this);

        setContentPane(contentPane);
        setJMenuBar(menu);
    }

    private void initComponent(){
        //display
        displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());
        displayPanel.setPreferredSize(new Dimension((int)(FRAME_SIZE.getWidth()), (int)(FRAME_SIZE.getHeight()/4)));

        resDisplay = new JTextField("0");
        resDisplay.setFont(new Font("Arial", Font.BOLD, 24));
        resDisplay.setHorizontalAlignment(JTextField.RIGHT);
        resDisplay.setBorder(null);
        resDisplay.setEditable(false);

        operatorDisplay = new JTextField("");
        operatorDisplay.setFont(new Font("Arial", Font.BOLD, 20));
        operatorDisplay.setHorizontalAlignment(JTextField.RIGHT);
        operatorDisplay.setBorder(null);
        operatorDisplay.setEditable(false);

        displayPanel.add(resDisplay, BorderLayout.CENTER);
        displayPanel.add(operatorDisplay, BorderLayout.NORTH);

        contentPane.add(displayPanel, BorderLayout.NORTH);

        //operator
        operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(6, 4));

        add = new JButton(ADD);
//        add.setIcon(new ImageIcon(getClass().getResource("/Resources/add.png")));
        minus = new JButton(MINUS);
        multiply = new JButton(MULTIPLY);
        divide = new JButton(DIVIDE);
        percent = new JButton(PERCENT);
        one_divided_by = new JButton(ONE_DIVIDED_BY);
        square = new JButton(SQUARE);
        squareRoot = new JButton(SQUARE_ROOT);
        backSpace = new JButton(BACKSPACE);
        clear = new JButton(CLEAR);
        clear_entire = new JButton(CLEAR_ENTIRE);
        equals = new JButton(EQUALS);
        negate = new JButton(NEGATE);
        dot = new JButton(DOT);
        zero = new JButton(ZERO);
        one = new JButton(ONE);
        two = new JButton(TWO);
        three = new JButton(THREE);
        four = new JButton(FOUR);
        five = new JButton(FIVE);
        six = new JButton(SIX);
        seven = new JButton(SEVEN);
        eight = new JButton(EIGHT);
        nine = new JButton(NINE);


        operatorPanel.add(percent);
        operatorPanel.add(clear_entire);
        operatorPanel.add(clear);
        operatorPanel.add(backSpace);
        operatorPanel.add(one_divided_by);
        operatorPanel.add(square);
        operatorPanel.add(squareRoot);
        operatorPanel.add(divide);
        operatorPanel.add(seven);
        operatorPanel.add(eight);
        operatorPanel.add(nine);
        operatorPanel.add(multiply);
        operatorPanel.add(four);
        operatorPanel.add(five);
        operatorPanel.add(six);
        operatorPanel.add(minus);
        operatorPanel.add(one);
        operatorPanel.add(two);
        operatorPanel.add(three);
        operatorPanel.add(add);
        operatorPanel.add(negate);
        operatorPanel.add(zero);
        operatorPanel.add(dot);
        operatorPanel.add(equals);

        contentPane.add(operatorPanel, BorderLayout.CENTER);
    }
}
