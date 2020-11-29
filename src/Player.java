import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends GameObject {

    Random r = new Random();
    Handler handler;

    String path = getClass().getResource("/icon-coronav2/player.png").getFile();
    Image image = new ImageIcon(path).getImage();

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

        x = Game.clamp(x, 0, Game.WIDTH - 80);
        y = Game.clamp(y, 0, Game.HEIGHT - 72);

        // if (timer == 0) {
        // handler.addObject(new Bullet((int) x + 12, (int) y - 4, ID.Bullet, handler));
        // timer = 10;
        // } else
        // timer--;

        // int spawn = r.nextInt(10);
        // if (spawn == 0)
        // handler.addObject(new Bullet((int) x + 12, (int) y - 4, ID.Bullet, handler));

        // collision();

    }

    // private void collision() {
    // for (int i = 0; i < handler.object.size(); i++) {
    // GameObject tempObject = handler.object.get(i);

    // if (tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy
    // || tempObject.getId() == ID.SmartEnemy) {
    // if (getBounds().intersects(tempObject.getBounds())) {
    // HUD.HEALTH -= 2;
    // }
    // }
    // }
    // }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub

        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.green);
        g2d.draw(getBounds());

        // g.setColor(Color.white);
        // g.fillRect((int) x, (int) y, 32, 32);

        g.drawImage(image, (int) x, (int) y, 64, 64, null);
    }

}
