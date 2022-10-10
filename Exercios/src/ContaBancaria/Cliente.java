public class Cliente {

    private String cpf;
    private String nome;
    private Conta conta;

    public Cliente(String cpf, String nome, Conta conta) {
        this.cpf = cpf;
        this.nome = nome;
        this.conta = conta;
    }

    public void imprimirInfoCliente(){
        this.getConta().imprimir();
        this.getConta().getAgencia().imprimir();
        System.out.println("Essa conta é de: " + this.getNome());
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }
}
