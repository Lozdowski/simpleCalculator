package dayTwelve.it;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonCalc extends JButton  implements  ActionListener {

    JTextField jt;
    String str;

    private static double result;
    private static double rememberNum;
    private static int switchThis;

    public JButtonCalc(JTextField jTF, String s) {
        this.setText(s);
        jt = jTF;
        str = s;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (str.equals("C")) {
            jt.setText("");
        }
        else if(str.equals("+")){
            rememberNum = Double.parseDouble(jt.getText());
            switchThis =1;
            jt.setText("");
        }
        else if(str.equals("=")){
            calcIt(switchThis);
        }
        else if(str.equals("-")){
            rememberNum=Double.parseDouble(jt.getText());
            switchThis=2;
            jt.setText("");
        }
        else if(str.equals("*")){
            rememberNum=Double.parseDouble(jt.getText());
            switchThis = 3;
            jt.setText("");

        }
        else if(str.equals("/")){
            rememberNum = Double.parseDouble(jt.getText());
            switchThis=4;
            jt.setText("");
        }

        else{
            jt.setText(jt.getText() + str);
        }


    }

    private void calcIt(int switchThis) {
        switch (switchThis) {
            case 1:
                result = rememberNum + Double.parseDouble(jt.getText());
                jt.setText(Double.toString(result));
                break;
            case 2:
                result = rememberNum - Double.parseDouble(jt.getText());
                jt.setText(Double.toString(result));
                break;
            case 3:
                result = rememberNum * Double.parseDouble(jt.getText());
                jt.setText(Double.toString(result));
                break;
            case 4:
                result = rememberNum / Double.parseDouble(jt.getText());
                jt.setText(Double.toString(result));
                break;
        }


    }
}
