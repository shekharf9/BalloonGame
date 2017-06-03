package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by AMRESH on 07-07-2016.
 */
public class MenuState extends State {
    @Override
    public void update(Graphics graphics) {

        graphics.clearRect(0, 0, 600, 700);
        graphics.drawImage(Resources.gameStartImage, 0, 0, 600, 700, null);
         graphics.fillRect(200, 500, 210, 100);

    }

    @Override
    public void onMousePressed(MouseEvent e) {

        if (e.getX() >= 200 && e.getX() <= 410 && e.getY() >= 500 && e.getY() <= 600) {
            GamePanel.currentState = new Stage1State();
        }

    }
}
