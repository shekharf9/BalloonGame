package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by AMRESH on 07-07-2016.
 */
abstract public class State {

    public abstract void update(Graphics graphics);

    public abstract void onMousePressed(MouseEvent e);
}
