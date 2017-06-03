package Game;

import java.awt.*;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.util.*;

/**
 * Created by AMRESH on 07-07-2016.
 */
public class Stage1State extends State {

    private java.util.List<Element> elements;
    private java.util.List<Element> elements1;
    private int score = 0;

    public Stage1State() {

        super();
        this.elements = new ArrayList<>();
        elements.add(new Balloon(10, 800));
        elements.add(new Balloon(200, 900));
        elements.add(new Balloon(300, 650));
        elements.add(new Balloon(50, 400));
        elements.add(new Balloon(10, 800));

        this.elements1 = new ArrayList<>();
        elements1.add(new Bomb(100, 890));
        elements1.add(new Bomb(290, 990));
        elements1.add(new Bomb(30, 750));
        elements1.add(new Bomb(500, 490));
        elements1.add(new Bomb(190, 840));

    }


    @Override
    public void update(Graphics graphics) {

        if (this.score >= 50) {
            GamePanel.currentState = new Stage2State();
        }

        if (Balloon.escapedCount >= 10) {
            GamePanel.currentState = new GameOverState();
            Balloon.escapedCount = 0;
        }
        graphics.clearRect(0, 0, 600, 700);
        graphics.setColor(Color.cyan);
        graphics.fillRect(0, 0, 600, 700);
        graphics.setColor(Color.white);


        graphics.drawString("Score " + Integer.toString(this.score), 500, 20);


        for (int i = 0; i < this.elements.size(); i++) {
            Element element = this.elements.get(i);
            element.update();
            if (!element.hidden) {
                graphics.drawImage(element.image, element.x, element.y, null);
            }
        }

        for (int i = 0; i < this.elements1.size(); i++) {
            Element element = this.elements1.get(i);
            element.update();
            if (!element.hidden) {
                graphics.drawImage(element.image, element.x, element.y, null);
            }
        }


    }

    @Override
    public void onMousePressed(MouseEvent e) {

        for (int i = 0; i < this.elements.size(); i++) {
            Balloon balloon = (Balloon) this.elements.get(i);
            balloon.clickHandle(e.getX(), e.getY());
            this.score += 1;

        }

        for (int i = 0; i < this.elements1.size(); i++) {
            Bomb bomb = (Bomb) this.elements1.get(i);
            boolean b = bomb.isClicked(e.getX(), e.getY());
            if (b) {
                GamePanel.currentState = new GameOverState();
            }

        }
    }
}
