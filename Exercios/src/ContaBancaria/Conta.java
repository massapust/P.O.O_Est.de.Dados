public class Conta {

    private String numero;
    private Double saldo;
    private String tipo;
    private Agencia agencia;

    private static int qtdDeContas = 0;

    public Conta(String numero, Double saldo, String tipo, Agencia agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.agencia = agencia;

        qtdDeContas++;
    }

    public static int getQtdDeContas() {
        return qtdDeContas;
    }

    public static void imprimirQtdDeContas() {
        System.out.println("Esse programa tem " + getQtdDeContas() + " contas criadas!");
    }

    public void imprimir(){
        System.out.println("O número da conta " + this.getTipo() +" é: " +
                this.getNumero() + " com saldo: " + this.getSaldo());
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public Agencia getAgencia() {
        return agencia;
    }
}