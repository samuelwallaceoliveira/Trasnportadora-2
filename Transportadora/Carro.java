public class Carro extends Veiculo {
    private int NumLugares;
    private double TamMala;
    private String tipoCar;


    public Carro(String modelo, String placa, String chassi, String km, int numLugares,
            double tamMala, String tipoCar) {
        super(modelo, placa, chassi, km);
        this.NumLugares = numLugares;
        this.TamMala = tamMala;
        this.tipoCar = tipoCar;
    }


    public int getNumLugares() {
        return NumLugares;
    }


    public void setNumLugares(int numLugares) {
        NumLugares = numLugares;
    }


    public double getTamMala() {
        return TamMala;
    }


    public void setTamMala(double tamMala) {
        TamMala = tamMala;
    }


    public String getTipoCar() {
        return tipoCar;
    }


    public void setTipoCar(String tipoCar) {
        this.tipoCar = tipoCar;
    }

    

    
}