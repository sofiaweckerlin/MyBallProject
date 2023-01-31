import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.SQLOutput;

public class BallPanel extends JPanel{
    
    ArrayList<Ball> balls = new ArrayList<Ball>();
    Ball cat;
    public BallPanel(){
        setBackground(Color.RED);
        cat = new Ball(this);
        for(int i = 0; i<20; i++){
          Ball dog = new Ball(this);
          balls.add(dog);
        }
         setFocusable(true);
         addKeyListener(new KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {

             }

             @Override
             public void keyPressed(KeyEvent e) {
                 System.out.println(e.getKeyCode());
                 int keyCode = e.getKeyCode();
                 if(keyCode == 39){
                     cat.moveRight();
                 }
                 if(keyCode == 37){
                     cat.moveLeft();
                 }
                 if(keyCode == 38){
                     cat.moveUp();
                 }
                 if(keyCode == 40){
                     cat.moveDown(e);
                 }

             }

             @Override
             public void keyReleased(KeyEvent e) {

             }
         });

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        cat.drawBall(g);

//        for(int i=0; i<20; i++){
//          balls.get(i).drawBall(g);
//          balls.get(i).moveBall(this);
//        }

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        repaint(); //method that recalls the paint method to animate
    }



}