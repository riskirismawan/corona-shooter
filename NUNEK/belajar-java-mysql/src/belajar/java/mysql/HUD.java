
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HUD {

//    public static float HEALTH = 100, greenValue = 255;

    private int score = 0, level = 1, corona = 0;
//    private Image pause;
//    private Image play;
//    private Game game;
    
//    private final Image pause = new ImageIcon(getClass().getResource("/icon-coronav2/pause.png")).getImage();
//    private final Image play = new ImageIcon(getClass().getResource("/belajar/java/shoot play.png")).getImage();

    public void tick() {
//        HEALTH = Game.clamp(HEALTH, 0, 100);
//        greenValue = Game.clamp(greenValue, 0, 255);
//
//        greenValue = HEALTH * 2;

        // score++;
//        pause = new ImageIcon(getClass().getResource("/icon-coronav2/pause.png")).getImage();
//        play = new ImageIcon(getClass().getResource("/belajar/java/shoot play.png")).getImage();

    }

    public void renderer(Graphics g) {
//        g.setColor(Color.gray);
//        g.fillRect(15, 15, 200, 32);
//        g.setColor(new Color(75, (int) greenValue, 0));
//        g.fillRect(15, 15, (int) HEALTH * 2, 32);
        g.setColor(Color.white);
//        g.drawRect(15, 15, 200, 32);

        g.drawString("Score: " + score, 15, 64);
        g.drawString("Wave: " + level, 15, 80);

//        g.drawImage(pause, game.WIDTH - 60, 15, 25, 35, null);
//        g.drawImage(play, game.WIDTH - 60, 65, 25, 35, null);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
    public void setCorona(int corona) {
        this.corona = corona;
    }

    public int getCorona() {
        return corona;
    }

}
