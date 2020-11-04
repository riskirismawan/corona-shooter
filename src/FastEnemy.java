import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy extends GameObject {

    private Handler handler;

    public FastEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        // TODO Auto-generated constructor stub
        this.handler = handler;

        velX = 2;
        velY = 9;
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 16, 16);
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        x += velX;
        y += velY;

        if (y <= 0 || y >= Game.HEIGHT - 56)
            velY *= -1;
        if (x <= 0 || x >= Game.WIDTH - 32)
            velX *= -1;

        handler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 16, 16, 0.05f, handler));
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        g.setColor(Color.cyan);
        g.fillRect((int) x, (int) y, 16, 16);
    }

}
