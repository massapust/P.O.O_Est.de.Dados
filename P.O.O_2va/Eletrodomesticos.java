public class Eletrodomesticos extends Produtos {
    private int voltagem;

    public int getVoltagem() {
        return this.voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public Eletrodomesticos(int codigo, String marca, String modelo, String descricao, int voltagem){
        setCodigo(codigo);
        setMarca(marca);
        setModelo(modelo);
        setDescricao(descricao);
        setVoltagem(voltagem);
    }

    public void visualizar() {
        System.out.printf("│%6d│ %-15s │ %-17s │ %-23s │ %-8s │",
                getCodigo(), getMarca(), getModelo(), getDescricao(), getVoltagem());
    }
}


