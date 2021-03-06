/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Grafo;
import Clases.NodoArista;
import Clases.NodoGrafo;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class Grafos extends javax.swing.JFrame {

    /**
     * Creates new form Grafos
     */
    public Grafos() {
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

        jLabel3 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtInsertar = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNodo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnInsertarArista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaArista = new javax.swing.JTextArea();
        BuscarArista = new javax.swing.JButton();
        BorrarNodo = new javax.swing.JButton();
        txtBorrar = new javax.swing.JTextField();
        Borrar_ARISTA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Origen:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 30, -1));

        jLabel4.setText("Destino:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, -1));

        jLabel1.setText("Insertar Nodo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        getContentPane().add(txtInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 72, -1));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 73, -1));

        txtAreaNodo.setColumns(20);
        txtAreaNodo.setRows(5);
        jScrollPane1.setViewportView(txtAreaNodo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 263, 74));

        jLabel2.setText("ARISTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        btnInsertarArista.setText("Insertar");
        btnInsertarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAristaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 90, -1));

        jLabel5.setText("Probar Arista");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        txtAreaArista.setColumns(20);
        txtAreaArista.setRows(5);
        jScrollPane2.setViewportView(txtAreaArista);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, 140));

        BuscarArista.setText("Probar");
        BuscarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAristaActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 80, -1));

        BorrarNodo.setText("Borrar Nodo");
        BorrarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNodoActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 100, -1));
        getContentPane().add(txtBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, -1));

        Borrar_ARISTA.setText("Borrar Arista");
        Borrar_ARISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_ARISTAActionPerformed(evt);
            }
        });
        getContentPane().add(Borrar_ARISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void mostrarGrafo(){
 txtAreaNodo.setText(grafo.mostrar());
}
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtInsertar.getText().length() > 0) {
                nodoGrafo = new NodoGrafo(txtInsertar.getText().charAt(0));
                boolean grafoRespuesta = grafo.insertarNodo(nodoGrafo.valor);

                if (grafoRespuesta == true) {
                   mostrarGrafo();
                } else {
                    JOptionPane.showMessageDialog(this, "Lista llena");
                    txtInsertar.setText("");
                }

            }
            
        } catch (NullPointerException errror) {
        }
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnInsertarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAristaActionPerformed
        try{
            char origen= txtOrigen.getText().charAt(0);
            char destino = txtDestino.getText().charAt(0);
            grafo.insertarArista(origen, destino);
            //txtAreaArista.setText(grafo.mostrarArista());
          JOptionPane.showMessageDialog(this,"SI");
        }catch(NullPointerException rr){
}
    }//GEN-LAST:event_btnInsertarAristaActionPerformed

    private void BuscarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAristaActionPerformed
        //arista = new NodoArista(nodoGrafo.ant); 
        
    char cajaDeTexto=txtInsertar.getText().charAt(0);
        
         
            txtAreaArista.setText(grafo.mostrarLaArista(cajaDeTexto));

    }//GEN-LAST:event_BuscarAristaActionPerformed

    private void BorrarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNodoActionPerformed
        // TODO add your handling code here:
       if( grafo.eliminarNodo(txtBorrar.getText().charAt(0))==true){
            mostrarGrafo();
         JOptionPane.showMessageDialog(this,"BORRADO");
    }
        
    }//GEN-LAST:event_BorrarNodoActionPerformed

    private void Borrar_ARISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_ARISTAActionPerformed
        // TODO add your handling code here:
       if( grafo.eliminarArista(txtOrigen.getText().charAt(0), txtDestino.getText().charAt(0))==true){
      JOptionPane.showMessageDialog(this,"Borrad-A");
    }
       else{
       JOptionPane.showMessageDialog(this,"Me lleva la ching");
       }
        
    }//GEN-LAST:event_Borrar_ARISTAActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed
    Grafo grafo = new Grafo();
    NodoGrafo nodoGrafo;
    NodoArista arista;

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
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarNodo;
    private javax.swing.JButton Borrar_ARISTA;
    private javax.swing.JButton BuscarArista;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnInsertarArista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaArista;
    private javax.swing.JTextArea txtAreaNodo;
    private javax.swing.JTextField txtBorrar;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtInsertar;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
