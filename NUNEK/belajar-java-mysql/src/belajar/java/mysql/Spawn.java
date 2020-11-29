
package belajar.java.mysql;

import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private Game game;
    private Random r = new Random();
    private int timer = 30;

    private int scoreKeep = 0;

    public Spawn(Handler handler, HUD hud, Game game) {
        this.handler = handler;
        this.hud = hud;
        this.game = game;
    }

    public void tick() {

        if (timer == 0) {
            handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 64), 0, ID.BasicEnemy, handler, hud, game));
            timer = 30;
        } else if (timer == 10) {
            handler.addObject(new ZigzagEnemy(r.nextInt(Game.WIDTH - 64), 0, ID.ZigzagEnemy, handler, hud, game));
            timer = 9;
        } else
            timer--;

        scoreKeep++;
        if (scoreKeep >= 500) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);

            if (hud.getLevel() % 1 == 0) {
                handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 64), 0, ID.SmartEnemy, handler, hud, game));
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
                // if (hud.getLevel() == 2) {
                // handler.clearEnemy();
                // handler.addObject(new EnemyBos(Game.WIDTH / 2, (Game.HEIGHT / 2) - 500,
                // ID.EnemyBos, handler));
            }

        }

    }

}