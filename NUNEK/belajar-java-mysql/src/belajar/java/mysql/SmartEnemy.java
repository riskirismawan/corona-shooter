
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Image;
import javax.swing.ImageIcon;

public class SmartEnemy extends GameObject {

    private Handler handler;
    private GameObject player;
    private HUD hud;
    private Game game;
    
    private GameOver gameOver;
    
    private Klik klik = new Klik();
    
    Image image;
    

    public SmartEnemy(int x, int y, ID id, Handler handler, HUD hud, Game game) {
        super(x, y, id);
        // TODO Auto-generated constructor stub
        this.handler = handler;
        this.hud = hud;
        this.game = game;
        
        gameOver = new GameOver(game, handler, hud);

        for (int i = 0; i < handler.object.size(); i++) {
            if (handler.object.get(i).getId() == ID.Player)
                player = handler.object.get(i);
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 32, 32);
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        x += velX;
        y += velY;
        
        image = new ImageIcon(getClass().getResource("/belajar/java/corona.png")).getImage();

        if (player != null) {
            float diffX = x - player.getX() - 10;
//         float diffY = y - player.getY() - 8;
            float distance = (float) Math.sqrt((x - player.getX()) * (x - player.getX()) + (y - player.getY()) * (y - player.getY()));

            velX = (float) ((-3 / distance) * diffX);
        }
        
        velY = 2 ;

        if (y >= Game.HEIGHT)
            handler.removeObject(this);
        
        collision();
    }
    
    private void collision() {
        for (int i = 0; i < handler.object.size() - 1; i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Bullet) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    klik.loadMusic(klik.explosion);
                    klik.clip.start();
                    
                    handler.removeObject(this);
                    handler.removeObject(tempObject);
                    hud.setScore(hud.getScore() + 5);
                    hud.setCorona(hud.getCorona() + 1);
//                    System.out.println("Corona mati : " + hud.getCorona());
                }
            } else if (tempObject.getId() == ID.Player) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    klik.loadMusic(klik.explosion);
                    klik.clip.start();
                    
                    handler.removeObject(this);
                    handler.removeObject(tempObject);
                    game.paused = true;
                    game.gameState = Game.STATE.End;
                    gameOver.setVisible(true);
                    gameOver.jLabel2.setText("Score : " + hud.getScore());
                    gameOver.jLabel3.setText("Corona : " + hud.getCorona());
//                    System.out.println("Corona mati : " + hud.getCorona());
                }
            }
        }
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
//        Graphics2D g2d = (Graphics2D) g;
//        g.setColor(Color.green);
//        g2d.draw(getBounds());

        // g.setColor(Color.red);
        // g.fillRect((int) x, (int) y, 32, 32);

        g.drawImage(image, (int) x, (int) y, 32, 32, null);
    }

}
