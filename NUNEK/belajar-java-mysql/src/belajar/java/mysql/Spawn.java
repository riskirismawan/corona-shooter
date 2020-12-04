
package belajar.java.mysql;

import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private Game game;
    private Random r = new Random();
    private int timer = 30; 
    private int timerKeep = timer;

    private int scoreKeep = 70;

    public Spawn(Handler handler, HUD hud, Game game) {
        this.handler = handler;
        this.hud = hud;
        this.game = game;
    }

    public void tick() {
        
        if (hud.getScore() == scoreKeep) {
            hud.setLevel(hud.getLevel() + 1);
            scoreKeep += scoreKeep;
            if (timerKeep > 5) {
                timerKeep -= 1;
            }
        }
        
            if (hud.getLevel() >= 1) {
                if (timer <= 0) {
                    handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 64), 0, ID.BasicEnemy, handler, hud, game));
                    timer = timerKeep;
                }
            }
            if (hud.getLevel() >= 4) {
                if (timer == timerKeep/2) {
                    handler.addObject(new ZigzagEnemy(r.nextInt(Game.WIDTH - 64), 0, ID.ZigzagEnemy, handler, hud, game));
                    timer = timerKeep/2 - 1;
                }
            }
            if (hud.getLevel() >= 6) {
                if (timer == timerKeep/3) {
                    handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 64), 0, ID.SmartEnemy, handler, hud, game));
                    timer = timerKeep/3 - 1;
                }
            }
            timer--;
    }

}
