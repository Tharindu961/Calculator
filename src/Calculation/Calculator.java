/*
 * Author - Ruwan Bandara
 * Create Date - 08-04-2019
 * Modifiy Data- 08-04-2019
 */
package Calculation;


public class Calculator extends javax.swing.JFrame {
    
    double firstnum;
    double secondnum;
    double result;
    String operations;
    
   
    public Calculator() {
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

        txtDisplay = new javax.swing.JTextField();
        jBt1 = new javax.swing.JButton();
        jBt2 = new javax.swing.JButton();
        jBt3 = new javax.swing.JButton();
        jBt4 = new javax.swing.JButton();
        jBt5 = new javax.swing.JButton();
        jBt6 = new javax.swing.JButton();
        jBt7 = new javax.swing.JButton();
        jBt8 = new javax.swing.JButton();
        jBt12 = new javax.swing.JButton();
        jBt11 = new javax.swing.JButton();
        jBt9 = new javax.swing.JButton();
        jBt10 = new javax.swing.JButton();
        jBt14 = new javax.swing.JButton();
        jBt13 = new javax.swing.JButton();
        jBt15 = new javax.swing.JButton();
        jBt16 = new javax.swing.JButton();
        jBt17 = new javax.swing.JButton();
        jBt18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(java.awt.Color.darkGray);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jBt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt1.setText("1");
        jBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt1ActionPerformed(evt);
            }
        });

        jBt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt2.setText("2");
        jBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt2ActionPerformed(evt);
            }
        });

        jBt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt3.setText("3");
        jBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt3ActionPerformed(evt);
            }
        });

        jBt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt4.setText("4");
        jBt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt4ActionPerformed(evt);
            }
        });

        jBt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt5.setText("5");
        jBt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt5ActionPerformed(evt);
            }
        });

        jBt6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt6.setText("6");
        jBt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt6ActionPerformed(evt);
            }
        });

        jBt7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt7.setText("7");
        jBt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt7ActionPerformed(evt);
            }
        });

        jBt8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt8.setText("8");
        jBt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt8ActionPerformed(evt);
            }
        });

        jBt12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt12.setText("-");
        jBt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt12ActionPerformed(evt);
            }
        });

        jBt11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt11.setText("+");
        jBt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt11ActionPerformed(evt);
            }
        });

        jBt9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt9.setText("9");
        jBt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt9ActionPerformed(evt);
            }
        });

        jBt10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt10.setText("0");
        jBt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt10ActionPerformed(evt);
            }
        });

        jBt14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt14.setText("*");
        jBt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt14ActionPerformed(evt);
            }
        });

        jBt13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt13.setText("/");
        jBt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt13ActionPerformed(evt);
            }
        });

        jBt15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt15.setText("+/-");
        jBt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt15ActionPerformed(evt);
            }
        });

        jBt16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt16.setText(".");
        jBt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt16ActionPerformed(evt);
            }
        });

        jBt17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBt17.setText("C");
        jBt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt17ActionPerformed(evt);
            }
        });

        jBt18.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jBt18.setText("=");
        jBt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDisplay)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBt17, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBt5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBt9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBt13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBt16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBt3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBt7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBt5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBt11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBt9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBt15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBt13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBt16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBt17, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jBt18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt2ActionPerformed
        String Enternumber = txtDisplay.getText() + jBt2.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt2ActionPerformed

    private void jBt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt6ActionPerformed
         String Enternumber = txtDisplay.getText() + jBt6.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt6ActionPerformed

    private void jBt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt10ActionPerformed
         String Enternumber = txtDisplay.getText() + jBt10.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt10ActionPerformed

    private void jBt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt14ActionPerformed
          firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="*";
    }//GEN-LAST:event_jBt14ActionPerformed

    private void jBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt1ActionPerformed
       String Enternumber = txtDisplay.getText() + jBt1.getText();
       txtDisplay.setText(Enternumber);
       
       
    }//GEN-LAST:event_jBt1ActionPerformed

    private void jBt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt3ActionPerformed
        String Enternumber = txtDisplay.getText() + jBt3.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt3ActionPerformed

    private void jBt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt4ActionPerformed
        String Enternumber = txtDisplay.getText() + jBt4.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt4ActionPerformed

    private void jBt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt5ActionPerformed
         String Enternumber = txtDisplay.getText() + jBt5.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt5ActionPerformed

    private void jBt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt7ActionPerformed
         String Enternumber = txtDisplay.getText() + jBt7.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt7ActionPerformed

    private void jBt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt8ActionPerformed
         String Enternumber = txtDisplay.getText() + jBt8.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt8ActionPerformed

    private void jBt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt9ActionPerformed
         String Enternumber = txtDisplay.getText() + jBt9.getText();
       txtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBt9ActionPerformed

    private void jBt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt11ActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="+";
        
    }//GEN-LAST:event_jBt11ActionPerformed

    private void jBt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt12ActionPerformed
          firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="-";
    }//GEN-LAST:event_jBt12ActionPerformed

    private void jBt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt13ActionPerformed
          firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="/";
    }//GEN-LAST:event_jBt13ActionPerformed

    private void jBt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt15ActionPerformed
       
        Double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        ops = ops *(-1);
        txtDisplay.setText(String.valueOf(ops));
        
        
        
        
    }//GEN-LAST:event_jBt15ActionPerformed

    private void jBt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt18ActionPerformed
      
      String answer;
      secondnum = Double.parseDouble(txtDisplay.getText());
      if (operations == "+")
      {
          
          result = firstnum + secondnum;
          answer = String.format("%.0f",result);
          txtDisplay.setText(answer);
          
      }
      else if (operations == "-")
      {
          
          result = firstnum - secondnum;
          answer = String.format("%.0f",result);
          txtDisplay.setText(answer);
          
      }
      else if (operations == "*")
      {
          
          result = firstnum * secondnum;
          answer = String.format("%.0f",result);
          txtDisplay.setText(answer);
          
      }
      else if (operations =="/")
      {
          
          result = firstnum / secondnum;
          answer = String.format("%.0f",result);
          txtDisplay.setText(answer);
          
      }
      else if (operations == "%")
      {
          
          result = firstnum % secondnum;
          answer = String.format("%.0f",result);
          txtDisplay.setText(answer);
          
      }
      
    }//GEN-LAST:event_jBt18ActionPerformed

    private void jBt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt17ActionPerformed
        txtDisplay.setText("");
    }//GEN-LAST:event_jBt17ActionPerformed

    private void jBt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBt16ActionPerformed

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
    private javax.swing.JButton jBt1;
    private javax.swing.JButton jBt10;
    private javax.swing.JButton jBt11;
    private javax.swing.JButton jBt12;
    private javax.swing.JButton jBt13;
    private javax.swing.JButton jBt14;
    private javax.swing.JButton jBt15;
    private javax.swing.JButton jBt16;
    private javax.swing.JButton jBt17;
    private javax.swing.JButton jBt18;
    private javax.swing.JButton jBt2;
    private javax.swing.JButton jBt3;
    private javax.swing.JButton jBt4;
    private javax.swing.JButton jBt5;
    private javax.swing.JButton jBt6;
    private javax.swing.JButton jBt7;
    private javax.swing.JButton jBt8;
    private javax.swing.JButton jBt9;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
