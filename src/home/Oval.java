package home;
import java.awt.Graphics;
import java.awt.Color;
public class Oval implements Shape{

    private boolean should_fill;

    public Oval(boolean should_fill){
        this.should_fill=should_fill;
        MyUtils.log("OVAL DRAW METHOD", "creating oval");
        try{
                Thread.sleep(2000);
        }catch(InterruptedException e){

        }
    }


    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color c) {

        g.setColor(c);
        g.drawOval(x, y, width, height);
        if(this.should_fill){
            g.fillOval(x, y, width, height);
        }
        
    }
}
