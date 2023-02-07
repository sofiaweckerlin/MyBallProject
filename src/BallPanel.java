import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.SQLOutput;

public class BallPanel extends JPanel{
    
    ArrayList<Ball> balls = new ArrayList<Ball>();
    Ball cat;
    Ball pony;
    public BallPanel(){
        setBackground(Color.RED);
        cat = new Ball(this);
//        for(int i = 0; i<20; i++){
//          Ball dog = new Ball(this);
//          balls.add(dog);
//        }
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
                     cat.moveRight(BallPanel.this);
                 }
                 if(keyCode == 37){
                     cat.moveLeft(BallPanel.this);
                 }
                 if(keyCode == 38){
                     cat.moveUp();
                 }
                 if(keyCode == 40){
                     cat.moveDown(BallPanel.this);
                 }

             }

             @Override
             public void keyReleased(KeyEvent e) {

             }
         });

         JButton button = new JButton("add ball");
         this.add(button);
         button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 balls.add(new Ball(BallPanel.this));
             }
         });




    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        cat.drawBall(g);
//        pony.drawBall(g);
//        pony.moveBall(this);

        for(int i=0; i<balls.size(); i++){
          balls.get(i).drawBall(g);
          balls.get(i).moveBall(this);
        }

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }



        repaint(); //method that recalls the paint method to animate
    }



}