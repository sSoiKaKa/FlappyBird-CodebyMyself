import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bird extends JPanel {

    private static int y = 200;
    private static int x = 100;

    private BufferedImage bird;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void paint(Graphics g) {
        try {
            bird = ImageIO.read(new File("E:\\FlappyBird\\res\\src\\bird.png"));
            g.drawImage(bird, x, y, null);
         /*g.setColor(Color.RED);
        g.fillRect(x, y, 50, 30);*/
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // con chim roi xuong dat
    public void yIncrease() {
        y++;
    }

    //con chim bay len troi
    public void yDecrease() {
        y -= 40;
    }

}
