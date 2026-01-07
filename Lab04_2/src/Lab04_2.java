import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab04_2 {
        public static void main(String []args){
            JFrame f = new JFrame();

            f.setSize(500,300);
            f.setTitle("Hello Program Chotika Thepsorn 68160002 n53");
            f.setLayout(new FlowLayout());

            JLabel label1 = new JLabel();
            label1.setText("Enter name: ");
            f.add(label1);

            JTextField namebox = new JTextField(10);
            f.add(namebox);

            JLabel label2 = new JLabel();

            JButton b1 = new JButton();
            b1.setText("Send");
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = namebox.getText();
                    label2.setText("Hello "+name);
                    //JOptionPane.showMessageDialog(null,"Hello "+ name);
                }
            });
            f.add(b1);
            f.add(label2);

            f.setVisible(true);
        }
}

