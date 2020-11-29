
package belajar.java.mysql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

public class Menu extends MouseAdapter {

    private Game game;
    private Handler handler;
    private HUD hud;
    private Random r = new Random();
    
    private Font pixelMplus;
    private Music musik = new Music();
    private Klik klik = new Klik();
    private GameMusic gameMusic = new GameMusic();
    
    private Paused paused;
    
    private Image shootNow = new ImageIcon(getClass().getResource("/belajar/java/shoot now.png")).getImage();
    private Image account = new ImageIcon(getClass().getResource("/belajar/java/account.png")).getImage();
    private Image setting = new ImageIcon(getClass().getResource("/belajar/java/setting.png")).getImage();
    private Image highScore = new ImageIcon(getClass().getResource("/belajar/java/high score.png")).getImage();
    private Image exit = new ImageIcon(getClass().getResource("/belajar/java/exit.png")).getImage();
    
    private Image pause = new ImageIcon(getClass().getResource("/belajar/java/pause.png")).getImage();
    
    private Image background = new ImageIcon(getClass().getResource("/belajar/java/home.GIF")).getImage();
    private Image title = new ImageIcon(getClass().getResource("/belajar/java/coronashooter.gif")).getImage();
    private Image shootNowTitle = new ImageIcon(getClass().getResource("/belajar/java/shootnow.gif")).getImage();

    public Menu(Game game, Handler handler) {
        this.game = game;
        this.handler = handler;
        paused = new Paused(this.game, this.handler, hud);
        
        musik.loadMusic(musik.filepath);
        musik.clip.start();
        
//        if (this.game.gameState == Game.STATE.Menu) {
//            musik.loadMusic(musik.filepath);
//            musik.clip.start();
//        } else if (this.game.gameState == Game.STATE.Game) {
//            klik.loadMusic(klik.filepath);
//            klik.clip.start();
//
//            musik.clip.stop();
//            musik.loadMusic(musik.gameplay);
//            musik.clip.start();
//        }

        try {
            pixelMplus = Font.createFont(Font.TRUETYPE_FONT, new File("PixelMplus10-Regular.ttf")).deriveFont(60f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PixelMplus10-Regular.ttf")));

        } catch (IOException | FontFormatException e) {
        }
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (game.gameState == Game.STATE.Menu) {
            // play button
            if (mouseOver(mx, my, game.WIDTH/2 - 50, game.HEIGHT/2 - 180, 100, 100)) {
                klik.loadMusic(klik.filepath);
                klik.clip.start();
                
                musik.clip.stop();
                game.gameState = Game.STATE.Game;
                handler.addObject(new Player(Game.WIDTH / 2 - 32, Game.HEIGHT - 126, ID.Player, handler));
            }

            // help button
//            if (mouseOver(mx, my, 300, 300, 300, 64)) {
//                game.gameState = Game.STATE.Help;
//            }

            // quit button
            if (mouseOver(mx, my, game.WIDTH/2 - 300, game.HEIGHT/2, 100, 100)) {
                klik.loadMusic(klik.filepath);
                klik.clip.start();
                System.exit(1);
            }
            
            // acoount button
            if (mouseOver(mx, my, game.WIDTH/2 - 150, game.HEIGHT/2 + 40, 100, 100)) {
                klik.loadMusic(klik.filepath);
                klik.clip.start();
                AccountNew acc = new AccountNew();
                acc.setVisible(true);
            }
            
            // setting button
            if (mouseOver(mx, my, game.WIDTH/2, game.HEIGHT/2 + 100, 100, 100)) {
                klik.loadMusic(klik.filepath);
                klik.clip.start();
                Sounds sound = new Sounds();
                sound.setVisible(true);
            }
            
            // high score button
            if (mouseOver(mx, my, game.WIDTH/2 + 150, game.HEIGHT/2 + 190, 100, 100)) {
                klik.loadMusic(klik.filepath);
                klik.clip.start();
                Trophy trophy = new Trophy();
                trophy.setVisible(true);
            }
        }

        // back button in help
        if (game.gameState == Game.STATE.Help) {
            if (mouseOver(mx, my, 300, 400, 300, 64)) {
                game.gameState = Game.STATE.Menu;
                return;
            }
        }

        if (game.gameState == Game.STATE.Game) {
//            gameMusic.loadMusic(GameMusic.gameplay);
//            gameMusic.clip.start();
            if (!mouseOver(mx, my, game.WIDTH - 60, 15, 25, 35)) {
                for (int i = 0; i < handler.object.size() - 1; i++) {
                if (handler.object.get(i).getId() == ID.Player) {
                    handler.addObject(new Bullet((int) handler.object.get(i).x + 28, (int) handler.object.get(i).y - 24,
                            ID.Bullet, handler));
                }
            }
            }
            
            if (mouseOver(mx, my, game.WIDTH - 60, 15, 25, 35)) {
                paused.setVisible(true);
                game.paused = true;
            }
        }

    }

    public void mouseReleased(MouseEvent e) {

    }

    private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
        if (mx > x && mx < x + width) {
            if (my > y && my < y + height) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public void tick() {

    }

    public void render(Graphics g) {
        if (game.gameState == Game.STATE.Menu) {
//            Font fnt = new Font("arial", 1, 80);
//            Font fnt2 = new Font("arial", 1, 50);
//
//            g.setFont(fnt);
//            
//            g.setColor(Color.white);
//            g.drawString("Menu", 350, 110);
//
//            g.setFont(fnt2);
//            g.drawRect(300, 200, 300, 64);
//            g.drawString("Play", 405, 245);
//
//            g.drawRect(300, 300, 300, 64);
//            g.drawString("Help", 405, 345);
//
//            g.drawRect(300, 400, 300, 64);
//            g.drawString("Quit", 405, 450);

            g.drawImage(background, 0, 0, game.WIDTH, game.HEIGHT, null);
            g.drawImage(title, game.WIDTH/2 - 360, 15, 700, 128, null);
            g.drawImage(shootNow, game.WIDTH/2 - 50, game.HEIGHT/2 - 180, 100, 100, null);
            g.drawImage(shootNowTitle, game.WIDTH/2 - 250, game.HEIGHT/2 - 80, 500, 100, null);
            g.drawImage(exit, game.WIDTH/2 - 300, game.HEIGHT/2, 100, 100, null);
            g.drawImage(account, game.WIDTH/2 - 150, game.HEIGHT/2 + 40, 100, 100, null);
            g.drawImage(setting, game.WIDTH/2, game.HEIGHT/2 + 100, 100, 100, null);
            g.drawImage(highScore, game.WIDTH/2 + 150, game.HEIGHT/2 + 190, 100, 100, null);
            
//            Graphics2D g2d = (Graphics2D) g;
//            g.setColor(Color.green);
//            g2d.drawRect(game.WIDTH/2 - 50, game.HEIGHT/2 - 180, 100, 100);
//            g2d.drawRect(game.WIDTH/2 - 300, game.HEIGHT/2, 100, 100);
//            g2d.drawRect(game.WIDTH/2 - 150, game.HEIGHT/2 + 40, 100, 100);
//            g2d.drawRect(game.WIDTH/2, game.HEIGHT/2 + 100, 100, 100);
//            g2d.drawRect(game.WIDTH/2 + 150, game.HEIGHT/2 + 190, 100, 100);
        } else if (game.gameState == Game.STATE.Help) {
            Font fnt = new Font("arial", 1, 80);
            Font fnt2 = new Font("arial", 1, 50);

            g.setFont(fnt);

            g.setColor(Color.white);
            g.drawString("Help", 350, 110);

            g.setFont(fnt2);
            g.drawString("Main ajalah", 320, 300);

            g.drawRect(300, 400, 300, 64);
            g.drawString("Back", 395, 450);
        } else if (game.gameState == Game.STATE.Game) {
            g.drawImage(pause, game.WIDTH - 60, 15, 25, 35, null);
            
//            Graphics2D g2d = (Graphics2D) g;
//            g.setColor(Color.green);
//            g2d.drawRect(game.WIDTH - 60, 15, 25, 35);
        }

    }

}