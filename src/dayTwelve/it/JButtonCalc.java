package dayTwelve.it;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonCalc extends JButton  implements  ActionListener{

     JTextField jt;
     String str;

    public  JButtonCalc(JTextField jTF,String s)
    {
        this.setText(s);
        jt = jTF;
        str = s;
        addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(str.equals("C")) {jt.setText("");}
        else{
        jt.setText(jt.getText()+ str);}
    }
}
