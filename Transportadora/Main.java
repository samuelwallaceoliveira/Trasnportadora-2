import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Chassi: ");
        String chassi = sc.nextLine();

        System.out.print("Quilometros rodados: ");
        String km = sc.nextLine();

        System.out.print("Capacidade: ");
        String capacidade = sc.nextLine();

        Caminhao caminhao1 = new Caminhao(modelo, placa, chassi, km, capacidade);

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Nome do motorista: ");
        String nome = sc.nextLine();

        System.out.print("CPF do motorista: ");
        String cpf = sc.nextLine();

        System.out.print("Validade da habilitação (ex: 22/10/2025): ");
        String validade = sc.nextLine();

        System.out.print("Número da habilitação (CNH): ");
        String habilitacao = sc.nextLine();

        System.out.print("Categoria da habilitação: ");
        String cnhCat = sc.nextLine();

        System.out.print("Nascimento (dd/MM/yyyy): ");
        String data = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Está em atividade? (true/false): ");
        boolean ativo = sc.nextBoolean();
        sc.nextLine(); // limpar buffer

        System.out.print("Anos de experiência: ");
        int experiencia = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Motorista motorista1 = new Motorista(id, nome, cpf, data, habilitacao, cnhCat, validade,
                email, telefone, ativo, experiencia);

        System.out.print("Origem: ");
        String origem = sc.nextLine();

        System.out.print("Destino: ");
        String destino = sc.nextLine();

        System.out.print("Peso da carga (kg): ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpar buffer

        System.out.print("Previsão de chegada (ex: 22/10/2025): ");
        String previsao = sc.nextLine();

        caminhao1.addMotorista(motorista1);

        Pedido pedido1 = new Pedido(origem, destino, peso, previsao, motorista1, caminhao1);

        caminhao1.addPedido(pedido1);

        pedido1.exibirInformacoes();
    }
}
