package Maze.wall;

import Maze.utils.GameUtils;
import Snake.GameWin;

import java.awt.*;

public class Wall {
    public final static int[][] wall = new int[][]{
        {1,1,1,1,1,1,1,1,1,0,1},
        {1,0,1,0,0,0,0,0,0,0,1},
        {1,0,1,0,1,1,1,1,1,0,1},
        {1,0,1,0,1,0,0,0,1,0,1},
        {1,0,1,0,1,0,1,0,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,1},
        {1,0,1,0,1,0,1,0,1,0,1},
        {1,0,0,0,1,0,1,0,1,0,1},
        {1,0,1,1,1,1,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,1,0,1},
        {1,0,1,1,1,1,1,1,1,1,1}
    };
    protected static int width = 50;
    protected static int height = 50;

    Image img;
    GameWin frame;

    public static void buildWall(Graphics g){
        for(int i=0; i<=10; i++){
            for(int j=0; j<=10; j++){
                if(wall[i][j] ==1){
                    g.drawImage(GameUtils.wallImg,50*j,50*i,width,height,null);
                }
            }
        }
    }

    public Wall() {
    }

    public Wall(GameWin frame) {
        this.frame = frame;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public GameWin getFrame() {
        return frame;
    }

    public void setFrame(GameWin frame) {
        this.frame = frame;
    }
}
