
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Storage;



public class frmCadAlunoModal extends javax.swing.JDialog {

    private Aluno aluno;
   
    public frmCadAlunoModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        aluno = new Aluno();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        jtfNomeAluno = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        lblDisciplina = new javax.swing.JLabel();
        jtfAnoAluno = new javax.swing.JTextField();
        pnlCadAluno = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        ListaDisciplinas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaAluno = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNome.setText("Nome:");

        lblAno.setText("Ano:");

        lblDisciplina.setText("Displina:");

        pnlCadAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 34)); // NOI18N
        lblTitulo.setText("Cadastro Aluno");

        javax.swing.GroupLayout pnlCadAlunoLayout = new javax.swing.GroupLayout(pnlCadAluno);
        pnlCadAluno.setLayout(pnlCadAlunoLayout);
        pnlCadAlunoLayout.setHorizontalGroup(
            pnlCadAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadAlunoLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33))
        );
        pnlCadAlunoLayout.setVerticalGroup(
            pnlCadAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadAlunoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitulo)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarInfos(evt);
            }
        });

        ListaDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDisciplinas(evt);
            }
        });

        jtaAluno.setColumns(20);
        jtaAluno.setRows(5);
        jScrollPane1.setViewportView(jtaAluno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(pnlCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAno)
                            .addComponent(lblDisciplina)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfNomeAluno)
                                .addComponent(jtfAnoAluno)
                                .addComponent(ListaDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(jtfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(jtfAnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisciplina)
                            .addComponent(ListaDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar))
                    .addComponent(jScrollPane1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gravarInfos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarInfos
       
        if(jtfNomeAluno.getText().isEmpty()||jtfAnoAluno.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "Existem Campos vazios");
            
        }
        else{
        aluno.setNomeAluno(jtfNomeAluno.getText());
        aluno.setAno(jtfAnoAluno.getText());
        //aluno.setDisciplina(ListaDisciplinas.getSelectedItem();));
        JOptionPane.showMessageDialog(null,"DADOS GRAVADOS COM SUCESSO");
        
        jtaAluno.append(aluno.getNomeAluno() + "\n");
        }
    }//GEN-LAST:event_gravarInfos

    private void ListaDisciplinas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDisciplinas
        
    }//GEN-LAST:event_ListaDisciplinas

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            jtaAluno.setEditable(false);
             ArrayList array = Storage.getInstance().getDisciplinas();
            String str = null;  
            for(int i = 0; i <array.size(); i++ ){  
                str = (String) array.get(i).toString();  
                ListaDisciplinas.addItem(str);  
           }
           jtaAluno.append(aluno.getNomeAluno() + "\n");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmCadAlunoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadAlunoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadAlunoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadAlunoModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCadAlunoModal dialog = new frmCadAlunoModal(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> ListaDisciplinas;
    private javax.swing.JButton btnGravar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaAluno;
    private javax.swing.JTextField jtfAnoAluno;
    private javax.swing.JTextField jtfNomeAluno;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCadAluno;
    // End of variables declaration//GEN-END:variables
}
