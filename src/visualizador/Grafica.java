
package visualizador;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Grafica {
    protected BufferedImage Imagen(double[] indices, double[] Array, String Nombre, Color color, double MaxLimit){
        BufferedImage IMG = null;
        try {
            IMG = GenerarGrafica(indices, Array, Nombre, color, MaxLimit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IMG;
    }
    
    
    protected BufferedImage GenerarGrafica(double[] indices, double[] Array, String Nombre, Color color, double MaxLimit) throws IOException{       
      
     DefaultXYDataset dataset = new DefaultXYDataset();
        dataset.addSeries(Nombre, new double[][] { indices , Array });

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(true, false);
        renderer.setSeriesPaint(0, color);
  
        renderer.setSeriesStroke(2, new BasicStroke(2));

        JFreeChart chart = ChartFactory.createXYLineChart(null, null, null, dataset);
        chart.getXYPlot().getRangeAxis().setRange(0, MaxLimit);
        //((NumberAxis) chart.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#'%'"));
        chart.getXYPlot().setRenderer(renderer);

        BufferedImage image = chart.createBufferedImage(600, 400);
        ImageIO.write(image, "png", new File("red.png"));
        return image;
    }
}
