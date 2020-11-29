
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class EnemyBos extends GameObject {

    private Handler handler;
    Random r = new Random();

    private int timer = 100;
    private int timer2 = 50;

    public EnemyBos(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        // TODO Auto-generated constructor stub
        this.handler = handler;

        velX = 0;
        velY = 2;
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 64, 64);
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        x += velX;
        y += velY;

        if (timer <= 0)
            velY = 0;
        else
            timer--;

        if (timer <= 0)
            timer2--;
        if (timer2 <= 0) {
            if (velX == 0)
                velX = 2;

            if (velX > 0)
                velX += 0.01f;
            else if (velX < 0)
                velX -= 0.01f;

            velX = Game.clamp(velX, -10, 10);

            int spawn = r.nextInt(10);
//            if (spawn == 0)
//                handler.addObject(new Bullet((int) x + 48, (int) y + 48, ID.BasicEnemy, handler));
        }
        if (x <= 0 || x >= Game.WIDTH - 80)
            velX *= -1;

        // if (y <= 0 || y >= Game.HEIGHT - 56)
        // velY *= -1;
        // if (x <= 0 || x >= Game.WIDTH - 32)
        // velX *= -1;

        // handler.addObject(new Trail(x, y, ID.Trail, Color.red, 64, 64, 0.05f,
        // handler));
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, 64, 64);
    }

}
