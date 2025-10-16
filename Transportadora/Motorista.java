
public class Motorista {
    private int id; 
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String habilitacaoNum;
    private String habilitacaoCat;
    private String habilitacaoVali;
    private String email;
    private String telefone;
    private String veiculoAtual;
    private boolean emAtividade;
    private int anosExperiencia;

    public Motorista() {
    }

    public Motorista(int id, String nome, String cpf, String dataNascimento,
                     String habilitacaoNum, String habilitacaoCat, String habilitacaoVali,
                     String email, String telefone,
                     boolean emAtividade, int anosExperiencia) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.habilitacaoNum = habilitacaoNum;
        this.habilitacaoCat = habilitacaoCat;
        this.habilitacaoVali = habilitacaoVali;
        this.email = email;
        this.telefone = telefone;
        this.emAtividade = emAtividade;
        this.anosExperiencia = anosExperiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHabilitacaoNum() {
        return habilitacaoNum;
    }

    public void setHabilitacaoNum(String habilitacaoNum) {
        this.habilitacaoNum = habilitacaoNum;
    }

    public String getHabilitacaoCat() {
        return habilitacaoCat;
    }

    public void setHabilitacaoCat(String habilitacaoCat) {
        this.habilitacaoCat = habilitacaoCat;
    }

    public String getHabilitacaoVali() {
        return habilitacaoVali;
    }

    public void setHabilitacaoVali(String habilitacaoVali) {
        this.habilitacaoVali = habilitacaoVali;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public boolean isEmAtividade() {
        return emAtividade;
    }

    public void setEmAtividade(boolean emAtividade) {
        this.emAtividade = emAtividade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== Motorista ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CNH: " + habilitacaoNum + " (" + habilitacaoCat + ")");
        System.out.println("Validade: " + habilitacaoVali);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Veículo atual: " + veiculoAtual);
        System.out.println("Em atividade: " + (emAtividade ? "Sim" : "Não"));
        System.out.println("Experiência: " + anosExperiencia + " anos");
    }
}

