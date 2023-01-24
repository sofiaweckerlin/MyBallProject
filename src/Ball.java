import javax.swing.*;
import java.awt.*;
public class Ball{
    private int x, y, size, xSpeed, ySpeed;
    private Color color;

    public Ball(int s, int xS, int yS){
        x = (int)(Math.random()*500)+1;
        y = (int)(Math.random()*500)+1;;
        size = s;
        xSpeed = xS;
        ySpeed = yS;
    }

    public void drawBall(Graphics g){
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

    public void moveRight(){
        x+=3;
    }







}