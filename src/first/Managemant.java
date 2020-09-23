package first;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Managemant {
    private JButton button_msg;
    private JPanel panelMain;

    public Managemant() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,("Ömer"),("Name"),1);
                JOptionPane.showMessageDialog(null,("19"),("Age"),1);
                JOptionPane.showMessageDialog(null,("50"),("HoursOfWork"),1);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Manegement");
        frame.setContentPane(new Managemant().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
