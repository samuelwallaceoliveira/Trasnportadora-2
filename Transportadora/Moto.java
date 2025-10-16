public class Moto extends Veiculo {
    private boolean bagageiro;
    private boolean partidaEletrica;

    public Moto(String modelo, String placa, String chassi, String km,
            boolean bagageiro, boolean partidaEletrica) {
        super(modelo, placa, chassi, km);
        this.bagageiro = bagageiro;
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    

    

    

}
