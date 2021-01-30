
package visualizador;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;

import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import java.util.Arrays; 



public class Histograma extends javax.swing.JPanel {
    protected ArrayList<Integer> HR = new ArrayList<Integer>();
    protected ArrayList<Integer> HG = new ArrayList<Integer>();
    protected ArrayList<Integer> HB = new ArrayList<Integer>();
    protected ArrayList<Integer> GS = new ArrayList<Integer>();

    protected ArrayList<HistogramaTable> HR_Table = new ArrayList<HistogramaTable>();
   
    protected final int Limit = 256;
    
    protected double[] HistogramaRed = new double[Limit];
    protected double[] HistogramaGreen = new double[Limit];
    protected double[] HistogramaBlue = new double[Limit];
    protected double[] HistogramaGrayScale = new double[Limit];
    protected double[] RangeRGB = new double[Limit];
   
    protected Color RED = Color.red;
    protected Color GREEN = Color.green;
    protected Color BLUE = Color.blue;
    protected Color GRAY = Color.gray;
    
    protected double MaxRED;
    protected double MaxGREEN;
    protected double MaxBLUE;
    protected double MAXGS;
   
    /*Bandera que nos ayudara a saber si estamos en color o en escala de grises */
    protected boolean flag =  true;
    /* falso = gray 
       color = true
    */

    public Histograma() {
        initComponents();
        TitledBorder HistogramaR = BorderFactory.createTitledBorder("Histograma R - GrayScale");
        TitledBorder HistogramaG = BorderFactory.createTitledBorder("Histograma G");
        TitledBorder HistogramaB = BorderFactory.createTitledBorder("Histograma B");
        TitledBorder Imagen = BorderFactory.createTitledBorder("Imagen");
        Imagen.setTitleJustification(TitledBorder.CENTER);
        
        LienzoOut.setBorder(Imagen);
        histogramaRPanel.setBorder(HistogramaR);
        histogramaGPanel.setBorder(HistogramaG);
        histogramaBPanel.setBorder(HistogramaB);    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LienzoOut = new javax.swing.JPanel();
        Lienzo = new javax.swing.JLabel();
        histogramaRPanel = new javax.swing.JLabel();
        GenerateHistogramas = new javax.swing.JButton();
        loadImage = new javax.swing.JButton();
        histogramaGPanel = new javax.swing.JLabel();
        histogramaBPanel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout LienzoOutLayout = new javax.swing.GroupLayout(LienzoOut);
        LienzoOut.setLayout(LienzoOutLayout);
        LienzoOutLayout.setHorizontalGroup(
            LienzoOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LienzoOutLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        LienzoOutLayout.setVerticalGroup(
            LienzoOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LienzoOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        GenerateHistogramas.setText("Generar Histograma");
        GenerateHistogramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateHistogramasActionPerformed(evt);
            }
        });

        loadImage.setText("Cargar Imagen");
        loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LienzoOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loadImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenerateHistogramas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(histogramaRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(histogramaGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(histogramaBPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(histogramaRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(histogramaGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(histogramaBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LienzoOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GenerateHistogramas)
                            .addComponent(loadImage))
                        .addGap(31, 31, 31))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            String path = file.getAbsolutePath();
            Image in = Toolkit.getDefaultToolkit().createImage(path);
            in = in.getScaledInstance(LienzoOut.getWidth() - 30, LienzoOut.getHeight() - 30, Image.SCALE_SMOOTH);
            
            ImageIcon li = new ImageIcon(in);
            Lienzo.setIcon(li);
            
            BufferedImage img = ImageIO.read(file);
            if(isGraySacePixel(img)){
                /* Es una imagen a blanco y negro */
                flag = false;
                Pre_ProcesamientoGrayScale(img);
                
                
            }else{
                /* Imagen a color */
                flag = true;
                Pre_ProcesamientoImagenRGB(img);            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_loadImageActionPerformed

    private void GenerateHistogramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateHistogramasActionPerformed
            
            if(flag == true){
                GenerarHistogramaRGB();
            }else if(flag == false){
                GenerarHistogramasGrayScale();

            }

    }//GEN-LAST:event_GenerateHistogramasActionPerformed

   
    protected void GenerarHistogramaRGB(){
        try {
            Grafica GR = new Grafica();
            double MaxLimit = MaxLimitRGB();
            BufferedImage redIMG = GR.Imagen(RangeRGB, HistogramaRed, "R", RED, MaxLimit);
            BufferedImage greenIMG = GR.Imagen(RangeRGB, HistogramaGreen, "G", GREEN, MaxLimit);
            BufferedImage blueIMG = GR.Imagen(RangeRGB, HistogramaBlue, "B", BLUE, MaxLimit);
            SetHistogramas(redIMG, greenIMG, blueIMG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    protected void GenerarHistogramasGrayScale(){
        try{
            Grafica GR = new Grafica();
            double MaxLimit = MaxValue(HistogramaGrayScale);
            RangeRGB = CargadoAuxiliar();
            BufferedImage grayScaleIMG = GR.Imagen(RangeRGB, HistogramaGrayScale, "Gray Scale", GRAY, MaxLimit);
            SetHistogramas(grayScaleIMG);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    protected void SetHistogramas(BufferedImage RED, BufferedImage GREEN, BufferedImage BLUE){
            
        /*RED*/
        Image inR = RED;
        inR = inR.getScaledInstance(histogramaRPanel.getWidth() - 30, histogramaRPanel.getHeight() - 30, Image.SCALE_SMOOTH);
        ImageIcon iconR = new ImageIcon(inR);
        histogramaRPanel.setIcon(iconR);
       
        /*GREEN*/
        Image inG = GREEN;
        inG = inG.getScaledInstance(histogramaGPanel.getWidth() - 30, histogramaGPanel.getHeight() - 30, Image.SCALE_SMOOTH);
        ImageIcon iconG = new ImageIcon(inG);
        histogramaGPanel.setIcon(iconG);
        
        /*BLUE*/
        Image inB = BLUE;
        inB = inB.getScaledInstance(histogramaBPanel.getWidth() - 30, histogramaBPanel.getHeight() - 30, Image.SCALE_SMOOTH);
        ImageIcon iconB = new ImageIcon(inB);
        histogramaBPanel.setIcon(iconB);
        
        limpiarDatso();
        
    }
    
    protected void SetHistogramas(BufferedImage GrayScale){
         /*RED*/
        Image inR = GrayScale;
        inR = inR.getScaledInstance(histogramaRPanel.getWidth() - 30, histogramaRPanel.getHeight() - 30, Image.SCALE_SMOOTH);
        ImageIcon iconR = new ImageIcon(inR);
        histogramaRPanel.setIcon(iconR);
        
        limpiarDatso();
    }
    
    
    /* Preprocesamiento para las imagenes en blanco y negro */
    protected void Pre_ProcesamientoGrayScale(BufferedImage img){
        getGrayScaleChannel(img);
        HistogramaGrayScale = Normalization(GS, img.getWidth() * img.getHeight());
        RangeRGB = CargadoAuxiliar();
    }
    
     /* Procesamiento para las imagenes a color */
    protected void Pre_ProcesamientoImagenRGB(BufferedImage img){
        GetRGBChanels(img);
        HistogramaRed = Normalization(HR, img.getWidth() * img.getHeight() );
        HistogramaGreen = Normalization(HG, (img.getWidth() * img.getHeight()));
        HistogramaBlue = Normalization(HB, (img.getWidth() * img.getHeight())); 
        RangeRGB = CargadoAuxiliar();
    }
    
    //Comprobar si una imagen esta a color o blanco y negro
    protected boolean isGraySacePixel(BufferedImage image){
        int pixel, red, green, blue;
        Color color; 
        for(int i = 0; i < image.getWidth(); i++){
            for(int j = 0; j < image.getHeight(); j++){
                pixel = image.getRGB(i, j);
                color = new Color(pixel, true);
                red =  color.getRed();
                green = color.getGreen();
                blue = color.getBlue();
                
                if(red != green || green != blue){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    //Obtencion de RGB para las imagenes en color
    protected void GetRGBChanels(BufferedImage image){
        int pixel;
        Color color;
               
        //Agregamos los datos de los pixeles de cada canal 
        for(int i = 0; i < image.getWidth(); i++){
            for(int j = 0; j < image.getHeight(); j++){
                pixel = image.getRGB(i, j);
                color = new Color(pixel, true);
                HR.add(color.getRed());
                HG.add(color.getGreen());
                HB.add(color.getBlue());
                }
        }       
   }
    
       
    //Normalizacion para las imagenes en escala de grises
    protected void getGrayScaleChannel(BufferedImage image){
        int pixel;
        Color color; 
        
        //Obtenemos los valores de un solo canal 
        for(int i = 0; i < image.getWidth(); i++){
            for(int j = 0; j < image.getHeight(); j++){
                pixel = image.getRGB(i, j);
                color = new Color(pixel, true);
                GS.add(color.getRed());
            }
        }
    }
    
    //Calculamos la Frecencia de los colores
    protected double [] Normalization(ArrayList<Integer> Array, int NoPixels){
        double [ ] datos = new double [Limit];
        double valor = 0;
        for(int i = 0; i < Limit ; i++){
            valor = Collections.frequency(Array, i);
            datos[i] = valor / NoPixels;
            HR_Table.add(new HistogramaTable(i, Collections.frequency(Array, i) / NoPixels ) );             
        }
        return datos;
    }

    //Encontramos el valor maximo de los 3 canales
    protected double MaxLimitRGB(){
        double valor = 0;
        MaxRED = MaxValue(HistogramaRed);
        MaxGREEN = MaxValue(HistogramaGreen);
        MaxBLUE = MaxValue(HistogramaBlue);
        
        if(MaxRED > MaxGREEN && MaxRED > MaxBLUE){
            valor = MaxRED;
        }else if(MaxGREEN > MaxBLUE){
            valor = MaxGREEN;
        }else{
            valor = MaxBLUE;
        }
        
        return valor;
    }
    
      
    //Calculamos el valor maximo para el eje Y
    protected double MaxValue(double[] Array){
        double valor = Array[0];
        for(int i = 0; i < Array.length; i++){
            if(valor < Array[i]){
                valor = Array[i];
            }
        }
        return valor;
    }
    
    //Cargamos valores a los datos auxiliares
    protected double[] CargadoAuxiliar(){
        double[] datos = new double[Limit];
        for(int i = 0; i < Limit; i++){
            datos[i] = i;
        }
        
        return datos;        
    }
    
    //Limpiamos las varibales
    protected void limpiarDatso(){
        HR.clear();
        HG.clear();
        HB.clear();
        GS.clear();
    }
    //Funcion para imprimir los valores de los array
    protected void ImpresionValores(ArrayList<HistogramaTable> Array){
        for(HistogramaTable Valor: Array){
            System.out.println(Valor.Key + " " +Valor.Valor);
        }
    }
    
    //Imprimir Valores de ArrayNormal
    protected void ImprimirValores(double[] Array){
        for(double valor: Array){
            System.out.println(valor);
        }
    }
    
    //Imprimir valores de Arraylist
    protected void ImprimirValores(ArrayList<Integer> Array){
        System.out.println("Impresion de valores de ArrayList");
        for(Integer valor: Array){
            System.out.println(valor);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerateHistogramas;
    private javax.swing.JLabel Lienzo;
    private javax.swing.JPanel LienzoOut;
    private javax.swing.JLabel histogramaBPanel;
    private javax.swing.JLabel histogramaGPanel;
    private javax.swing.JLabel histogramaRPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadImage;
    // End of variables declaration//GEN-END:variables

 
}
