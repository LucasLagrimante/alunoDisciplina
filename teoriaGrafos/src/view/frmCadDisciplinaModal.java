
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Disciplina;


public class frmCadDisciplinaModal extends javax.swing.JDialog {

    private Disciplina disciplina;
    
    List disciplinas = new ArrayList<Disciplina>();
    
    public List getDisciplinas(){
        
        return disciplinas;
    }

    
    public frmCadDisciplinaModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        disciplina = new Disciplina();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadDisciplina = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        jtfAno = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JLabel();
        jtfPeriodo = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadDisciplina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 34)); // NOI18N
        lblTitulo.setText("Cadastro Disciplina");

        javax.swing.GroupLayout pnlCadDisciplinaLayout = new javax.swing.GroupLayout(pnlCadDisciplina);
        pnlCadDisciplina.setLayout(pnlCadDisciplinaLayout);
        pnlCadDisciplinaLayout.setHorizontalGroup(
            pnlCadDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadDisciplinaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33))
        );
        pnlCadDisciplinaLayout.setVerticalGroup(
            pnlCadDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadDisciplinaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitulo)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        lblNome.setText("Nome:");

        lblAno.setText("Ano:");

        lblPeriodo.setText("Período:");

        jtfPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPeriodoActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarInfos(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pnlCadDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAno)
                            .addComponent(lblPeriodo)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfNome)
                                .addComponent(jtfPeriodo)
                                .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnlCadDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeriodo)
                    .addComponent(jtfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGravar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPeriodoActionPerformed

    private void gravarInfos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarInfos
       
        if(jtfNome.getText().isEmpty()||jtfAno.getText().isEmpty()||jtfPeriodo.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "Existem Campos vazios");
            
        }
        else{
        disciplina.setNomeDisciplina(jtfNome.getText());
        disciplina.setAnoDisciplina(jtfAno.getText());
        disciplina.setPeriodoDisciplina(jtfPeriodo.getText());
        JOptionPane.showMessageDialog(null,"DADOS GRAVADOS COM SUCESSO");
        disciplinas.add(disciplina);
        dispose();
        }
    }//GEN-LAST:event_gravarInfos

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
            java.util.logging.Logger.getLogger(frmCadDisciplinaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadDisciplinaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadDisciplinaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadDisciplinaModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCadDisciplinaModal dialog = new frmCadDisciplinaModal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JTextField jtfAno;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPeriodo;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCadDisciplina;
    // End of variables declaration//GEN-END:variables
}
