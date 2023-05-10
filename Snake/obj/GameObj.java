package Snake.obj;

import Snake.GameWin;

import java.awt.*;

public class GameObj {
    Image img;
    protected int x;
    protected int y;
    protected int width = 30;
    protected int height = 30;

    GameWin frame;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
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

    public GameWin getFrame() {
        return frame;
    }

    public void setFrame(GameWin frame) {
        this.frame = frame;
    }

    public GameObj(Image img, int x, int y, GameWin frame) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.frame = frame;
    }

    public GameObj() {
    }

    public GameObj(Image image, int x, int y, int width, int height, GameWin frame) {
        this.img = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.frame = frame;
    }

    public void paintSelf(Graphics g) {
        g.drawImage(img,x,y,width,height,null);
    }

}



