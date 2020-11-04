import java.awt.event.*;
// import java.awt.event.KeyAdapter;
// import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;
    private boolean[] keyDown = new boolean[4];

    public KeyInput(Handler handler) {
        this.handler = handler;

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
