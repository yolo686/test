package Snake;

import Snake.obj.HeadObj;
import Snake.utils.GameUtils;

import javax.swing.JFrame;
import java.awt.*;

public class GameWin extends JFrame {
    HeadObj headObj = new HeadObj(GameUtils.rightImg,30,570,this);
    public void launch() {
        this.setVisible(true);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("贪吃蛇");

        while (true){
            repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }//设置窗口

    @Override
    public void paint(Graphics g) {         //paint method 系统自动调用，故不添加至main中
        g.setColor(Color.gray);
        g.fillRect(0,0,600,600);
        g.setColor(Color.black);
        for(int i = 0; i<=20 ; i++){
            g.drawLine(0,30*i,600,30*i);
            g.drawLine(30*i,0,30*i,600);
        }
        headObj.paintSelf(g);
    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();

    }

}
