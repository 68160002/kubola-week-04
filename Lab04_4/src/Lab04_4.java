import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab04_4  {
    public static void main(String []args){
        JFrame f = new JFrame("Grading Program: Chotika Thepsorn 68160002 n53");
        f.setSize(500,300);
        f.setLayout(new FlowLayout());

        JTextField midbox = new JTextField(5);
        JTextField finalbox = new JTextField(5);
        JTextField hwbox = new JTextField(5);

        JButton b1 = new JButton("Grade");
        JLabel label1 = new JLabel();
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strmid = midbox.getText().toString();
                String strfinal = finalbox.getText().toString();
                String strhw = hwbox.getText().toString();
                double mid = Double.parseDouble(strmid);
                double fin = Double.parseDouble(strfinal);
                double hw = Double.parseDouble(strhw);

                double total = mid + fin + hw;
                char grade;
                if(total >= 80) grade = 'A';
                else if(total >=70) grade ='B';
                else if (total >=60) grade ='C';
                else if(total >=50) grade='D';
                else grade='F';
                label1.setText(" "+grade);
            }
        });
        f.add(midbox);
        f.add(finalbox);
        f.add(hwbox);
        f.add(b1);
        f.add(label1);
        f.setVisible(true);
    }
}
