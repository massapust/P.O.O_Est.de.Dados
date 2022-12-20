import java.util.ArrayList;

public class ListaEletrodomesticos {
    ArrayList<Eletrodomesticos> lista;
    private int indice;

    public ListaEletrodomesticos(){
        lista = new ArrayList<>();
    }

    public void criaEletrodomestricosFake(){
        criar("Arno", "Ventilador", "55 Cm", 220);
        criar("Sony", "Som", "2000W", 110);
        criar("Philco", "Home Theater", "5 caixas", 220);
        criar("Xiaomi", "Celular", "Poco X4 Pro", 220);
        criar("Asus", "notebook", "core I3 14TH", 110);
        criar("Samsung", "televisão", "76 polegadas", 110);
        criar("Brastemp", "Geladeira", "540l", 220);
        criar("Eletrolux", "Fogão", "6 bocas", 220);
        criar("Consul", "Ar-condicionado", "9000BTU", 220);
    }

    public void visualizar() {
        for (Eletrodomesticos eletro :lista) {
            eletro.visualizar();
            System.out.println();
        }
    }

    public Eletrodomesticos visualizar(int codigo) {
        Eletrodomesticos eletro = null;
        for (Eletrodomesticos e :lista) {
            if(e.getCodigo() == codigo)
                eletro = e;
        }

        return eletro;
    }

    public boolean criar(String marca, String modelo, String descricao, int voltagem){
        indice = indice +1;

        return lista.add(new Eletrodomesticos(indice, marca, modelo, descricao, voltagem));
    }

    public boolean validaEletrodomesticoExistente(int indice){
        return visualizar(indice) != null;
    }

    public boolean modificar(int codigo, String marca, String modelo, String descricao, int voltagem) {
        Eletrodomesticos eletro = visualizar(codigo);

        int indiceLista = lista.indexOf(eletro);

        if(eletro != null) {
            eletro.setMarca(marca);
            eletro.setModelo(modelo);
            eletro.setDescricao(descricao);
            eletro.setVoltagem(voltagem);

            lista.set(indiceLista, eletro);

            return true;
        }

        return false;
    }

    public boolean excluir(int indice){
        if(validaEletrodomesticoExistente(indice) == false)
            return false;

        Eletrodomesticos eletro = visualizar(indice);

        int indiceLista = lista.indexOf(eletro);

        lista.remove(indiceLista);

        return true;
    }
}
