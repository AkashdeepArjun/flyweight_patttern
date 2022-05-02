package home;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.lang.ProcessBuilder.Redirect.Type;
import java.awt.event.*;
import home.ShapeFactory.ShapeType;

public class MyDrawingBoard extends JFrame{

    private static final long serialVerId= -123939344994L;
    private final int WIDTH;
    private final int HEIGHT;

    Container content_pane;

    JButton start_button;

    JPanel panel;
    
    private static final ShapeType shapes[]={ShapeType.LINE
            ,ShapeType.OVAL_FILL,
            ShapeType.OVAL_NO_FILL
        };
    
        private static final Color colors[]={Color.CYAN,Color.RED,Color.ORANGE,Color.PINK,Color.YELLOW};
        public MyDrawingBoard(int width,int height){
            this.WIDTH=width;
            this.HEIGHT=height;
            content_pane=getContentPane();

            content_pane.setLayout(new BorderLayout());
            start_button=new JButton("Draw");
            panel=new JPanel();
            content_pane.add(panel, BorderLayout.CENTER);
            content_pane.add(start_button,BorderLayout.SOUTH);
            setSize(WIDTH,HEIGHT);
            start_button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        setUpListener(start_button, panel);
                }
            });    
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addWindowStateListener(new WindowStateListener(){
                public void windowStateChanged(WindowEvent e){
                    trackWindowEvents(e);
                }
            });
            setVisible(true);
        }

        public void setUpListener(JButton button,JPanel panel){

            Graphics g =panel.getGraphics();
            for(int i=0;i<20;i++){
                Shape s=ShapeFactory.getShape(getRandomShape());
                s.draw(g, getRandomX(),getRandomY(), getRandomWidth(),getRandomHeight(), getRandomColor());
            }


        }

        public void trackWindowEvents(WindowEvent e){
            if(e.getNewState()=indow
        }

        private ShapeType getRandomShape(){

            return shapes[(int)(Math.random()*shapes.length)];
        }

        private int getRandomX(){
            return (int)(Math.random()*WIDTH);
        }

        private int getRandomY(){
            return (int)(Math.random()*HEIGHT);
        }

        private int getRandomWidth(){

            return (int)(Math.random()*(WIDTH/10));
        }

        private int getRandomHeight(){

            return (int)(Math.random()*(HEIGHT/10));
        }


        private Color getRandomColor(){

            return colors[(int)(Math.random()*colors.length)];
        }



}
