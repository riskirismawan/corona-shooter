package belajar.java.mysql;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import java.awt.Font;

public class Menu extends MouseAdapter {

    private Game game;
    private Handler handler;
    private Random r = new Random();

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
                handler.addObject(new Player(Game.WIDTH / 2 - 32, Game.WIDTH / 2 + 130, ID.Player, handler));
                handler.addObject(
                        new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler));
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
                    handler.addObject(new Bullet((int) handler.object.get(i).x + 12, (int) handler.object.get(i).y - 4,
                            ID.Bullet, handler));
                }
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
        }

    }

}
