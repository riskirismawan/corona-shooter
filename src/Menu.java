import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.Font;

public class Menu extends MouseAdapter {

    private Game game;
    private Handler handler;
    private Random r = new Random();

    // String path = getClass().getResource("/icon-coronav2/pause.png").getFile();
    // Image image = new ImageIcon(path).getImage();

    boolean running = true;

    public Menu(Game game, Handler handler) {
        this.game = game;
        this.handler = handler;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        if (game.gameState == Game.STATE.Menu) {
            // play button
            if (mouseOver(mx, my, 300, 200, 300, 64)) {
                game.gameState = Game.STATE.Game;
                handler.addObject(new Player(Game.WIDTH / 2 - 32, Game.HEIGHT - 126, ID.Player, handler));
            }

            // help button
            if (mouseOver(mx, my, 300, 300, 300, 64)) {
                game.gameState = Game.STATE.Help;
            }

            // quit button
            if (mouseOver(mx, my, 300, 400, 300, 64)) {
                System.exit(1);
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
            for (int i = 0; i < handler.object.size() - 1; i++) {
                if (handler.object.get(i).getId() == ID.Player) {
                    handler.addObject(new Bullet((int) handler.object.get(i).x + 28, (int) handler.object.get(i).y - 24,
                            ID.Bullet, handler));
                }
            }
        }

        if (game.gameState == Game.STATE.Game) {
            if (mouseOver(mx, my, Game.WIDTH - 60, 15, 25, 35)) {
                System.out.println("pause");
                game.stop();
            } else if (mouseOver(mx, my, Game.WIDTH - 60, 65, 25, 35)) {
                System.out.println("play");
                game.resume();
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
            Font fnt = new Font("arial", 1, 80);
            Font fnt2 = new Font("arial", 1, 50);

            g.setFont(fnt);

            g.setColor(Color.white);
            g.drawString("Menu", 350, 110);

            g.setFont(fnt2);
            g.drawRect(300, 200, 300, 64);
            g.drawString("Play", 405, 245);

            g.drawRect(300, 300, 300, 64);
            g.drawString("Help", 405, 345);

            g.drawRect(300, 400, 300, 64);
            g.drawString("Quit", 405, 450);

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
            // } else if (game.gameState == Game.STATE.Game) {
            // g.setColor(Color.gray);
            // g.fillRect(15, 15, 200, 32);
            // g.setColor(new Color(75, 255, 0));
            // g.fillRect(15, 15, 100 * 2, 32);
            // g.setColor(Color.white);
            // g.drawRect(15, 15, 200, 32);
            // g.drawImage(image, 15, 15, 25, 37, null);
        }

    }

}
