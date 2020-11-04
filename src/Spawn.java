import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private Random r = new Random();
    private int timer = 500;

    private int scoreKeep = 0;

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {

        if (timer == 0) {
            handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), 0, ID.BasicEnemy, handler));
            timer = 500;
        } else
            timer--;

        scoreKeep++;
        if (scoreKeep >= 500) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);

            // if (hud.getLevel() % 2 == 0) {
            // handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), 0, ID.BasicEnemy,
            // handler));
            // }
            // if (hud.getLevel() == 4) {
            // handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH),
            // r.nextInt(Game.HEIGHT), ID.FastEnemy, handler));
            // } else if (hud.getLevel() == 5) {
            // handler.addObject(
            // new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy,
            // handler));
            // handler.addObject(
            // new SmartEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SmartEnemy,
            // handler));
            // }
            if (hud.getLevel() == 2) {
                handler.clearEnemy();
                handler.addObject(new EnemyBos(Game.WIDTH / 2, (Game.HEIGHT / 2) - 500, ID.EnemyBos, handler));
            }

        }

    }

}
