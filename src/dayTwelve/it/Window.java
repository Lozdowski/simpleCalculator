package dayTwelve.it;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JTextField jTextField;
    private JButtonCalc jButton1;
    private JButtonCalc jButton2;
    private JButtonCalc jButton3;
    private JButtonCalc jButton4;
    private JButtonCalc jButton5;
    private JButtonCalc jButton6;
    private JButtonCalc jButton7;
    private JButtonCalc jButton8;
    private JButtonCalc jButton9;
    private JButtonCalc jButton10;
    private JButtonCalc jButton11;
    private JButtonCalc jButton12;
    private JButtonCalc jButton13;
    private JButtonCalc jButton14;
    private JButtonCalc jButton15;
    private JButtonCalc jButton16;
    private JButtonCalc jButton17;

    public Window(){
        setSize(new Dimension(400,300));
        setTitle("Calculator");
        setResizable(false);


        JPanel directWindow = new JPanel();
        directWindow.setLayout(null);
        directWindow.setBackground(Color.black);
        jTextField = new JTextField(1);
        jTextField.setBounds(20,10,360,40);
        jTextField.setBackground(Color.GRAY);
        directWindow.add(jTextField);

        jButton1 = new JButtonCalc(jTextField,"7");
        jButton1.setBounds(20,60,90,50);
        directWindow.add(jButton1);
        jButton2 = new JButtonCalc(jTextField,"8");
        jButton2.setBounds(110,60,90,50);
        directWindow.add(jButton2);
        jButton3 = new JButtonCalc(jTextField,"9");
        jButton3.setBounds(200,60,90,50);
        directWindow.add(jButton3);
        jButton4 = new JButtonCalc(jTextField,"+");
        jButton4.setBounds(290,60,90,50);
        directWindow.add(jButton4);
        jButton5 = new JButtonCalc(jTextField,"4");
        jButton5.setBounds(20,110,90,50);
        directWindow.add(jButton5);
        jButton6 = new JButtonCalc(jTextField,"5");
        jButton6.setBounds(110,110,90,50);
        directWindow.add(jButton6);
        jButton7 = new JButtonCalc(jTextField,"6");
        jButton7.setBounds(200,110,90,50);
        directWindow.add(jButton7);
        jButton8 = new JButtonCalc(jTextField,"-");
        jButton8.setBounds(290,110,90,50);
        directWindow.add(jButton8);
        jButton9 = new JButtonCalc(jTextField,"1");
        jButton9.setBounds(20,160,90,50);
        directWindow.add(jButton9);
        jButton10 = new JButtonCalc(jTextField,"2");
        jButton10.setBounds(110,160,90,50);
        directWindow.add(jButton10);
        jButton11 = new JButtonCalc(jTextField,"3");
        jButton11.setBounds(200,160,90,50);
        directWindow.add(jButton11);
        jButton12 = new JButtonCalc(jTextField,"*");
        jButton12.setBounds(290,160,90,50);
        directWindow.add(jButton12);
        jButton13 = new JButtonCalc(jTextField,"0");
        jButton13.setBounds(20,210,90,50);
        directWindow.add(jButton13);
        jButton14 = new JButtonCalc(jTextField,".");
        jButton14.setBounds(110,210,50,50);
        directWindow.add(jButton14);
        jButton15 = new JButtonCalc(jTextField,"/");
        jButton15.setBounds(160,210,50,50);
        directWindow.add(jButton15);
        jButton16 = new JButtonCalc(jTextField,"=");
        jButton16.setBounds(290,210,90,50);
        directWindow.add(jButton16);
        jButton17 = new JButtonCalc(jTextField,"C");
        jButton17.setBounds(210,210,80,50);
        directWindow.add(jButton17);

        add(directWindow);
    }



}
