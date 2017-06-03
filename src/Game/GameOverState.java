package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by AMRESH on 07-07-2016.
 */
public class GameOverState extends State {
    @Override
    public void update(Graphics graphics) {

        graphics.clearRect(0, 0, 600, 700);
        graphics.drawImage(Resources.boomImage, 0, 0, 600, 700, null);
    }

    @Override
    public void onMousePressed(MouseEvent e) {
        if (e.getX() > 0 && e.getX() < 600 && e.getY() > 0 && e.getY() < 700){
            GamePanel.currentState = new MenuState();
        }


    }
}
