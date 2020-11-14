
package belajar.java.mysql;

import java.text.DecimalFormat;
import java.sql.ResultSet;
import javax.swing.table.*;
import java.lang.Thread;
import javax.swing.*;

public class IsiBensin extends javax.swing.JFrame {

    public IsiBensin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        beliField = new javax.swing.JTextField();
        literField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bayarField = new javax.swing.JTextField();
        isi = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        load = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelBayar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Beli (Rp)");

        jLabel2.setText("Liter");

        beliField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliFieldActionPerformed(evt);
            }
        });

        literField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                literFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Bayar (Rp)");

        isi.setText("ISI");
        isi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiActionPerformed(evt);
            }
        });

        stop.setText("STOP");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        load.setText("LOAD");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        TabelBayar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bayar", "Liter"
            }
        ));
        jScrollPane1.setViewportView(TabelBayar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bayarField, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(literField)
                            .addComponent(beliField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(isi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(beliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(literField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bayarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isi)
                    .addComponent(stop)
                    .addComponent(reset))
                .addGap(29, 29, 29)
                .addComponent(load)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beliFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliFieldActionPerformed
        
    }//GEN-LAST:event_beliFieldActionPerformed

    private void literFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_literFieldActionPerformed
        
    }//GEN-LAST:event_literFieldActionPerformed

    private void isiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiActionPerformed
        if(evt.getSource() == isi){
            isi.setEnabled(false);
            stop.setEnabled(true);
            cek = Integer.parseInt(beliField.getText());
            if(!thread.isAlive()){
                thread.start();
            } else {
                thread.resume();
            }
        }
    }//GEN-LAST:event_isiActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        if(evt.getSource() == stop){
            thread.suspend();
            isi.setEnabled(true);
            stop.setEnabled(false);        
        }

    }//GEN-LAST:event_stopActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        if(evt.getSource() == reset){
            beliBensin = 0;
            bayarBensin = 0;
            literBensin = 0;
        
            bayarField.setText(""+bayarBensin);
            beliField.setText(""+beliBensin);
            literField.setText(""+literBensin);  
        }
    }//GEN-LAST:event_resetActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        if (evt.getSource() == load){
        DecimalFormat df = new DecimalFormat("#.##"); 
        String formatted = df.format(literBensin);
        MySQL.executeUpdateQuerry( "insert into hasil_penjualan (Bayar, Liter) values ('"+bayarBensin+"', '"+formatted+"' ) " );
        DefaultTableModel m = (DefaultTableModel) TabelBayar.getModel();
        m.addRow(new Object[] {bayarBensin, formatted} );
        }
    }//GEN-LAST:event_loadActionPerformed

    /**
     * @param args the command line arguments
     */
    
    static int beliBensin = 0;
    static int bayarBensin = 0;
    static float literBensin = 0;
    static int cek = 0;
    static MyThread thread;
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IsiBensin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsiBensin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsiBensin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiBensin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        thread = new MyThread();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsiBensin().setVisible(true);
                init();
                
                ResultSet rs = MySQL.executeReadQuerry("select * from hasil_penjualan");
                try {
                    DefaultTableModel m = (DefaultTableModel) TabelBayar.getModel();
                    while (rs.next()){
                        m.addRow(new Object[]{ rs.getInt("Bayar") , rs.getFloat("Liter")});
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable TabelBayar;
    private static javax.swing.JTextField bayarField;
    private static javax.swing.JTextField beliField;
    private static javax.swing.JButton isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField literField;
    private static javax.swing.JButton load;
    private static javax.swing.JButton reset;
    private static javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
    
    static void init(){
        bayarField.setText(""+bayarBensin);
        beliField.setText(""+beliBensin);
        literField.setText(""+literBensin);  
        stop.setEnabled(false);
    }
    static class MyThread extends Thread{
        @Override
        public void run(){
            
            if(cek == 0){
                while (true){
                    bayarBensin +=100;
                    literBensin +=0.01;
                    
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    
                    }
                    
                    DecimalFormat df = new DecimalFormat("#.##"); 
                    String formatted = df.format(literBensin);
                    
                    bayarField.setText(""+bayarBensin);
                    literField.setText(formatted);  
                }
            }
            else {
                while (bayarBensin < cek) {
                    bayarBensin +=100;
                    literBensin +=0.01;
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    
                    }
                    DecimalFormat df = new DecimalFormat("#.##"); 
                    String formatted = df.format(literBensin);
                    bayarField.setText(""+bayarBensin);
                    literField.setText(formatted);
                }
            }
        }
    }

}
