package belajar.java.mysql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicEnemy extends GameObject {

    private Handler handler;

    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        // TODO Auto-generated constructor stub
        this.handler = handler;

        // velX = 5;
        velY = 2;
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 16, 16);
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        x += velX;
        y += velY;

        // if (y <= 0 || y >= Game.HEIGHT - 56)
        // velY *= -1;
        // if (x <= 0 || x >= Game.WIDTH - 32)
        // velX *= -1;

        if (y >= Game.HEIGHT)
            handler.removeObject(this);

        collision();

        handler.addObject(new Trail(x, y, ID.Trail, Color.red, 16, 16, 0.05f, handler));
    }

    private void collision() {
        for (int i = 0; i < handler.object.size() - 1; i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player || tempObject.getId() == ID.Bullet) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    handler.removeObject(this);
                    // handler.removeObject(tempObject);
                }
            }
        }
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, 16, 16);
    }

}
