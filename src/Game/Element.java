package Game;

import java.awt.*;
import java.util.Random;

/**
 * Created by AMRESH on 05-07-2016.
 */
abstract public class Element {

    public Random randomGenerator = new Random();
    public Rectangle rectangle = new Rectangle();
    public int x;
    public int y;
    public int xVel;
    public int yVel;
    public int height;
    public int width;
    public boolean hidden = false;
    public Image image = null;

    public Element(int x, int y, int width, int height) {
        super();
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

    }

    public void update() {
        this.x += this.xVel;
        this.y += this.yVel;
    }

    private Rectangle getRectangle() {
        rectangle.setBounds(this.x, this.y, this.width, this.height);
        return rectangle;
    }

    public boolean isClicked(int clickX, int clickY) {

        return this.getRectangle().contains(clickX, clickY);
    }
}
