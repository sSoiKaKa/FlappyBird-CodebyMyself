import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Screen extends JFrame {

    Art artScreen = new Art();
    private Bird birdScreen = new Bird();

    // create a window to display the game
    public Screen(){
    setSize(500,500); //tao mot khung cua so kich thuoc 500x500
    setVisible(true); //hien thi man hinh len (true: hien thi, false: khong hien thi)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //khi bam dau x de tat thi no se tat han
    setLocation(500,100); // dieu chinh vi tri khoi dong cua cua so
    setResizable(false); // cho phep thay doi kich thuoc cua so
    add(artScreen);

    addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
           // khi bam voi ban phim se lam gi
            birdScreen.yDecrease();
        }
    });
    addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // khi click chuot se lam gi
            birdScreen.yDecrease();
        }
    });
    }



    public static void main(String[] args) {
        Screen scr = new Screen();
    }
}
