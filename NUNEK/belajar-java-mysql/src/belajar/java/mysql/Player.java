
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
// import java.awt.Graphics2D;

import java.awt.Rectangle;
import java.io.BufferedInputStream;
import javax.swing.ImageIcon;

public class Player extends GameObject {

    private Handler handler;
    
    Image image = new ImageIcon(getClass().getResource("/belajar/java/player.png")).getImage();

    // private int timer = 10;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        // TODO Auto-generated constructor stub
        this.handler = handler;

    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 64, 64);
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 70);
        y = Game.clamp(y, 0, Game.HEIGHT - 72);

    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
//        Graphics2D g2d = (Graphics2D) g;
//        g.setColor(Color.green);
//        g2d.draw(getBounds());

        // g.setColor(Color.white);
        // g.fillRect((int) x, (int) y, 32, 32);

        g.drawImage(image, (int) x, (int) y, 64, 64, null);
    }

}
