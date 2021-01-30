
package visualizador;


public class Crestas {
    protected int limite_inferior;
    protected int Limite_superior;

    public Crestas(int posicion, int frecuencia) {
        this.limite_inferior = posicion;
        this.Limite_superior = frecuencia;
    }

    public int getLimite_inferior() {
        return limite_inferior;
    }

    public void setLimite_inferior(int limite_inferior) {
        this.limite_inferior = limite_inferior;
    }

    public int getLimite_superior() {
        return Limite_superior;
    }

    public void setLimite_superior(int Limite_superior) {
        this.Limite_superior = Limite_superior;
    }
    
    
}
