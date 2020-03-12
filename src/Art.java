import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Art extends JPanel implements Runnable {

    private Bird birdA = new Bird();
    private WaterPipe waterPipeA = new WaterPipe();
    private Check checkA = new Check();
    private Score scoreA = new Score();

    private BufferedImage background, land;

    Thread threadA;

    public Art() {
        Thread threadA = new Thread(this);
        threadA.start();
    }

    public void paint(Graphics draw) {
        //draw.setColor(Color.cyan); //sky
        // draw.fillRect(0,0,getWidth(),getHeight());

        try {
            background = ImageIO.read(new File("E:\\FlappyBird\\res\\src\\nen.png")); // lay anh vao
            draw.drawImage(background, 0, 0, null); // dan anh len vi tri can dat

            waterPipeA.paint(draw);

            land = ImageIO.read(new File("E:\\FlappyBird\\res\\src\\nendat.png"));
            draw.drawImage(land, 0, 370, null);
            /*draw.setColor(Color.green); //grass
            draw.fillRect(0,350, getWidth(), getHeight());
            draw.setColor(Color.orange); //land
            draw.fillRect(0, 370, getWidth(), getHeight());*/

            birdA.paint(draw);

            draw.setColor(Color.black);
            draw.setFont(new Font("Arial", Font.BOLD, 20));
            draw.drawString("Score: " + scoreA.getScore(), 10, 20);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // an unstoppable loop
        while (true) {
            repaint(); // recall paint function
            waterPipeA.xDecrease(); // call xDecrease method
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // program will stop 5 microseconds
            waterPipeA.xLoop();

            birdA.yIncrease();

            if (checkA.dead() == true) {
                threadA.stop();
            }
            scoreA.addScore();
            System.out.println(scoreA.getScore());
        }

    }
}
