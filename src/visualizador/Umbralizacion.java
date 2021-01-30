
package visualizador;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;


public class Umbralizacion extends javax.swing.JPanel {
    double[] FREQUENCY = new double[256];
    double[] NORMALIZED_VALUES = new double[256];
    BufferedImage GlobalImage;
    int SliderState = 0;

    public Umbralizacion() {
        initComponents();
        TitledBorder Imagen = BorderFactory.createTitledBorder("Imagen");
        Imagen.setTitleJustification(TitledBorder.CENTER);
        LienzoContainer.setBorder(Imagen);
        
        TitledBorder HistogramaBorder = BorderFactory.createTitledBorder("Histograma");
        Histograma.setBorder(HistogramaBorder);
        
       
        
        Slider.setMaximum(255);
        Slider.setMinimum(0);
        Slider.setMinorTickSpacing(5);
        Slider.setMajorTickSpacing(25);
        Slider.setPaintTicks(true);
        Slider.setPaintLabels(true);
        Slider.setValue(100);
        
        Slider.setEnabled(true);
        Umbralizar.setEnabled(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loadImage = new javax.swing.JButton();
        LienzoContainer = new javax.swing.JPanel();
        Lienzo = new javax.swing.JLabel();
        Histograma = new javax.swing.JPanel();
        HistogramaLienzo = new javax.swing.JLabel();
        PanelUmbralizacion = new javax.swing.JPanel();
        Slider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        RGBTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FrequencyTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Omega_Clase_1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Omega_Clase_2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Media_Clase_1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Media_Clase_2 = new javax.swing.JTextField();
        Umbralizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Umbral = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CrestaInferior = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CrestaSuperior = new javax.swing.JTextField();
        Binarizacion = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        PosicionTextField = new javax.swing.JTextField();

        jLabel1.setText("Umbralizacion de Outsu");

        loadImage.setText("Cargar Imagen");
        loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LienzoContainerLayout = new javax.swing.GroupLayout(LienzoContainer);
        LienzoContainer.setLayout(LienzoContainerLayout);
        LienzoContainerLayout.setHorizontalGroup(
            LienzoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LienzoContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        LienzoContainerLayout.setVerticalGroup(
            LienzoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LienzoContainerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });

        jLabel2.setText("Valor: ");

        RGBTextField.setText("Value");

        jLabel3.setText("Frecuencia:");

        FrequencyTextField.setText("Frecuencia");

        jLabel4.setText("Umbralizacion por OTSU");

        jLabel5.setText("ω ( t )");

        Omega_Clase_1.setText("Omega");

        jLabel6.setText("ω ( t )");

        Omega_Clase_2.setText("Omega");

        jLabel7.setText("Clase 1");

        jLabel8.setText("Clase 2");

        jLabel9.setText("μ 1");

        Media_Clase_1.setText("Clase 1");

        jLabel10.setText("μ 2");

        Media_Clase_2.setText("Clase 2");

        Umbralizar.setText("Binarizar");
        Umbralizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmbralizarActionPerformed(evt);
            }
        });

        jLabel11.setText("Umbral");

        jLabel13.setText("Umbralizacion Manual");

        jLabel12.setText("Cresta Inferior");

        CrestaInferior.setText("0");

        jLabel14.setText("Crestas Superior");

        CrestaSuperior.setText("255");

        Binarizacion.setText("Binarizar");
        Binarizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinarizacionActionPerformed(evt);
            }
        });

        jLabel15.setText("Posicion");

        PosicionTextField.setText("0");

        javax.swing.GroupLayout PanelUmbralizacionLayout = new javax.swing.GroupLayout(PanelUmbralizacion);
        PanelUmbralizacion.setLayout(PanelUmbralizacionLayout);
        PanelUmbralizacionLayout.setHorizontalGroup(
            PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RGBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FrequencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Binarizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUmbralizacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUmbralizacionLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUmbralizacionLayout.createSequentialGroup()
                        .addComponent(Umbralizar)
                        .addGap(211, 211, 211))))
            .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUmbralizacionLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CrestaInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CrestaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(93, 93, 93))
                            .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                                        .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Omega_Clase_1)
                                            .addComponent(Media_Clase_1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Media_Clase_2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PosicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUmbralizacionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Omega_Clase_2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Umbral, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelUmbralizacionLayout.setVerticalGroup(
            PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUmbralizacionLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RGBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(FrequencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Binarizacion))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CrestaInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(CrestaSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Omega_Clase_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Omega_Clase_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Media_Clase_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Media_Clase_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUmbralizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Umbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(PosicionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Umbralizar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HistogramaLayout = new javax.swing.GroupLayout(Histograma);
        Histograma.setLayout(HistogramaLayout);
        HistogramaLayout.setHorizontalGroup(
            HistogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HistogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistogramaLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelUmbralizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        HistogramaLayout.setVerticalGroup(
            HistogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HistogramaLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelUmbralizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LienzoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(loadImage)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Histograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LienzoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadImage))
                    .addComponent(Histograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            BufferedImage img = ImageIO.read(file);
            GlobalImage = CopyImage(img);
            //Primero verifiquemso que la imagen este en escala de grises, de los contrario la convertimos 
            if(isGrayScale(img)){
                JOptionPane.showMessageDialog(null, "Espera mientras se procesa la imagen");
                double no_pixels = img.getWidth() * img.getHeight();
                setImagenIcon(img);
                ArrayList<Integer> RawData = LoadRawData(img);
                double [] valores_y = Normalizacion(RawData, no_pixels);
                double maxValue = MaxValueFind(valores_y);
                GenerateGraph(valores_y, maxValue);
            }else{
                //Convertimos la imagen a escala de grises en caso de ser a color
                double no_pixels = img.getWidth() * img.getHeight();
                BufferedImage newImg = ConvertImgToGrayScale(img);
                setImagenIcon(newImg);
                ArrayList<Integer> RawData = LoadRawData(newImg);
                double [] valores_y = Normalizacion(RawData, no_pixels);
                double maxValue = MaxValueFind(valores_y);
                GenerateGraph(valores_y, maxValue);
            }
            //Guardamos una copia en el buffers
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_loadImageActionPerformed

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
        RGBTextField.setText("" + Slider.getValue() );
        FrequencyTextField.setText("" + FindFrequency(Slider.getValue()));
        SliderState = Slider.getValue();
    }//GEN-LAST:event_SliderStateChanged

    private void BinarizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinarizacionActionPerformed
        SetIconClean();
        BufferedImage Imgen_Copia = CopyImage(GlobalImage);
        BufferedImage Imagen_Binarizada = Binarizacion(Imgen_Copia);
        setImagenIcon(Imagen_Binarizada);
    }//GEN-LAST:event_BinarizacionActionPerformed

    private void UmbralizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmbralizarActionPerformed
        
        OTSU_Type punto_corte = EncontrarPosiblesPuntos();
        BufferedImage Imagen_Copia = CopyImage(GlobalImage);
        BufferedImage Imagen_Binarizada = Binarizacion(Imagen_Copia, punto_corte.Posicion);
        setImagenIcon(Imagen_Binarizada);
        
        //Setteamos los campos con la informacion recibida
        Omega_Clase_1.setText("" +  punto_corte.OmegaClase_1);
        Omega_Clase_2.setText("" +  punto_corte.OmegaClase_2);
        Media_Clase_1.setText("" + punto_corte.Media_1);
        Media_Clase_2.setText("" + punto_corte.Media_2);
        Umbral.setText("" + punto_corte.Umbral_T);
        PosicionTextField.setText("" + punto_corte.Posicion);    
        CrestaInferior.setText("" + punto_corte.CrestaInferior);
        CrestaSuperior.setText("" + punto_corte.CrestaSuperior);
    }//GEN-LAST:event_UmbralizarActionPerformed

    //Comprobar si una imagen esta en blanco y negro
    protected boolean isGrayScale(BufferedImage img){
        for(int i = 0; i < img.getWidth(); i++){
            for(int j = 0; j < img.getHeight(); j++){
                int pixel = img.getRGB(i, j);
                Color color = new Color(pixel, true);
                if( color.getRed() != color.getGreen() && color.getGreen() != color.getBlue()){
                    return false;
                }
                
            }
        }
        
        return true;
    }
    
    //Setterar imagen en el lienzo 
    protected void setImagenIcon(BufferedImage img){
        SetIconClean();
        Image ScaledImage = img.getScaledInstance(Lienzo.getWidth(), Lienzo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon li = new ImageIcon(ScaledImage);
        Lienzo.setIcon(li);
    }
    
    //Limpiar el label de la imagen 
    protected void SetIconClean(){
        Lienzo.setIcon(null);
        Lienzo.revalidate();

    }
    
    //Convetir una imagen a color en escala de grises
    protected BufferedImage ConvertImgToGrayScale(BufferedImage img){
        JOptionPane.showMessageDialog(null, "La imagen seleccionada se encuentra a color, espera mientras se convierte a escala de grises");
        int red, green, blue, pixel, average;
        Color color;
        for(int i = 0; i < img.getWidth(); i++){
            for(int j = 0; j < img.getHeight(); j++){
                pixel = img.getRGB(i, j);
                color = new Color(pixel, true);
                red = color.getRed();
                green = color.getGreen();
                blue = color.getBlue();
                average = (red + green + blue) / 3;
                red = average;
                green = average;
                blue = average;
                color = new Color(red, green, blue);
                img.setRGB(i, j, color.getRGB());
            }
        }
        return img;
    }

    //Protected Copiar Imagen
    protected BufferedImage CopyImage(BufferedImage original){
        BufferedImage clone = new BufferedImage(original.getWidth(), original.getHeight(), original.getType());
        Graphics2D g2d = clone.createGraphics();
        g2d.drawImage(original, 0, 0, null);
        g2d.dispose();
        return clone;
    }
    
    
    //cargamos la info de los pixeles
    protected ArrayList<Integer> LoadRawData(BufferedImage img){
        ArrayList<Integer> RawData = new ArrayList<>();
        int pixel;
        Color color;
        for(int i = 0; i < img.getWidth(); i++){
            for(int j = 0; j < img.getHeight(); j++){
                pixel = img.getRGB(i, j);
                color = new Color(pixel, true);
                RawData.add(color.getRed());
            }
        }
        return RawData;
    }
    
    //Encontrar el valor mayor de la grafica
    protected double MaxValueFind(double[] array){
        double value = array[0];
        for(int i = 0; i < array.length; i++){
            if(value < array[i]){
                value = array[i];
            }
        }
        return value;
    }
    
    //realizamos la normalizacion de los valores
    protected double[] Normalizacion(ArrayList<Integer> RawData, double no_pixels){
        double[] data = new double[256];
        double valor;
        for(int i = 0; i < 256; i++){
            valor = Collections.frequency(RawData, i);
            FREQUENCY[i] = valor;
            double temp = valor / no_pixels;
            data[i] = temp;
            NORMALIZED_VALUES[i] = temp;
        }
        return data;
    }
    
    //Generar los histogramas 
    protected void GenerateGraph(double[] dataY, double maxValue){
        Color color = Color.RED;
        double[] RangeRGB = RangeRGBAux();
        Grafica GR = new Grafica();
        BufferedImage grafico = GR.Imagen(RangeRGB, dataY, "Histograma", color, maxValue);
        SetHistograma(grafico);
        
    }
    
    protected void SetHistograma(BufferedImage image){
        Image ScaledImage = image.getScaledInstance(HistogramaLienzo.getWidth(), HistogramaLienzo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon li = new ImageIcon(ScaledImage);
        HistogramaLienzo.setIcon(li);
    }
    
    //Impresion de valores 
    protected void PrintValues(double[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
    
    //Impresion de valores para ArrayList
    protected void PrintValuesArrayList(ArrayList<Double> Array){
        for(Double valor: Array){
            System.out.println(valor);
        }
    }
    
    //Buscar valor en un arraylist
    protected double FindFrequency( int valor){
        return FREQUENCY[valor];
    }
    
    //Localizar los posibles puntos
    protected OTSU_Type EncontrarPosiblesPuntos(){
        //Primero calculamos el tamano del array sin valores de frecuencia con 0 
        int tam = ContarCeros(NORMALIZED_VALUES);
        Crestas limites_inf_sup = Calculo_Limites(NORMALIZED_VALUES);       
        
        ArrayList<OTSU_Type> posibles_puntos = CopiarArrayDentroDeLimites(NORMALIZED_VALUES, tam, limites_inf_sup);
        for(int i = 0; i < posibles_puntos.size(); i++){
            //Mandamos a calcular su valor de umbralizacion de cada valor
            posibles_puntos.set(i, UmbralizacionOTSU(posibles_puntos.get(i).Posicion, limites_inf_sup.limite_inferior, limites_inf_sup.Limite_superior));
        }
        //Localizamos el valor con mayor valor de umbralizacion
        int posicion = CalculoMayor(posibles_puntos);   
        OTSU_Type Valor_Localizado = posibles_puntos.get(posicion);
        return Valor_Localizado;
    }
    
    //Punto de corte
    protected OTSU_Type UmbralizacionOTSU(int punto_corte, int limite_inferior, int Limite_superior){
   
        double Omega_Clase_1 = Calculo_Omega(0, punto_corte, NORMALIZED_VALUES);
        double Omega_Clase_2 = Calculo_Omega(punto_corte, NORMALIZED_VALUES.length, NORMALIZED_VALUES);

        double[] Probabilidad_Ocurrencia_Clase_1 = Calculo_Probabilidad_Ocurrencia(Omega_Clase_1, NORMALIZED_VALUES, 0, punto_corte, "Clase 1");
        double[] Probabilidad_Ocurrencia_Clase_2 = Calculo_Probabilidad_Ocurrencia(Omega_Clase_2, NORMALIZED_VALUES, punto_corte, NORMALIZED_VALUES.length, "Clase 2");

        //Medias de cada clase 
        double mediaClase_1 = MediaClase(Probabilidad_Ocurrencia_Clase_1, Omega_Clase_1);
        double mediaClase_2 = MediaClase(Probabilidad_Ocurrencia_Clase_2, Omega_Clase_2);

        double MediaTotal = MediaTotal(Omega_Clase_1, mediaClase_1, Omega_Clase_2, mediaClase_2);
        double umbral = UmbralT(Omega_Clase_1, Omega_Clase_2, mediaClase_1, mediaClase_2, MediaTotal);
        
        OTSU_Type Umbral = new OTSU_Type(punto_corte, Omega_Clase_1, Omega_Clase_2, mediaClase_1, mediaClase_2, MediaTotal, umbral, limite_inferior, Limite_superior);
        
        return Umbral;
    }
    
    //Calculo de Omega
    protected double Calculo_Omega(int inicio, int limite, double[] array){
        double Probabilidad = 0;
        for(int i = inicio; i < limite; i++){
            Probabilidad += array[i];
            //System.out.println("Omega: " + Probabilidad + " array[" + i + "]:" + " P:" + array[i]);
            //System.out.println("");
        }
        return Probabilidad;
    }
    
    //Calculo la probabilidad de ocurrencia de la clase 
    protected double[] Calculo_Probabilidad_Ocurrencia(double omega, double[] array, int inicio, int limite, String leyenda){
        double[] temp_array = Arrays.copyOfRange(NORMALIZED_VALUES, inicio, limite);
        for(int i = 0; i < temp_array.length; i++){
            temp_array[i] = temp_array[i] / omega;
        }
        return temp_array;
    }
    
    //Calculo de las medias de cada clase 
    protected double MediaClase(double[] array, double omega){
        double media = 0;
        for(int i = 0; i < array.length; i++){
            double temp = (i * array[i]) / omega;
            media += temp;
        }
        return media;
    }
   
    //Calculo para la media total 
    protected double MediaTotal(double Omega_1, double Media_1, double Omega_2, double Media_2){
        double valor = (Omega_1 * Media_1) + (Omega_2 * Media_2);
        return valor;
    }
    
    //Calcular media total mayor 
    protected int CalculoMayor(ArrayList<OTSU_Type> array){
        double dato = array.get(0).Umbral_T;   
        System.out.println("Valor de Umbral T: " + dato);
        int pos = array.get(0).Posicion;
        for(OTSU_Type valor: array){
            if(dato < valor.Umbral_T){
                dato = valor.Umbral_T;
                pos = valor.Posicion;
            }
        }
        return pos;
    }
    
    //Calcular Umbral T
    protected double UmbralT(double omega_1, double omega_2, double media_1, double media_2, double media_total){
        double parte_1 = omega_1 * Math.pow((media_1 - media_total), 2);
        double parte_2 = omega_2 * Math.pow((media_2 - media_total), 2);
        return parte_1 + parte_2;                
    }
    //Binarizacion 
    protected BufferedImage Binarizacion(BufferedImage img){
        int Punto_Corte = Slider.getValue();
        for(int i = 0; i < img.getWidth(); i++){
            for(int j = 0; j < img.getHeight(); j++){
                int pixel = img.getRGB(i, j);
                Color color = new Color(pixel, true);
                int RED = color.getRed();
                  
                if(RED < Punto_Corte){
                    color = new Color(0, 0, 0);
                    img.setRGB(i, j, color.getRGB());    
                }else{
                    color = new Color(255, 255, 255);
                    img.setRGB(i, j, color.getRGB()); 
                }
            }
        }
        return img;
    }
    
    //Binarizacion 
    protected BufferedImage Binarizacion(BufferedImage img, int punto_corte){
        int Punto_Corte = punto_corte;
        for(int i = 0; i < img.getWidth(); i++){
            for(int j = 0; j < img.getHeight(); j++){
                int pixel = img.getRGB(i, j);
                Color color = new Color(pixel, true);
                int RED = color.getRed();
                  
                if(RED < Punto_Corte){
                    color = new Color(0, 0, 0);
                    img.setRGB(i, j, color.getRGB());    
                }else{
                    color = new Color(255, 255, 255);
                    img.setRGB(i, j, color.getRGB()); 
                }
            }
        }
        return img;
    }
    
    //Proceso para contar ceros 
    protected int ContarCeros(double[] array){
        int valor = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] != 0){
                    valor+=1;
                }
            }
        
        return valor;
    }
    
    //Copias el nuevo array sin ceros - se guarda la posicion original y el valor de frecuencia
    protected ArrayList<OTSU_Type> CopiarArrayDentroDeLimites(double[] original, int tam, Crestas limites){
        ArrayList<OTSU_Type> posibles_puntos = new ArrayList<OTSU_Type>();
            for(int i = limites.limite_inferior; i < limites.Limite_superior; i++){
                    //De momento solo se guarda la posicion  del posible punto con los limites que calculamos entre las crestas
                    //temp sera remplazado mas adelante
                    posibles_puntos.add(new OTSU_Type(i, 0, 0, 0 , 0, 0, 0, 0, 0));
                    
            }
        return posibles_puntos;
    } 
    
    //Calculo del media del array sin ceros
    protected double Calculo_Media_Sin_Ceros(double[] array){
        double media = 0;
            for(int i = 0; i < array.length; i++){
                media+= array[i];
            }
            media = media/array.length;
        
        return media;
    }
    
    //Delimitar rango de busqueda de posibles puntos
    protected ArrayList<OTSU_Type> Array_Delimitado(ArrayList<OTSU_Type> array){
        ArrayList<OTSU_Type> Array_Final = new ArrayList<OTSU_Type>();
        //Con esto avanzamos un 10% del limite inferior y retrocedemos un 10% del limite superior, 
        //por lo cual nuestro rango de busqueda no queda en en los limites y al menos garantizamos un 10% de pixeles con
        //valores diferentes de 0 a una clase, aunque puede resultar muy pequena la clase
        
        double temp = array.size() * 0.2;
        int porcentaje_de_avance = (int)temp;
        for(int i = porcentaje_de_avance; i < (array.size() - porcentaje_de_avance); i++){
            Array_Final.add(array.get(i));
           
        }
        System.out.println("Tamano de final: " + Array_Final.size());
        return Array_Final;
    }
    
    //calculo del limite inferior para imagen bimodal 
    protected Crestas Calculo_Limites(double[] array){
        double limite_inf = array[0];
        double limite_sup = array[255];
        int i = 0; 
        int j = 256;
        int j_aux = 255;
        int pos_inf = 0;
        int pos_sup = 0;
        boolean flag = true;
        while( flag ){
            if(limite_inf < array[i]){
                limite_inf = array[i];
                pos_inf = i;
            }

            if(limite_sup < array[j_aux]){
                limite_sup = array[j];
                pos_sup = j;
            }
            i++;
            j_aux--;
            j--;
        
            if(i == j){
                System.out.println("Salgo del ciclo");
                flag = false;
            }
        }
        Crestas limites = new Crestas(pos_inf, pos_sup);
        return limites;
        
    }
    
    
    //Impresion de valores 
    protected void ImpresionValoresOtsu(ArrayList<OTSU_Type> Valores){
        for(OTSU_Type valor: Valores){
            //System.out.println("Posicion: " + valor.Posicion);
            System.out.println(valor.Posicion +" - "+ valor.Umbral_T);
            //System.out.println("");
        }
    }
    
    //Auxiliar para cargar los rangos de 0 a 255
    protected double[] RangeRGBAux(){
        double[] RangeRGB = new double[256];
        for(int i = 0; i < 256; i++){
            RangeRGB[i] = i;
        }
        
        return RangeRGB;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Binarizacion;
    private javax.swing.JTextField CrestaInferior;
    private javax.swing.JTextField CrestaSuperior;
    private javax.swing.JTextField FrequencyTextField;
    private javax.swing.JPanel Histograma;
    private javax.swing.JLabel HistogramaLienzo;
    private javax.swing.JLabel Lienzo;
    private javax.swing.JPanel LienzoContainer;
    private javax.swing.JTextField Media_Clase_1;
    private javax.swing.JTextField Media_Clase_2;
    private javax.swing.JTextField Omega_Clase_1;
    private javax.swing.JTextField Omega_Clase_2;
    private javax.swing.JPanel PanelUmbralizacion;
    private javax.swing.JTextField PosicionTextField;
    private javax.swing.JTextField RGBTextField;
    private javax.swing.JSlider Slider;
    private javax.swing.JTextField Umbral;
    private javax.swing.JButton Umbralizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loadImage;
    // End of variables declaration//GEN-END:variables
}
