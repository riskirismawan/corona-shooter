
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HUD implements Suport{

//    public static float HEALTH = 100, greenValue = 255;

    private int score = 0, level = 1, corona = 0;

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        
        Font fnt = new Font("Ink Free", 1, 24);
        g.setFont(fnt);
        g.setColor(Color.white);

        g.drawString("Score: " + score, 15, 30);
        g.drawString("Wave: " + level, 15, 60);
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

    @Override
    public void bersih() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
