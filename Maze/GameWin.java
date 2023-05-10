package Maze;

import Maze.cxk.Cxk;
import Maze.utils.GameUtils;
import Maze.wall.Wall;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {

    Cxk cxk = new Cxk(1,10,this);
    public void launch() {
        this.setVisible(true);
        this.setSize(550, 550);
        this.setLocationRelativeTo(null);
        this.setTitle("迷宫");

        while (true) {
            repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void paint(Graphics g){
        Wall.buildWall(g);
        g.drawImage(GameUtils.ballImg,450,0,50,50,null);
            cxk.paintCxk(g);
        }
}
