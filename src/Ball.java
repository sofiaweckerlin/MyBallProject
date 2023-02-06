import javax.swing.*;
import java.awt.*;
public class Ball{
    private int x, y, size, xSpeed, ySpeed;
    private Color color;

    public Ball(JPanel panel){
        x = (int)(Math.random()*panel.getWidth())+1;
        y = (int)(Math.random()*panel.getHeight())+1;
        size = (int)(Math.random()*50)+6;
        xSpeed = (int)(Math.random()*5);
        ySpeed = (int)(Math.random()*5);
        color = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
    }
  
    public void drawBall(Graphics g){

        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public void moveBall(JPanel panel){
        x+=xSpeed;
        y+=ySpeed;

        if(y >= panel.getHeight()-size || y <= 0){
            ySpeed *= -1;
        }

        if(x >= panel.getWidth()-size || x <= 0){
            xSpeed *= -1;
        }
    }


    public void moveRight(JPanel panel){
        x+=3;
        if(x>=panel.getWidth()-size){
            x=0;
        }
    }

    public void moveLeft(JPanel panel){
        x-=3;
        if(x <= 0){
            x=panel.getWidth()-size;
        }
    }

    public void moveUp(){
        y-=3;
        if(y <= 0){
            y=0;
        }
    }

    public void moveDown(JPanel panel){
        y+=3;
        if(y >= panel.getHeight()-size){
            y = panel.getHeight()-size;
        }
    }


}