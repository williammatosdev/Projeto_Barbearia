/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author wil.william
 */
public class Agenda extends javax.swing.JFrame {

    
    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabAgenda = new javax.swing.JTable();
        btnAgendar = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblvalor = new javax.swing.JLabel();
        cbxServico = new javax.swing.JComboBox<>();
        lblServico = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cboCliente = new javax.swing.JComboBox<>();
        lblPlanoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTabAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblTabAgenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTabAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Cliente", "Serviço", "Valor", "Data", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tblTabAgenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 950, 350));

        btnAgendar.setBackground(new java.awt.Color(102, 255, 102));
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 440, 50));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, 30));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 120, 30));

        lblData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, 30));

        lblvalor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblvalor.setForeground(new java.awt.Color(255, 255, 255));
        lblvalor.setText("Valor");
        getContentPane().add(lblvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        cbxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 310, 30));

        lblServico.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblServico.setForeground(new java.awt.Color(255, 255, 255));
        lblServico.setText("Serviço");
        getContentPane().add(lblServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("id");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        txtId.setText("0");
        txtId.setEnabled(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(cboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 310, 30));

        lblPlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(lblPlanoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_cbxServicoItemStateChanged

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_btnAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cbxServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPlanoDeFundo;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JTable tblTabAgenda;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();       
        this.controller.atualizaServico();
        
        // this.controller.atualizaValor();
    }

    public JTable getTblTabAgenda() {
        return tblTabAgenda;
    }

    public void setTblTabAgenda(JTable tblTabAgenda) {
        this.tblTabAgenda = tblTabAgenda;
    }

    public JComboBox<String> getCboCliente() {
        return cboCliente;
    }

    public void setCboCliente(JComboBox<String> cboCliente) {
        this.cboCliente = cboCliente;
    } 

    public JComboBox<String> getCbxServico() {
        return cbxServico;
    }

    public void setCbxServico(JComboBox<String> cbxServico) {
        this.cbxServico = cbxServico;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextField getTxtHora() {
        return txtHora;
    }

    public void setTxtHora(JTextField txtHora) {
        this.txtHora = txtHora;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

 
    
    
}