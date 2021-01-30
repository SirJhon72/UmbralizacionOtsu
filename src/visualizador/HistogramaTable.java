package visualizador;


public class HistogramaTable {
    protected int Key;
    protected int Valor;
    
    public HistogramaTable(int Key, int Valor){
        this.Key = Key;
        this.Valor = Valor;        
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
    
    
}
