public class Agencia {

    private String numero;
    private Endereco endereco;

    public Agencia(String numero, Endereco endereco) {
        this.numero = numero;
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println(
                "O número da agência é: " + this.getNumero());
        System.out.println(
                "E esta agência está localizada em: " +
                        this.getEndereco().getEnderecoCompleto()
        );
    }

    public String getNumero() {
        return numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}