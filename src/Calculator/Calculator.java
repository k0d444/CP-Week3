
package Calculator;


public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tassessmentTF = new javax.swing.JTextField();
        milestone1TF = new javax.swing.JTextField();
        milestone2TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        totalTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gradeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GRADE CALCULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        tassessmentTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tassessmentTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, -1));

        milestone1TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(milestone1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, -1));

        milestone2TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(milestone2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        jLabel2.setText("Terminal Assessment");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel3.setText("Milestone 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel4.setText("Milestone 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        totalTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(totalTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 140, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Grade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        gradeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(gradeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        //Calculate all the grade
        
        String milestone1Score, milestone2Score, tassessmentScore;
        double total;
        
        milestone1Score = milestone1TF.getText();
        milestone2Score = milestone2TF.getText();
        tassessmentScore = tassessmentTF.getText();
        
        double milestone1 = Double.parseDouble(milestone1Score);
        double milestone2 = Double.parseDouble(milestone2Score);
        double tassessment = Double.parseDouble(tassessmentScore);
        
        total = (milestone1 + milestone2 + tassessment);
        totalTF.setText(Double.toString(total));
        
         if (total >=90){
            gradeTF.setText("A");
        }else if (total >= 80 && total < 90){
            gradeTF.setText("B");
        }else if (total >= 70 && total < 80){
            gradeTF.setText("C");
        }else if (total >= 60 && total < 70){
            gradeTF.setText("D");
        }else{
            gradeTF.setText("F");
        }

    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JTextField gradeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField milestone1TF;
    private javax.swing.JTextField milestone2TF;
    private javax.swing.JTextField tassessmentTF;
    private javax.swing.JTextField totalTF;
    // End of variables declaration//GEN-END:variables
}
