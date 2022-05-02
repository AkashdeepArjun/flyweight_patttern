package home;
import java.awt.Color;
import java.awt.Graphics;
public class Line implements Shape{

    public Line(){
        MyUtils.log("LINE DRAW CONSTRUCTOR", "creating line");
        try{
                Thread.sleep(2000);
        }catch(InterruptedException e){

            e.printStackTrace();
        }

    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color c) {
        
        g.setColor(c);
        g.drawLine(x,y,width,height);
        
    }
}
