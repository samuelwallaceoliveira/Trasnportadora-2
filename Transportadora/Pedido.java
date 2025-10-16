public class Pedido {
    String origem;
    String destino;
    double peso;
    String previsaoChegada;
    Veiculo veiculo;
    Motorista motorista;

    public Pedido(String origem, String destino, double peso, String previsaoChegada, Motorista motorista, Veiculo veiculo) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
        this.previsaoChegada = previsaoChegada;
        this.veiculo = veiculo;
        this.motorista = motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPrevisaoChegada() {
        return previsaoChegada;
    }

    public void setPrevisaoChegada(String previsaoChegada) {
        this.previsaoChegada = previsaoChegada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    
    public void exibirInformacoes() {
        System.out.println("\n=== Pedido ===");
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Previsão de chegada: " + previsaoChegada);
        System.out.println("Motorista: " + (motorista != null ? motorista.getNome() : "Nenhum"));
        System.out.println("Veículo: " + (veiculo != null ? veiculo.toString() : "Nenhum"));
    }
    
}
