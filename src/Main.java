import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);
        Main myPanel = new Main();
        BallPanel ballPanel = new BallPanel();

        //this panel is not added to the frame yet
        //myFrame.add(myPanel);

        myFrame.add(ballPanel);

        myFrame.setVisible(true);









    }
}