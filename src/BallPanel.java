import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.SQLOutput;

public class BallPanel extends JPanel{
    
    ArrayList<Ball> balls = new ArrayList<Ball>();
    //Ball dog;
    public BallPanel(){
        setBackground(Color.RED);
        //dog = new Ball(this);
        for(int i = 0; i<20; i++){
          Ball dog = new Ball(this);
          balls.add(dog);
        }
        // setFocusable(true);
        // addKeyListener(new KeyListener() {
        //     @Override
        //     public void keyTyped(KeyEvent e) {

        //     }

        //     @Override
        //     public void keyPressed(KeyEvent e) {
        //         System.out.println(e.getKeyCode());
        //         int keyCode = e.getKeyCode();
        //         if(keyCode == 68){
        //             dog.moveRight();
        //         }

        //     }

        //     @Override
        //     public void keyReleased(KeyEvent e) {

        //     }
        // });

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i=0; i<20; i++){
          balls.get(i).drawBall(g);
          balls.get(i).moveBall(this);
        }

        // dog.drawBall(g);
        // dog.moveBall(this);



        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        repaint(); //method that recalls the paint method to animate
    }



}