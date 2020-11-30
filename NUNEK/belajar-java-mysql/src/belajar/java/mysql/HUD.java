
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HUD {

//    public static float HEALTH = 100, greenValue = 255;

    private int score = 0, level = 1, corona = 0;

    public void tick() {
//        HEALTH = Game.clamp(HEALTH, 0, 100);
//        greenValue = Game.clamp(greenValue, 0, 255);
//
//        greenValue = HEALTH * 2;

        // score++;

    }

    public void renderer(Graphics g) {
        
        Font fnt = new Font("Ink Free", 1, 24);
        g.setFont(fnt);
//        g.setColor(Color.gray);
//        g.fillRect(15, 15, 200, 32);
//        g.setColor(new Color(75, (int) greenValue, 0));
//        g.fillRect(15, 15, (int) HEALTH * 2, 32);
        g.setColor(Color.white);
//        g.drawRect(15, 15, 200, 32);

        g.drawString("Score: " + score, 15, 30);
        g.drawString("Wave: " + level, 15, 60);

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
