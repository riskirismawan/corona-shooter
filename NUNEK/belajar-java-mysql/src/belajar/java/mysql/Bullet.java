
package belajar.java.mysql;

//import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Bullet extends GameObject {

    private Handler handler;
    private HUD hud;
    private Random r = new Random();

    private Image image = new ImageIcon(getClass().getResource("/belajar/java/bullet.png")).getImage();

    public Bullet(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        // TODO Auto-generated constructor stub
        this.handler = handler;

        velY = -2;
        // velX = (r.nextInt(5 - -5) + -5);
        // velY = 5;
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 8, 32);
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        x += velX;
        y += velY;

        // if (y <= 0 || y >= Game.HEIGHT - 56)
        // velY *= -1;
        // if (x <= 0 || x >= Game.WIDTH - d32)
        // velX *= -1;

        if (y <= 0)
            handler.removeObject(this);

        // handler.addObject(new Trail(x, y, ID.Trail, Color.white, 8, 8, 0.1f,
        // handler));
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub

//        Graphics2D g2d = (Graphics2D) g;
//        g.setColor(Color.green);
//        g2d.draw(getBounds());

        // g.setColor(Color.white);
        // g.fillRect((int) x, (int) y, 8, 16);

        g.drawImage(image, (int) x, (int) y, 8, 32, null);
    }

}
