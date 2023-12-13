package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author
 * @Date 2022/12/22 8:39
 * @Description
 **/
public class MainMenu extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JTable table1;
    static int i = 0;

    public MainMenu() {


        this.panel1 = new JPanel();
        this.button1 = new JButton();
        this.button2 =  new JButton();
        this.button3 =  new JButton();
        this.button4 =  new JButton();
        this.button5 =  new JButton();
        this.button6 =  new JButton();
        this.button7 =  new JButton();
        this.button8 = new JButton();
        this.button9 =  new JButton();
        this.button10 = new JButton();
        this.button11 =  new JButton();
        this.button12 =  new JButton();

        panel1.add(button1);
        panel1.add(button5);
        panel1.setVisible(true);
        setVisible(true);
        setBounds(400,400,500,420);
        setTitle("JFRAME 测试程序");
        add(panel1);


        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("dianaa"+(++i));
            }
        });

    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
