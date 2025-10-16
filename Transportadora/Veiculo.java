import java.util.ArrayList;
import java.util.List;

abstract public class Veiculo {
    List<Motorista> motoristas;
    List<Pedido> pedidos;
    String modelo;
    String placa;
    String chassi;
    String km;


    public Veiculo(String modelo,String placa,String chassi,String km){
        this.modelo = modelo;
        this.motoristas = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void addMotorista(Motorista motorista){
        motoristas.add(motorista);
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }



}