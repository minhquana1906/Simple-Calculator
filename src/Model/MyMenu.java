package Model;

import Controller.Constances;

import javax.swing.*;

public class MyMenu extends JMenuBar implements Constances {
    //Menu
    private JMenu file = new JMenu("File");
    private JMenu edit = new JMenu("Edit");
    private JMenu basic = new JMenu("Basic Action");
    private JMenu advanced = new JMenu("Advanced Action");
    private JMenu help = new JMenu("Help");

    //Menu Items
    private JMenuItem open = new JMenuItem("Open");
    private JMenuItem save = new JMenuItem("Save");
    private JMenuItem exit = new JMenuItem("Exit");


    private JMenuItem add = new JMenuItem(ADD);
    private JMenuItem minus = new JMenuItem(MINUS);
    private JMenuItem multiply = new JMenuItem(MULTIPLY);
    private JMenuItem divide = new JMenuItem(DIVIDE);
    private JMenuItem percent = new JMenuItem(PERCENT);
    private JMenuItem equals = new JMenuItem(EQUALS);
    private JMenuItem clear = new JMenuItem(CLEAR);
    private JMenuItem clear_entire = new JMenuItem(CLEAR_ENTIRE);
    private JMenuItem dot = new JMenuItem(DOT);
    private JMenuItem negate = new JMenuItem(NEGATE);
    private JMenuItem backspace = new JMenuItem(BACKSPACE);
    private JMenuItem square = new JMenuItem(SQUARE);
    private JMenuItem squareRoot = new JMenuItem(SQUARE_ROOT);
    private JMenuItem oneDividedBy = new JMenuItem(ONE_DIVIDED_BY);

    private JMenuItem about = new JMenuItem("About me...");


    public MyMenu(MyFrame frame){
        add(file);
        add(edit);
        add(basic);
        add(advanced);
        add(help);

        //Menu items
        file.add(open);
        file.add(save);
        file.add(exit);

        edit.add(backspace);
        edit.add(clear);
        edit.add(clear_entire);
        edit.add(equals);

        basic.add(add);
        basic.add(minus);
        basic.add(multiply);
        basic.add(divide);

        advanced.add(percent);
        advanced.add(oneDividedBy);
        advanced.add(square);
        advanced.add(squareRoot);
        advanced.add(negate);
        advanced.add(dot);

        help.add(about);
    }
}
