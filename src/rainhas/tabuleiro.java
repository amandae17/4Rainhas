/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rainhas;

/**
 *
 * @author aevan
 */
public class tabuleiro extends javax.swing.JFrame {

    /**
     * Creates new form tabuleiro
     */
    public tabuleiro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button19 = new java.awt.Button();
        button20 = new java.awt.Button();
        button21 = new java.awt.Button();
        button22 = new java.awt.Button();
        button23 = new java.awt.Button();
        button24 = new java.awt.Button();
        button25 = new java.awt.Button();
        button26 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        button3.setBackground(new java.awt.Color(0, 0, 0));
        button3.setLabel("A4");
        getContentPane().add(button3);
        button3.setBounds(240, 30, 50, 50);

        button4.setActionCommand("A1");
        button4.setLabel("A1");
        getContentPane().add(button4);
        button4.setBounds(90, 30, 50, 50);
        button4.getAccessibleContext().setAccessibleName("A1");

        button5.setBackground(new java.awt.Color(0, 0, 0));
        button5.setLabel("A2");
        getContentPane().add(button5);
        button5.setBounds(140, 30, 50, 50);

        button6.setLabel("A3");
        getContentPane().add(button6);
        button6.setBounds(190, 30, 50, 50);

        button7.setLabel("B4");
        getContentPane().add(button7);
        button7.setBounds(240, 80, 50, 50);

        button8.setBackground(new java.awt.Color(0, 0, 0));
        button8.setLabel("B1");
        getContentPane().add(button8);
        button8.setBounds(90, 80, 50, 50);

        button9.setLabel("B2");
        getContentPane().add(button9);
        button9.setBounds(140, 80, 50, 50);

        button10.setBackground(new java.awt.Color(0, 0, 0));
        button10.setLabel("button1");
        getContentPane().add(button10);
        button10.setBounds(190, 80, 50, 50);

        button19.setBackground(new java.awt.Color(0, 0, 0));
        button19.setLabel("A4");
        getContentPane().add(button19);
        button19.setBounds(240, 130, 50, 50);

        button20.setActionCommand("A1");
        button20.setLabel("C1");
        getContentPane().add(button20);
        button20.setBounds(90, 130, 50, 50);

        button21.setBackground(new java.awt.Color(0, 0, 0));
        button21.setLabel("A2");
        getContentPane().add(button21);
        button21.setBounds(140, 130, 50, 50);

        button22.setLabel("C3");
        getContentPane().add(button22);
        button22.setBounds(190, 130, 50, 50);

        button23.setLabel("D4");
        getContentPane().add(button23);
        button23.setBounds(240, 180, 50, 50);

        button24.setBackground(new java.awt.Color(0, 0, 0));
        button24.setLabel("B1");
        getContentPane().add(button24);
        button24.setBounds(90, 180, 50, 50);

        button25.setLabel("D2");
        getContentPane().add(button25);
        button25.setBounds(140, 180, 50, 50);

        button26.setBackground(new java.awt.Color(0, 0, 0));
        button26.setLabel("button1");
        getContentPane().add(button26);
        button26.setBounds(190, 180, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button10;
    private java.awt.Button button19;
    private java.awt.Button button20;
    private java.awt.Button button21;
    private java.awt.Button button22;
    private java.awt.Button button23;
    private java.awt.Button button24;
    private java.awt.Button button25;
    private java.awt.Button button26;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
