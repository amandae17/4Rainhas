/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rainhas;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author Icaro
 */
public class Tabuleiro_Rainhas extends javax.swing.JFrame {

    public VetorD tabuleiro = new VetorD();
    public Fila fila = new Fila();

    public void trocarIcones(JButton button) {
        VetorD listaFila = (VetorD) this.fila.mostra();
        if (listaFila.tamanho() < 1) {
            this.fila.Insere(button);
        } else {
            this.fila.Insere(button);
            JButton button1 = (JButton) this.fila.remover();
            JButton button2 = (JButton) this.fila.remover();
            Icon temp = button1.getIcon();
            button1.setIcon(button2.getIcon());
            button2.setIcon(temp);

            this.escreverNaInterface();

        }
    }

    public boolean testarTabuleiro() {
        boolean isRainhaEmCheque = false;
        for (int i = 0; i < tabuleiro.tamanho(); i++) {
            VetorD linhaTabuleiro = (VetorD) tabuleiro.pega(i);
            for (int j = 0; j < linhaTabuleiro.tamanho(); j++) {
                JButton button = (JButton) linhaTabuleiro.pega(j);
                if (button.getIcon() != null) {
                    //Verificar Colunas                    
                    int posx = i + 1;
                    while (posx < tabuleiro.tamanho()) {
                        VetorD linhaTabuleiro2 = (VetorD) tabuleiro.pega(posx);
                        JButton button2 = (JButton) linhaTabuleiro2.pega(j);
                        if (button2.getIcon() != null) {
                            isRainhaEmCheque = true;
                            return isRainhaEmCheque;
                        }
                        posx++;
                    }
                    //Verificar linhas
                    int posy = j + 1;
                    while (posy < tabuleiro.tamanho()) {
                        JButton button2 = (JButton) linhaTabuleiro.pega(posy);
                        if (button2.getIcon() != null) {
                            isRainhaEmCheque = true;
                            return isRainhaEmCheque;
                        }
                        posy++;
                    }
                    //Diagonal direita-baixo
                    posx = i + 1;
                    posy = j + 1;
                    while (posx < tabuleiro.tamanho() && posy < tabuleiro.tamanho()) {
                        VetorD linhaTabuleiro2 = (VetorD) tabuleiro.pega(posx);
                        JButton button2 = (JButton) linhaTabuleiro2.pega(posy);
                        if (button2.getIcon() != null) {
                            isRainhaEmCheque = true;
                            return isRainhaEmCheque;
                        }
                        posx++;
                        posy++;
                    }
                    //Diagonal esquerda-baixo
                    posx = i + 1;
                    posy = j - 1;
                    while (posx < tabuleiro.tamanho() && posy > 0) {
                        VetorD linhaTabuleiro2 = (VetorD) tabuleiro.pega(posx);
                        JButton button2 = (JButton) linhaTabuleiro2.pega(posy);
                        if (button2.getIcon() != null) {
                            isRainhaEmCheque = true;
                            return isRainhaEmCheque;
                        }
                        posx++;
                        posy--;
                    }

                }
            }
        }
        return isRainhaEmCheque;
    }

    public void escreverNaInterface() {
        if (testarTabuleiro()) {
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Alguma rainha esta em xeque!");
        } else {
            jLabel1.setForeground(Color.black);
            jLabel1.setText("Nenhuma rainha esta em xeque!");
        }
    }

    /**
     * Creates new form Teste
     */
    public Tabuleiro_Rainhas() {
        initComponents();

        VetorD linha0 = new VetorD();
        linha0.adiciona(jButton1);
        linha0.adiciona(jButton2);
        linha0.adiciona(jButton3);
        linha0.adiciona(jButton4);

        VetorD linha1 = new VetorD();
        linha1.adiciona(jButton5);
        linha1.adiciona(jButton6);
        linha1.adiciona(jButton7);
        linha1.adiciona(jButton8);

        VetorD linha2 = new VetorD();
        linha2.adiciona(jButton9);
        linha2.adiciona(jButton10);
        linha2.adiciona(jButton11);
        linha2.adiciona(jButton12);

        VetorD linha3 = new VetorD();
        linha3.adiciona(jButton13);
        linha3.adiciona(jButton14);
        linha3.adiciona(jButton15);
        linha3.adiciona(jButton16);

        this.tabuleiro.adiciona(linha0);
        this.tabuleiro.adiciona(linha1);
        this.tabuleiro.adiciona(linha2);
        this.tabuleiro.adiciona(linha3);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainhas/images/rainha.png")));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainhas/images/rainha.png")));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainhas/images/rainha.png")));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rainhas/images/rainha.png")));

        this.escreverNaInterface();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quatro Rainhas");
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 100, 100);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 0, 100, 100);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 0, 100, 100);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 0, 100, 100);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 100, 100, 100);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(100, 100, 100, 100);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(200, 100, 100, 100);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(300, 100, 100, 100);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 200, 100, 100);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(100, 200, 100, 100);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(200, 200, 100, 100);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(300, 200, 100, 100);

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(0, 300, 100, 100);

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(100, 300, 100, 100);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(200, 300, 100, 100);

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(300, 300, 100, 100);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 410, 400, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.trocarIcones(jButton1);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        this.trocarIcones(jButton16);
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabuleiro_Rainhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro_Rainhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro_Rainhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro_Rainhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro_Rainhas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
