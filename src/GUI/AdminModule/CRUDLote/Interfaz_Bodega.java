package GUI.AdminModule.CRUDLote;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Domain.Bodega;
import Domain.Archivos;
import Bodegas.GraficoAdyacencia;
import Bodegas.GraphException;
/**
 *
 * @author Diego
 */
public class Interfaz_Bodega extends javax.swing.JFrame {

    //filtro de extensión de imagen
    private final FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Image File", "jpg","png");
    //File chooser
    private JFileChooser chooser = new JFileChooser();
    //Atributos a leer
    String nombre, latitud, longitud,distancia,url;
    
    public Interfaz_Bodega() {
        initComponents();
        tfl_url.setEditable(false);
    }

    //Método que se encarga de mostrar el Filechooser
    public JFileChooser showChooser() {
        chooser.setFileFilter(fileFilter);//Se usa el filtro
        int returnName = chooser.showOpenDialog(this);
        if (returnName == JFileChooser.APPROVE_OPTION){
            //Primera variable file para obtener el directorio
            File file = chooser.getCurrentDirectory();
            //Segunda variable file para obtener el nombre del archivo seleccionado
            File nombreF = chooser.getSelectedFile();
            if (file != null) { //Nos aseguramos de que sí escogió algún archivo
                url = file.getAbsolutePath(); //Guardamos la ruta
                char ch = (char )92; //El char '\' que no se puede utilizar en un String porque es reservado
                url+= ch+nombreF.getName(); //Guardamos el nombre
            }
        }
        //Llenamos el textfield con la ruta
        tfl_url.setText(url);
        return chooser;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfl_nombre = new javax.swing.JTextField();
        tfl_latitud = new javax.swing.JTextField();
        tfl_longitud = new javax.swing.JTextField();
        tfl_distancia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_choose = new javax.swing.JButton();
        tfl_url = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 48)); // NOI18N
        jLabel1.setText("Bodegas");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 30)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 30)); // NOI18N
        jLabel3.setText("Distancia:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 30)); // NOI18N
        jLabel4.setText("Latitud:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 30)); // NOI18N
        jLabel5.setText("Longitud:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eqcnv4id0i2lf9tfjpbj6vq0n2_2017110804465115a035f2bbe0b8.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 30)); // NOI18N
        jLabel7.setText("URL Fotografía:");

        btn_choose.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        btn_choose.setText("Seleccionar...");
        btn_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        btn_save.setText("Guardar Bodega");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfl_url, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfl_latitud, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(161, 161, 161)
                            .addComponent(tfl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfl_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(btn_choose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(tfl_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfl_latitud, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfl_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfl_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_choose)
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save)
                    .addComponent(tfl_url, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseActionPerformed
        showChooser();
//        JOptionPane.showMessageDialog(null, url);
    }//GEN-LAST:event_btn_chooseActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        Bodega nuevaBodega = null;        
        //Nos aseguramos que todos los textfields se llenaron
        if(tfl_nombre.getText().isEmpty() || tfl_latitud.getText().isEmpty() || tfl_longitud.getText().isEmpty()
                || tfl_distancia.getText().isEmpty() || tfl_url.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos de texto deben estar llenos","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
            nuevaBodega = new Bodega(tfl_nombre.getText(), tfl_latitud.getText(),tfl_longitud.getText(), 
                    Integer.parseInt(tfl_distancia.getText()), tfl_url.getText());
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "La distancia debe ser un valor numérico",
                        "Error",JOptionPane.ERROR);
                tfl_distancia.setText("");
            }
        }
        try {
            Archivos archivo = new Archivos("./Bodegas.dat");
//            archivo.crear();
            //grafo extraído del archivo
            GraficoAdyacencia extraído = (GraficoAdyacencia) archivo.cargar();
            //si el grafo viene null, es porque no hay nada en el archivo
//            if(extraído==null){
                //Nuevo grafo
//                GraficoAdyacencia graf = new GraficoAdyacencia(50);
                //Inserto el vértice
//                graf.insertVertex(nuevaBodega);
//                //Inserto la arista dirigida hacia el mismo vértice
//                graf.insertEdge(nuevaBodega, nuevaBodega);
//                //Inserto el peso de la arista
//                graf.insertHeight(nuevaBodega, nuevaBodega, Integer.parseInt(tfl_distancia.getText()));
//                //guardo el grafo en el archivo
//                archivo.escribir(graf);
//            }else{//si entra al else, es porque el archivo ya trae un grafo
                //me aseguro de que no existe la bodega ya en este grafo
//                if(!extraído.existVertex(nuevaBodega)){
                extraído.insertVertex(nuevaBodega);
                extraído.insertEdge(nuevaBodega, nuevaBodega);
                extraído.insertHeight(nuevaBodega, nuevaBodega, Integer.parseInt(tfl_distancia.getText()));
                //sobreescribimos el grafo
                archivo.escribir(extraído);
//                }else{
//                    JOptionPane.showMessageDialog(null, "La bodega ya existe");
//                }
//            }
        } catch (GraphException ex) {
            Logger.getLogger(Interfaz_Bodega.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfl_nombre.setText("");
        tfl_latitud.setText("");
        tfl_longitud.setText("");
        tfl_url.setText("");
        tfl_distancia.setText("");
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Bodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_choose;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfl_distancia;
    private javax.swing.JTextField tfl_latitud;
    private javax.swing.JTextField tfl_longitud;
    private javax.swing.JTextField tfl_nombre;
    private javax.swing.JTextField tfl_url;
    // End of variables declaration//GEN-END:variables
}
