package Game;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by AMRESH on 05-07-2016.
 */
public class Resources {

    public static Image balloonImage;
    public static Image bombImage;
    public static Image boomImage;
    public static Image gameStartImage;
    public static Image gameOverImage;
   // public static AudioClip burstAudio;

    private Resources() {

    }


    public static void load() {
        try {
            Resources.balloonImage = ImageIO.read(Resources.class.getResource("images/ballon.png"));
            Resources.bombImage = ImageIO.read(Resources.class.getResource("images/bomb.png"));
            Resources.boomImage = ImageIO.read(Resources.class.getResource("images/boom.png"));
            Resources.gameStartImage = ImageIO.read(Resources.class.getResource("images/gameStart.png"));
            Resources.gameOverImage = ImageIO.read(Resources.class.getResource("images/gameOver.png"));
           //  Resources.burstAudio = Applet.newAudioClip(Resources.class.getResource("audios/onjump.wav"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

