
package visualizador;

import java.awt.Color;

public class MainPanel extends javax.swing.JFrame {

    public MainPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InnerPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadImage = new javax.swing.JMenuItem();
        Umbralizacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout InnerPanelLayout = new javax.swing.GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1161, Short.MAX_VALUE)
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );

        jMenu1.setText("Imagen");

        loadImage.setText("Histograma");
        loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageActionPerformed(evt);
            }
        });
        jMenu1.add(loadImage);

        Umbralizacion.setText("Umbralizacion de Outsu");
        Umbralizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmbralizacionActionPerformed(evt);
            }
        });
        jMenu1.add(Umbralizacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acciones");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InnerPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(InnerPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
        Histograma CI = new Histograma();
        try{
            ReiniciarPanel();
        }catch(Exception E){
            E.printStackTrace();
        }
        CI.setBounds(0, 0, InnerPanel.getWidth(), InnerPanel.getHeight());
        CI.setVisible(true);
        InnerPanel.add(CI);
    }//GEN-LAST:event_loadImageActionPerformed

    private void UmbralizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmbralizacionActionPerformed
        try{
            ReiniciarPanel();
        }catch(Exception E){
            E.printStackTrace();
        }
        Umbralizacion UL = new Umbralizacion();
        UL.setBounds(0, 0, InnerPanel.getWidth(), InnerPanel.getHeight());
        UL.setVisible(true);
        InnerPanel.add(UL);
    }//GEN-LAST:event_UmbralizacionActionPerformed

    
    //Funcion para reiniciar el panel y cargar otro panel dentro del innerpanel
    private void ReiniciarPanel(){
        InnerPanel.removeAll();
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane InnerPanel;
    private javax.swing.JMenuItem Umbralizacion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loadImage;
    // End of variables declaration//GEN-END:variables
}
