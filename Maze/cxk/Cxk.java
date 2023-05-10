package Maze.cxk;

import Maze.GameWin;
import Maze.utils.GameUtils;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static Maze.wall.Wall.wall;

public class Cxk {
    static Image img = GameUtils.cxkImg;
     int x;
     int y;
    GameWin frame;


    public void paintCxk(Graphics g){
        g.drawImage(GameUtils.cxkImg,50*x,50*y,50,50,null);
    }

    public Cxk( GameWin frame) {
        this.frame = frame;
        this.frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                move(e);
            }
        });
    }


    public Cxk(int x, int y, GameWin frame) {
        this.x = x;
        this.y = y;
        this.frame = frame;
        this.frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                move(e);
            }
        });
    }

    public void move(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_W:
                    if(wall[y-1][x] ==0){
                        y -=1;
                    }
                    break;
                case KeyEvent.VK_A:
                    if(wall[y][x-1] ==0){
                        x -=1;
                    }
                    break;
                case KeyEvent.VK_D:
                    if(wall[y][x+1] ==0){
                        x +=1;
                    }
                    break;
                case KeyEvent.VK_S:
                    if(wall[y+1][x] ==0){
                        y +=1;
                    }
                    break;
                default:
                    break;
            }
        }
        /*this.frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                move(e);
            }
        });*/


    public static Image getImg() {
        return img;
    }

    public static void setImg(Image img) {
        Cxk.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
