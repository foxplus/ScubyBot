/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * frmHelloSwing.java
 *
 * Created on 06.03.2011, 15:16:51
 */

package de.tondorf.scubybot;

/**
 *
 * @author FoXPlus
 */
public class frmHelloSwing extends javax.swing.JFrame {

    
    /** Creates new form frmHelloSwing */
    public frmHelloSwing() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblServerIP = new javax.swing.JLabel();
        txtServerIP = new javax.swing.JTextField();
        btnToggleConnect = new javax.swing.JToggleButton();
        sclLog = new javax.swing.JScrollPane();
        txtArLogMessages = new javax.swing.JTextArea();
        btnClearLog = new javax.swing.JButton();
        lblPlayerName = new javax.swing.JLabel();
        txtPlayerName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connection Test");
        setLocationByPlatform(true);
        setName("frmHelloSwingMain"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblServerIP.setText("Server IP");
        lblServerIP.setName("lblServerIP"); // NOI18N

        txtServerIP.setName("txtServerIP"); // NOI18N

        btnToggleConnect.setLabel("Connect");
        btnToggleConnect.setName("btnToggleConnect"); // NOI18N
        btnToggleConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToggleConnectMouseClicked(evt);
            }
        });
        btnToggleConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleConnectActionPerformed(evt);
            }
        });

        txtArLogMessages.setColumns(20);
        txtArLogMessages.setRows(5);
        sclLog.setViewportView(txtArLogMessages);

        btnClearLog.setLabel("Clear");
        btnClearLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearLogMouseClicked(evt);
            }
        });

        lblPlayerName.setText("PlayerName");

        txtPlayerName.setName("txtServerIP"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sclLog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(btnClearLog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlayerName)
                            .addComponent(lblServerIP))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnToggleConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServerIP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlayerName)))
                    .addComponent(btnToggleConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sclLog, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("AccNameHelloSwingMain");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ScubyConnector MainConnection;

    private void btnToggleConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToggleConnectMouseClicked

        if ((btnToggleConnect.isSelected())) {
           // hier wird angemeldet
           txtArLogMessages.setText(txtArLogMessages.getText() + "\nVerbinde mit Server: " + txtServerIP.getText() );
           txtArLogMessages.setText(txtArLogMessages.getText() + "\nSpielername        : " + txtPlayerName.getText() );
           if (MainConnection == null) {
               MainConnection = new ScubyConnector(txtServerIP.getText(), txtPlayerName.getText());
           }
           else{
            //   MainConnection.
           }
        }else{
           // hier wird abgemeldet
           btnToggleConnect.setText("Connect");
        }

    }//GEN-LAST:event_btnToggleConnectMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        btnToggleConnect.setSelected(false);
    }//GEN-LAST:event_formWindowActivated

    private void btnToggleConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleConnectActionPerformed
        
    }//GEN-LAST:event_btnToggleConnectActionPerformed

    private void btnClearLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearLogMouseClicked
        txtArLogMessages.setText("");
    }//GEN-LAST:event_btnClearLogMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHelloSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearLog;
    private javax.swing.JToggleButton btnToggleConnect;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblServerIP;
    private javax.swing.JScrollPane sclLog;
    private javax.swing.JTextArea txtArLogMessages;
    private javax.swing.JTextField txtPlayerName;
    private javax.swing.JTextField txtServerIP;
    // End of variables declaration//GEN-END:variables

}
