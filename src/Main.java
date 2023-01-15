import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame mainframe;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private JPanel centerPannel;
    private JLabel label1;
    private JLabel label2;


    public static void main(String[] args){
        Main m = new Main();

    }

    public Main(){
        prepareGUI();
    }

    private void prepareGUI()
    {
        mainframe = new JFrame("Example with border layout");
        mainframe.setSize(700, 600);
        mainframe.setLayout(new BorderLayout());

        centerPannel = new JPanel();
        centerPannel.setLayout(new GridLayout(2, 3));


        label1 = new JLabel("label 1", SwingConstants.CENTER);
        label2 = new JLabel("label 2", SwingConstants.CENTER);


        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");

        centerPannel.add(button2);
        centerPannel.add(label1);
        centerPannel.add(button4);
        centerPannel.add(label2);
        centerPannel.add(button5);

        mainframe.add(button1, BorderLayout.NORTH);
       // mainframe.add(button2, BorderLayout.EAST);

        mainframe.add(button3, BorderLayout.SOUTH);

     //   mainframe.add(button4, BorderLayout.WEST);
        mainframe.add(centerPannel, BorderLayout.CENTER);

        mainframe.setVisible(true);



    }
}
