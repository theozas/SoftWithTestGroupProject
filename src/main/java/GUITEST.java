import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITEST {

    private JFrame jFrame;
    private JPanel jPanel;
    private JButton jButtonAdd;
    private JButton jButtonDelete;
    private JButton jButtonSearch;
    private JLabel jLabel;
    private JTextField FirstName;
    private JTextField LastName;

    //Constructor
    public GUITEST()
    {
        GUI();
    }

    public void GUI()
    {
        jFrame = new JFrame("Contact Book");
        jFrame.setVisible(true);
        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel = new JPanel();
        jPanel.setBackground(Color.CYAN);

        jButtonAdd = new JButton("Add Contect");
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                test t1 = new test();
                t1.AddWindow();
            }
        });


        jButtonSearch = new JButton("Search Contect");
        jButtonDelete = new JButton("Delete Contect");
        jLabel = new JLabel("test Lable");

        jPanel.add(jButtonAdd);
        jPanel.add(jButtonSearch);
        jPanel.add(jButtonDelete);
        jPanel.add(jLabel);

        jFrame.add(jPanel);

    }
    public static void main(String[] args) {
        new GUITEST();
    }
}
