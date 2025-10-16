public class Caminhao extends Veiculo {
    private String capacidade;

    public Caminhao(String modelo, String placa, String chassi, String km, String capacidade) {
        super(modelo, placa, chassi, km);
        this.capacidade = capacidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    
    public void exibirInformacoes() {
        System.out.println("\n=== Caminhão ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Chassi: " + chassi);
        System.out.println("Km rodados: " + km);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Motoristas: ");
        for (Motorista m : motoristas) {
            System.out.println(" - " + m.getNome());
        }
        System.out.println("Pedidos: " + pedidos.size());
    }
}
