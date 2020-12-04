
package belajar.java.mysql;

import java.awt.event.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;
    private Game game;
    private HUD hud;
    private boolean[] keyDown = new boolean[4];
    private boolean running = true;
    private Paused pause;
    
    private Klik klik = new Klik();

    public KeyInput(Handler handler, Game game, HUD hud) {
        this.handler = handler;
        this.game = game;
        this.hud = hud;
        pause = new Paused(this.game, this.handler, this.hud);

        for (int i = 0; i < keyDown.length; i++) {
            keyDown[i] = false;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
                    tempObject.setVelX(6);
                    keyDown[2] = true;
                }
                if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
                    tempObject.setVelX(-6);
                    keyDown[3] = true;
                }
                if (key == KeyEvent.VK_SPACE) {
//                    klik.loadMusic(klik.shooting);
//                    klik.clip.start();
                    
                    handler.addObject(new Bullet((int) handler.object.get(i).x + 28, (int) handler.object.get(i).y - 24,
                            ID.Bullet, handler));
                }
            }
        }
        
        if (key == KeyEvent.VK_P) {
            if (game.gameState == Game.STATE.Game) {
                if (game.paused) {
                    game.paused = false;
                } else {
                    pause.setVisible(true);
                    game.paused = true;
                }
            }
        }
        
        if (key == KeyEvent.VK_ESCAPE)
            System.exit(1);
        
        

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT)
                    // tempObject.setVelX(0);
                    keyDown[2] = false;
                if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT)
                    // tempObject.setVelX(0);
                    keyDown[3] = false;

                if (!keyDown[0] && !keyDown[1])
                    tempObject.setVelY(0);
                if (!keyDown[2] && !keyDown[3])
                    tempObject.setVelX(0);
            }
        }

    }

}
