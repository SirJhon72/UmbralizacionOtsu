
package visualizador;


public class OTSU_Type {
    protected int Posicion;
    protected double OmegaClase_1;
    protected double OmegaClase_2;
    protected double Media_1;
    protected double Media_2;
    protected double MediaTotal;
    protected double Umbral_T;
    protected int CrestaInferior;
    protected int CrestaSuperior;

    public OTSU_Type(int Posicion, double OmegaClase_1, double OmegaClase_2, double Media_1, double Media_2, double MediaTotal, double Umbral_T, int CrestaInferior, int CrestaSuperior) {
                this.Posicion = Posicion;

        this.OmegaClase_1 = OmegaClase_1;
        this.OmegaClase_2 = OmegaClase_2;
        this.Media_1 = Media_1;
        this.Media_2 = Media_2;
        this.MediaTotal = MediaTotal;
        this.Umbral_T = Umbral_T;
        this.CrestaInferior = CrestaInferior;
        this.CrestaSuperior = CrestaSuperior;
    }

    public int getCrestaInferior() {
        return CrestaInferior;
    }

    public void setCrestaInferior(int CrestaInferior) {
        this.CrestaInferior = CrestaInferior;
    }

    public int getCrestaSuperior() {
        return CrestaSuperior;
    }

    public void setCrestaSuperior(int CrestaSuperior) {
        this.CrestaSuperior = CrestaSuperior;
    }
    
      public double getMedia_1() {
        return Media_1;
    }

    public void setMedia_1(double Media_1) {
        this.Media_1 = Media_1;
    }

    public double getMedia_2() {
        return Media_2;
    }

    public void setMedia_2(double Media_2) {
        this.Media_2 = Media_2;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }

    public double getUmbral_T() {
        return Umbral_T;
    }

    public void setUmbral_T(double Umbral_T) {
        this.Umbral_T = Umbral_T;
    }

    public double getOmegaClase_1() {
        return OmegaClase_1;
    }

    public void setOmegaClase_1(double OmegaClase_1) {
        this.OmegaClase_1 = OmegaClase_1;
    }

    public double getOmegaClase_2() {
        return OmegaClase_2;
    }

    public void setOmegaClase_2(double OmegaClase_2) {
        this.OmegaClase_2 = OmegaClase_2;
    }


    public double getMediaTotal() {
        return MediaTotal;
    }

    public void setMediaTotal(double MediaTotal) {
        this.MediaTotal = MediaTotal;
    }
    
    
}

