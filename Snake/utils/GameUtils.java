package Snake.utils;

import java.awt.*;

public class GameUtils {
//    蛇头
    public static Image upImg = Toolkit.getDefaultToolkit().getImage("img/up.jpg");         //静态字段
    public static Image downImg = Toolkit.getDefaultToolkit().getImage("img/down.jpg");
    public static Image leftImg = Toolkit.getDefaultToolkit().getImage("img/left.jpg");
    public static Image rightImg = Toolkit.getDefaultToolkit().getImage("img/right.jpg");

    public static Image bodyImg = Toolkit.getDefaultToolkit().getImage("img/body.jpg");
    public static Image foodImg = Toolkit.getDefaultToolkit().getImage("img/food.jpg");

    public static void drawWord(Graphics g, String str, Color color, int size, int x, int y){
        g.setColor(color);      //设置颜色
        g.setFont(new Font("仿宋",Font.BOLD,size));
        g.drawString(str,x,y);
    }
}
