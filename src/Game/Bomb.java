package Game;

/**
 * Created by AMRESH on 07-07-2016.
 */
public class Bomb extends Element {

    public Bomb(int x, int y) {

        super(x, y, 128, 128);
        this.yVel = -10;
        this.image = Resources.bombImage;

    }

    public void update() {
        super.update();
        if (this.y < -128) {
            this.y = 800;
            this.hidden = false;
        }
    }

    // public void clickHandle(int clickX, int clickY) {
    //    if (this.isClicked(clickX, clickY)) {
    //        this.hidden = true;
    //    }

    // }
}
