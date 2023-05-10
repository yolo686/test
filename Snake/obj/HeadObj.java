package Snake.obj;

import Snake.GameWin;
import Snake.utils.GameUtils;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HeadObj extends GameObj {
    private  String direction = "right";

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public Image getImg() {
        return super.getImg();
    }

    public HeadObj(Image img, int x, int y, GameWin frame) {
        super(img, x, y, frame);
        this.frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                changeDirection(e);
            }
        });
    }

    public void changeDirection(KeyEvent e){
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                if (!"right".equals(direction)) {
                    direction = "left";
                    img = GameUtils.leftImg;
                }
                break;
            case KeyEvent.VK_D:
                if (!"left".equals(direction)) {
                    direction = "right";
                    img = GameUtils.rightImg;
                }
                break;
            case KeyEvent.VK_W:
                if (!"down".equals(direction)) {
                    direction = "up";
                    img = GameUtils.upImg;
                }
                break;
            case KeyEvent.VK_S:
                if (!"up".equals(direction)) {
                    direction = "down";
                    img = GameUtils.downImg;
                }
                break;
            default:
                break;
        }
    }

    public void move() {
        switch (direction){
            case "up":
                y -= height;
                break;
            case "down":
                y += height;
                break;
            case "left":
                x -= width;
                break;
            case "right":
                x += width;
                break;
            default:
                break;
        }
    }
    @Override
    public void paintSelf(Graphics g) {
        super.paintSelf(g);
        move();
        if(x<0){
            x = 570;
        }else if(x>570){
            x = 0;
        }else if(y<0){
            y = 570;
        }else if(y>570){
            y = 0;
        }
    }
}
