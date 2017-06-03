package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.List;

/**
 * Created by AMRESH on 05-07-2016.
 */
public class GamePanel extends JPanel implements MouseListener, Runnable {

    private Image image;
    public static State currentState;

    public GamePanel() {
        super();
        this.setPreferredSize(new Dimension(600, 700));

        this.addMouseListener(this);
        this.setFocusable(true);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.requestFocus();
        Resources.load();
        GamePanel.currentState = new MenuState();
        this.image = new BufferedImage(600, 700, BufferedImage.TYPE_INT_RGB);

        Thread thread = new Thread(this, "Game Thread");
        thread.start();
    }


    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        GamePanel.currentState.onMousePressed(e);

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {


        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Graphics graphics = this.image.getGraphics();
            Graphics panelGraphics = this.getGraphics();

            GamePanel.currentState.update(graphics);
            graphics.dispose();

            panelGraphics.drawImage(this.image, 0, 0, null);

            panelGraphics.dispose();
        }

    }

}
