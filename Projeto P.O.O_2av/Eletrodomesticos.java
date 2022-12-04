public class Eletrodomesticos {
    private String marca;
    private String tipo;
    private String capacidade;

    public Eletrodomesticos(String m, String t, String p) {
        this.marca = m;
        this.tipo = t;
        this.capacidade = p;
    }

    public Eletrodomesticos() {
        this.marca = "vazio";
        this.tipo = "vazio";
        this.capacidade = "vazio";
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
        }

    }
