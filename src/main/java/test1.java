import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test1 extends JFrame{

    private JLabel item1;

    public test1(){
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("this is sentence");
        item1.setToolTipText("This is gona show up on hover");
        add(item1);
    }

}
class apples {
    public static void main(String[] args){

        test1 bucky = new test1();
        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bucky.setSize(275,180);
        bucky.setVisible(true);
    }
}