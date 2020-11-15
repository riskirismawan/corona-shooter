
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Spawner {
    private Handler handler;
//    private HUD hud;
    private Random r = new Random();
    private int timer = 500, count = 20, han = 100, han2 = 20;

    private int scoreKeep = 0;

//    public Spawn(Handler handler, HUD hud) {
//        this.handler = handler;
//        this.hud = hud;
//    }
    
    public Spawner(Handler handler) {
        this.handler = handler;
    }

    public void tick() {

        if (timer == 0) {
            handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), 0, ID.BasicEnemy, handler));
            if (han == 1) {
                timer = han;
            } else {
                if (count == 0) {
                    han -= 1;
                    timer = han;

                    if (han % 10 == 0) {
                        han2 += 5;
                    } else
                        count = han2;
                } else {
                    timer = han;
                    count--;
                }
            }
        } else
            timer--;

        System.out.println(han + " : " + timer);

        scoreKeep++;
        if (scoreKeep >= 500) {
            scoreKeep = 0;
//            hud.setLevel(hud.getLevel() + 1);

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
            // if (hud.getLevel() == 2) {
            // handler.clearEnemy();
            // handler.addObject(new EnemyBos(Game.WIDTH / 2, (Game.HEIGHT / 2) - 500,
            // ID.EnemyBos, handler));
            // }

        }

    }
}
