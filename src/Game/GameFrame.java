package Game;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by AMRESH on 05-07-2016.
 */
public class GameFrame extends JFrame {

    public GameFrame() {
        super();

        GamePanel panel = new GamePanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 700);
        this.setContentPane(panel);
        this.pack();
        this.setResizable(false);

    }
}
