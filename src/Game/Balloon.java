package Game;

import Game.Element;
import Game.Resources;


/**
 * Created by AMRESH on 05-07-2016.
 */
public class Balloon extends Element {

    public static int escapedCount = 0;

    public Balloon(int x, int y) {

        this(x, y, -5);
    }

    public Balloon(int x, int y, int yVel) {
        super(x, y, 128, 128);
        this.yVel = yVel;
        this.image = Resources.balloonImage;
    }

    public void update() {
        super.update();
        if (this.y < -128) {
            if (!this.hidden) {
                Balloon.escapedCount++;
            }
            this.y = 800;
            this.hidden = false;


        }
    }

    public void clickHandle(int clickX, int clickY) {
        if (this.isClicked(clickX, clickY)) {
            this.hidden = true;
        }

    }
}
