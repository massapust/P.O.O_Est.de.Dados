public class Produtos {
    private int codigo;
    private String marca;
    private String modelo;
    private String descricao;

    public Produtos(String marca, String modelo, String descricao) {
        this.marca = marca;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    public Produtos() {

    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {


        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void visualizar() {
        System.out.printf("│%6d│ %-15s │ %-15s │ %-14s │",
                this.codigo, this.marca, this.modelo, this.descricao);
    }
}

