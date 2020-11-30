/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.mysql;

/**
 *
 * @author ASUS
 */
public class GameOver extends javax.swing.JFrame {

    /**
     * Creates new form GameOver
     */
    
    Game game;
    Handler handler;
    HUD hud;
    
    private Klik klik = new Klik();
    
    public GameOver(Game game, Handler handler, HUD hud) {
        this.game = game;
        this.handler = handler;
        this.hud = hud;
        initComponents();
        
    }
    
    public GameOver() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Game over");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 380, 53);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 230, 150, 39);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jButton2.setText("Play Again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 230, 150, 39);

        jLabel2.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("High Score : " + hud.getScore());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 91, 310, 30);

        jLabel3.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Corona : " + hud.getCorona());
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 147, 310, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belajar/java/account.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -4, 400, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        klik.loadMusic(klik.filepath);
        klik.clip.start();
        
        hud.setScore(0);
        hud.setCorona(0);
        hud.setLevel(1);
        
        game.gameState = Game.STATE.Menu;
        game.paused = false;
        Koneksi kon = new Koneksi();
        LoginNew log = new LoginNew();
        kon.buatSkor(hud.getScore(), hud.getCorona(), log.username);
        for (int i = 0; i < handler.object.size(); i++) {
            handler.object.clear();
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        klik.loadMusic(klik.filepath);
        klik.clip.start();
        
        for (int i = 0; i < handler.object.size(); i++) {
            handler.object.clear();
        }
        game.paused = false;
        Koneksi kon = new Koneksi();
        LoginNew log = new LoginNew();
        kon.buatSkor(hud.getScore(), hud.getCorona(), log.username);
        this.setVisible(false);
        game.gameState = Game.STATE.Game;
        handler.addObject(new Player(Game.WIDTH / 2 - 32, Game.HEIGHT - 126, ID.Player, handler));
        
        hud.setScore(0);
        hud.setCorona(0);
        hud.setLevel(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
