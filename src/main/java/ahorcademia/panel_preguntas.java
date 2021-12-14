package ahorcademia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Oscar Areavalo
 */
public class panel_preguntas extends javax.swing.JFrame {

        public panel_preguntas() {
        initComponents();
        
        int id = master_preg_resp.index_pregunta(master_preg_resp.lista_preguntas());
        Lb_pregunta.setText(master_preg_resp.pregunta_texto(master_preg_resp.lista_preguntas(),id));
        
        List myArrayrepuestas = master_preg_resp.random_respuestas(id);
        
        jButton1.setText((String) myArrayrepuestas.get(0));
        jButton2.setText((String) myArrayrepuestas.get(1));
        jButton3.setText((String) myArrayrepuestas.get(2));
        jButton4.setText((String) myArrayrepuestas.get(3));
        
       lb_puntaje.setText("0");
       
       lb_dibujo1.setVisible(false);
       lb_dibujo2.setVisible(false);
       lb_dibujo3.setVisible(false);
       lb_mensaje.setVisible(false);
                       lb_mensaje1.setVisible(false);
                       lb_puntaje_fin.setVisible(false);
       bt_volver.setVisible(false);
       
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_volver = new javax.swing.JButton();
        lb_puntaje_fin = new javax.swing.JLabel();
        lb_mensaje1 = new javax.swing.JLabel();
        lb_mensaje = new javax.swing.JLabel();
        lb_dibujo3 = new javax.swing.JLabel();
        lb_dibujo2 = new javax.swing.JLabel();
        lb_dibujo1 = new javax.swing.JLabel();
        Lb_pregunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lb_puntaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(690, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_volver.setText("Volver A Jugar");
        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });
        getContentPane().add(bt_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 190, 50));

        lb_puntaje_fin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_puntaje_fin.setForeground(new java.awt.Color(255, 255, 255));
        lb_puntaje_fin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puntaje_fin.setText("30");
        getContentPane().add(lb_puntaje_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 70, 30));

        lb_mensaje1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_mensaje1.setForeground(new java.awt.Color(255, 255, 255));
        lb_mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje1.setText("Puntaje Obtenido:");
        getContentPane().add(lb_mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 200, 70));

        lb_mensaje.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lb_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        lb_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_mensaje.setText("Fin del Juego ");
        getContentPane().add(lb_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 460, 70));

        lb_dibujo3.setIcon(new javax.swing.ImageIcon("..\\ahorcademia_source\\src\\main\\java\\ahorcademia\\Imagenes\\foto3_este.png"));
        getContentPane().add(lb_dibujo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lb_dibujo2.setIcon(new javax.swing.ImageIcon("..\\ahorcademia_source\\src\\main\\java\\ahorcademia\\Imagenes\\foto2_este.png"));
        getContentPane().add(lb_dibujo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lb_dibujo1.setIcon(new javax.swing.ImageIcon("..\\ahorcademia_source\\src\\main\\java\\ahorcademia\\Imagenes\\foto1_este.png"));
        getContentPane().add(lb_dibujo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 310));

        Lb_pregunta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Lb_pregunta.setForeground(new java.awt.Color(255, 255, 255));
        Lb_pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_pregunta.setText("jLabel1");
        getContentPane().add(Lb_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 760, 70));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 300, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 300, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 300, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 300, -1));

        lb_puntaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_puntaje.setForeground(new java.awt.Color(255, 255, 255));
        lb_puntaje.setText("jLabel2");
        getContentPane().add(lb_puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 46, -1));
        lb_puntaje.getAccessibleContext().setAccessibleName("lb_puntaje");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Puntaje:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("..\\ahorcademia_source\\src\\main\\java\\ahorcademia\\Imagenes\\fondo_1.jpg"));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int puntaje=0;
               
        if  ((master_preg_resp.respuestas(jButton1.getText()).equals("Respuesta Correcta"))){
            
         JOptionPane.showMessageDialog(null, master_preg_resp.respuestas(jButton1.getText()));
         puntaje = Integer.parseInt(lb_puntaje.getText()) + 10;
         lb_puntaje.setText(String.valueOf(puntaje)); 
         }
        
         else
         {
                 
             JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
             
              if  (!(lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
             {
                 lb_dibujo1.setVisible(true);   
             }
              else
              {
                  
                    if  ((lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                   {
                       lb_dibujo2.setVisible(true);                 
                   }
                    
                   else
                    {
                        
                    if  ((lb_dibujo1.isVisible()) && (lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                     {
                       lb_dibujo3.setVisible(true);                 
                       Lb_pregunta.setVisible(false);
                       jButton1.setVisible(false);
                       jButton2.setVisible(false);
                       jButton3.setVisible(false);
                       jButton4.setVisible(false);
                       lb_puntaje.setVisible(false);
                       jLabel1.setVisible(false);
                       lb_mensaje.setVisible(true);
                       lb_mensaje1.setVisible(true);
                       lb_puntaje_fin.setVisible(true);
                       lb_puntaje_fin.setText(lb_puntaje.getText());
                        bt_volver.setVisible(true);
                       
                     }
                      
                        
                        
                    }
                    
              }
              
            
              
         } 
        
        int id = master_preg_resp.index_pregunta(master_preg_resp.lista_preguntas());
        Lb_pregunta.setText(master_preg_resp.pregunta_texto(master_preg_resp.lista_preguntas(),id));
        
        List myArrayrepuestas = master_preg_resp.random_respuestas(id);
        
        jButton1.setText((String) myArrayrepuestas.get(0));
        jButton2.setText((String) myArrayrepuestas.get(1));
        jButton3.setText((String) myArrayrepuestas.get(2));
        jButton4.setText((String) myArrayrepuestas.get(3));
        
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           int puntaje=0;
               
        if  ((master_preg_resp.respuestas(jButton2.getText()).equals("Respuesta Correcta"))){
            
         JOptionPane.showMessageDialog(null, master_preg_resp.respuestas(jButton2.getText()));
         puntaje = Integer.parseInt(lb_puntaje.getText()) + 10;
         lb_puntaje.setText(String.valueOf(puntaje));        

        } 
                 else
         {
                 
             JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
             
              if  (!(lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
             {
                 lb_dibujo1.setVisible(true);   
             }
              else
              {
                  
                    if  ((lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                   {
                       lb_dibujo2.setVisible(true);                 
                   }
                    
                   else
                    {
                        
                    if  ((lb_dibujo1.isVisible()) && (lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                     {
                       lb_dibujo3.setVisible(true);                 
                       Lb_pregunta.setVisible(false);
                       jButton1.setVisible(false);
                       jButton2.setVisible(false);
                       jButton3.setVisible(false);
                       jButton4.setVisible(false);
                       lb_puntaje.setVisible(false);
                       jLabel1.setVisible(false);
                       lb_mensaje.setVisible(true);
                       lb_mensaje1.setVisible(true);
                       lb_puntaje_fin.setVisible(true);
                       lb_puntaje_fin.setText(lb_puntaje.getText());
                        bt_volver.setVisible(true);
                       
                     }
                      
                        
                        
                    }
                    
              }
             
      
                 
                 
         } 
        
        int id = master_preg_resp.index_pregunta(master_preg_resp.lista_preguntas());
        Lb_pregunta.setText(master_preg_resp.pregunta_texto(master_preg_resp.lista_preguntas(),id));
        
        List myArrayrepuestas = master_preg_resp.random_respuestas(id);
        
        jButton1.setText((String) myArrayrepuestas.get(0));
        jButton2.setText((String) myArrayrepuestas.get(1));
        jButton3.setText((String) myArrayrepuestas.get(2));
        jButton4.setText((String) myArrayrepuestas.get(3));
        
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       int puntaje=0;
               
        if  ((master_preg_resp.respuestas(jButton3.getText()).equals("Respuesta Correcta"))){
            
         JOptionPane.showMessageDialog(null, master_preg_resp.respuestas(jButton3.getText()));
         puntaje = Integer.parseInt(lb_puntaje.getText()) + 10;
         lb_puntaje.setText(String.valueOf(puntaje));        

        } 
                 else
         {
                 
            JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
             
              if  (!(lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
             {
                 lb_dibujo1.setVisible(true);   
             }
              else
              {
                  
                    if  ((lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                   {
                       lb_dibujo2.setVisible(true);                 
                   }
                    
                   else
                    {
                        
                    if  ((lb_dibujo1.isVisible()) && (lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                     {
                       lb_dibujo3.setVisible(true);                 
                       Lb_pregunta.setVisible(false);
                       jButton1.setVisible(false);
                       jButton2.setVisible(false);
                       jButton3.setVisible(false);
                       jButton4.setVisible(false);
                       lb_puntaje.setVisible(false);
                       jLabel1.setVisible(false);
                       lb_mensaje.setVisible(true);
                       lb_mensaje1.setVisible(true);
                       lb_puntaje_fin.setVisible(true);
                       lb_puntaje_fin.setText(lb_puntaje.getText());
                        bt_volver.setVisible(true);
                       
                     }
                      
                        
                        
                    }
                    
              }
         } 
        
        int id = master_preg_resp.index_pregunta(master_preg_resp.lista_preguntas());
        Lb_pregunta.setText(master_preg_resp.pregunta_texto(master_preg_resp.lista_preguntas(),id));
        
        List myArrayrepuestas = master_preg_resp.random_respuestas(id);
        
        jButton1.setText((String) myArrayrepuestas.get(0));
        jButton2.setText((String) myArrayrepuestas.get(1));
        jButton3.setText((String) myArrayrepuestas.get(2));
        jButton4.setText((String) myArrayrepuestas.get(3));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int puntaje=0;
               
        if  ((master_preg_resp.respuestas(jButton4.getText()).equals("Respuesta Correcta"))){
            
         JOptionPane.showMessageDialog(null, master_preg_resp.respuestas(jButton4.getText()));
         puntaje = Integer.parseInt(lb_puntaje.getText()) + 10;
         lb_puntaje.setText(String.valueOf(puntaje));        

        } 
                 else
         {
                 
             JOptionPane.showMessageDialog(null, "Respuesta Incorrecta");
             
              if  (!(lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
             {
                 lb_dibujo1.setVisible(true);   
             }
              else
              {
                  
                    if  ((lb_dibujo1.isVisible()) && !(lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                   {
                       lb_dibujo2.setVisible(true);                 
                   }
                    
                   else
                    {
                        
                    if  ((lb_dibujo1.isVisible()) && (lb_dibujo2.isVisible()) && !(lb_dibujo3.isVisible()) )
                     {
                       lb_dibujo3.setVisible(true);                 
                       Lb_pregunta.setVisible(false);
                       jButton1.setVisible(false);
                       jButton2.setVisible(false);
                       jButton3.setVisible(false);
                       jButton4.setVisible(false);
                       lb_puntaje.setVisible(false);
                       jLabel1.setVisible(false);
                       lb_mensaje.setVisible(true);
                       lb_mensaje1.setVisible(true);
                       lb_puntaje_fin.setVisible(true);
                       lb_puntaje_fin.setText(lb_puntaje.getText());
                        bt_volver.setVisible(true);
                       
                     }
                      
                        
                        
                    }
                    
              }
         } 
        
        int id = master_preg_resp.index_pregunta(master_preg_resp.lista_preguntas());
        Lb_pregunta.setText(master_preg_resp.pregunta_texto(master_preg_resp.lista_preguntas(),id));
        
        List myArrayrepuestas = master_preg_resp.random_respuestas(id);
        
        jButton1.setText((String) myArrayrepuestas.get(0));
        jButton2.setText((String) myArrayrepuestas.get(1));
        jButton3.setText((String) myArrayrepuestas.get(2));
        jButton4.setText((String) myArrayrepuestas.get(3));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        // TODO add your handling code here:
        
        
         int id = master_preg_resp.index_pregunta(master_preg_resp.lista_preguntas());
        Lb_pregunta.setText(master_preg_resp.pregunta_texto(master_preg_resp.lista_preguntas(),id));
        
        List myArrayrepuestas = master_preg_resp.random_respuestas(id);
        
        jButton1.setText((String) myArrayrepuestas.get(0));
        jButton2.setText((String) myArrayrepuestas.get(1));
        jButton3.setText((String) myArrayrepuestas.get(2));
        jButton4.setText((String) myArrayrepuestas.get(3));
        
       lb_puntaje.setText("0");
       
       lb_dibujo1.setVisible(false);
       lb_dibujo2.setVisible(false);
       lb_dibujo3.setVisible(false);
       lb_mensaje.setVisible(false);
       lb_mensaje1.setVisible(false);
       lb_puntaje_fin.setVisible(false);
       bt_volver.setVisible(false);
       
       Lb_pregunta.setVisible(true);
                       jButton1.setVisible(true);
                       jButton2.setVisible(true);
                       jButton3.setVisible(true);
                       jButton4.setVisible(true);
                       lb_puntaje.setVisible(true);
                       jLabel1.setVisible(true);
        
    }//GEN-LAST:event_bt_volverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panel_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_preguntas().setVisible(true);
            }
        });

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_pregunta;
    private javax.swing.JButton bt_volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_dibujo1;
    private javax.swing.JLabel lb_dibujo2;
    private javax.swing.JLabel lb_dibujo3;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_mensaje1;
    private javax.swing.JLabel lb_puntaje;
    private javax.swing.JLabel lb_puntaje_fin;
    // End of variables declaration//GEN-END:variables


}
