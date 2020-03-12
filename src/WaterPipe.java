import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.channels.Pipe;
import java.util.Random;

public class WaterPipe extends JPanel {

    private static int x1 = 166, x2 = x1 + 166, x3 = x2 + 166;
    private static int h1, h2, h3;
    private static boolean bl1 = false;
    private static boolean bl2 = false;
    private static boolean bl3 = false;
    private BufferedImage pipeUp, pipeDown;

    public static int getX1() {
        return x1;
    }

    public static int getH1() {
        return h1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    public void randomHeight() {
        Random rd = new Random();
        if (bl1 == false) {
            h1 = rd.nextInt(200); //0<h1<199
            bl1 = true;
        }
        if (bl2 == false) {
            h2 = rd.nextInt(200); //0<h1<199
            bl2 = true;
        }
        if (bl3 == false) {
            h3 = rd.nextInt(200); //0<h1<199
            bl3 = true;
        }
    }

    public void paint(Graphics g) {

        randomHeight();
        try {
            pipeUp = ImageIO.read(new File("E:\\FlappyBird\\res\\src\\ongnuoctren.png"));
            pipeDown = ImageIO.read(new File("E:\\FlappyBird\\res\\src\\ongnuocduoi.png"));
            g.drawImage(pipeUp, x1, 0, 50, h1, null);
            g.drawImage(pipeDown, x1, h1 + 130, 50, 500, null);

            /*// ong nuoc phia tren
            g.setColor(Color.green);
            g.fillRect(x1, 0, 50, h1);
            // ong nuoc phia duoi
            g.setColor(Color.green);
            g.fillRect(x1, h1 + 130, 50, 500);*/

            g.drawImage(pipeUp, x2, 0, 50, h2, null);
            g.drawImage(pipeDown, x2, h2 + 130, 50, 500, null);

            /*// ong nuoc phia tren
            g.setColor(Color.green);
            g.fillRect(x2, 0, 50, h2);
            // ong nuoc phia duoi
            g.setColor(Color.green);
            g.fillRect(x2, h2 + 130, 50, 500);*/

            g.drawImage(pipeUp, x3, 0, 50, h3, null);
            g.drawImage(pipeDown, x3, h3 + 130, 50, 500, null);

            /*// ong nuoc phia tren
            g.setColor(Color.green);
            g.fillRect(x3, 0, 50, h3);
            // ong nuoc phia duoi
            g.setColor(Color.green);
            g.fillRect(x3, h3 + 130, 50, 500);*/
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void xDecrease() {
        x1--;
        x2--;
        x3--;
    }

    public void xLoop() {
        if (x1 == -50) {
            x1 = 500;
            bl1 = false;
        }
        if (x2 == -50) {
            x2 = 500;
            bl2 = false;
        }
        if (x3 == -50) {
            x3 = 500;
            bl3 = false;
        }
    }


}
