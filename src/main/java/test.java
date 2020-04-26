import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {

    private JFrame jFrame;
    private JPanel jPanel;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField address;
    private JTextField city;
    private JTextField phoneNumber;
    private JTextField dateOfBirth;

    //Constructor
    public test()
    {
        AddWindow();
    }

    public void AddWindow()
    {
        jFrame = new JFrame("Contact Book");
        jFrame.setVisible(true);
        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel = new JPanel();
        jPanel.setBackground(Color.GREEN);

        firstName = new JTextField("first Name");

        jPanel.add(firstName);

        jFrame.add(jPanel);

    }

    public static void main(String[] args) {
        new test();
    }
}
