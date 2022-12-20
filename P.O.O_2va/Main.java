
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static ListaEletrodomesticos listaEletrodomesticos;
    public static void mostrarMenu(){
        System.out.println("┌───────────────────────────────────────────────────────────────┐");
        System.out.println("│                       Escolha uma Opção:                      │");
        System.out.println("└───────────────────────────────────────────────────────────────┘");
        System.out.println("[1]: Visualizar produtos.");
        System.out.println("[2]: Adicionar novo produto.");
        System.out.println("[3]: Modificar produto existente.");
        System.out.println("[4]: Eliminar produto.");
        System.out.println("[5]: Sair.");
        System.out.println("────────────────────────────────────────────────────────────────┘");
        System.out.println();
    }


    public static void main(String[] args) {
        listaEletrodomesticos = new ListaEletrodomesticos();
        listaEletrodomesticos.criaEletrodomestricosFake();

        System.out.println("\n\n\n\nBem Vindo ao Gestor de Eletrodomesticos. \n");

        int option = 0; //variavel usada no menu de interação com o usuario para as opções do menu.
        Scanner n = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////////////
        boolean exit = false;
        while (!exit) {
            mostrarMenu();

            boolean opcaoCorreta = false; //comprova se a opção escolhida pelo usuário esta correta.
            while (!opcaoCorreta) {
                System.out.print("Opção: ");
                option = Integer.parseInt(n.nextLine());
                System.out.println();

                switch (option) {
                    case 1:
                        listar();
                        opcaoCorreta = true;
                        break;

                    case 2:
                        criar();
                        opcaoCorreta = true;
                        break;

                    case 3:
                        modificar();
                        opcaoCorreta = true;
                        break;

                    case 4:
                        excluir();
                        opcaoCorreta = true;
                        break;

                    case 5:
                        opcaoCorreta = true;
                        exit = true;
                        break;

                    default:
                        System.out.println("A opção escolhida não existe, favor escolha outra.");
                }
            }// while
        }//while  39
    }

    //////////////////////////////FUNÇÕES////////////////////////////////////

    private static void mostrarCabecalhoVisualizacao(){
        System.out.println("┌──────┬─────────────────┬───────────────────┬─────────────────────────┬──────────┐");
        System.out.println("│Código│      Marca      │       Modelo      │         Descrição       │ Voltagem │");
        System.out.println("├──────┼─────────────────┼───────────────────┼─────────────────────────┼──────────┤");
    }

    private static void mostraRodapeVisualizacao(){
        System.out.println("└──────┴─────────────────┴───────────────────┴─────────────────────────┴──────────┘");



        System.out.println();
        System.out.println();
    }


    /**
     * Visualiza os produtos guardados na memoria
     */
    public static void listar() {
        mostrarCabecalhoVisualizacao();

        listaEletrodomesticos.visualizar();

        mostraRodapeVisualizacao();
    }


    /**
     * Adicinar a ArrayList <Eletrodomesticos> marca, tipo e capacidade </Eletrodomesticos> novos dados
     */

    public static void criar() {
        Scanner n = new Scanner(System.in);
        String marca;
        String modelo;
        String descricao;
        int voltagem;

        System.out.print("Informe a Marca: ");
        marca = n.nextLine();
        System.out.println();

        System.out.print("Informe o Modelo: ");
        modelo = n.nextLine();
        System.out.println();

        System.out.print("Informe a Descrição: ");
        descricao = n.nextLine();
        System.out.println();

        System.out.print("Informe a Voltagem: ");
        voltagem = n.nextInt();
        System.out.println();

        boolean resultado = listaEletrodomesticos.criar(marca, modelo, descricao, voltagem);

        if(resultado == true) {
            System.out.println();
            System.out.println("os dados foram adicionados corretamente!.");
            System.out.println("pode usar a opção 1 do menu para visualizar.");
            System.out.println();
            System.out.println();
        }else{
            System.out.println();
            System.out.println("os dados NÃO foram adicionados corretamente! Tente Novamente.");
            System.out.println("pode usar a opção 1 do menu para visualizar.");
            System.out.println();
            System.out.println();
        }

    }


    /**
     * modificar dados ja existentes.
     */
    public static void modificar() {
        Scanner f = new Scanner(System.in);
        int indice;

        System.out.print("Por favor, informe o código a ser modificado: ");
        indice = Integer.parseInt(f.nextLine()) - 0;
        System.out.println();

        String novaMarca;
        String novoModelo;
        String novaDescricao;
        int novaVoltagem;


        if (listaEletrodomesticos.validaEletrodomesticoExistente(indice) == true) {
            Eletrodomesticos eletro = listaEletrodomesticos.visualizar(indice);

            System.out.println("Marca atual: " + eletro.getMarca());
            System.out.print("Por favor informe a nova Marca (aperte ENTER para não modificar os dados): ");
            novaMarca = f.nextLine();
            if (!novaMarca.equals("")) {
                eletro.setMarca(novaMarca);
            }

            System.out.println();
            System.out.println("Modelo atual: " + eletro.getModelo());
            System.out.print("Por favor informe o novo Modelo (aperte ENTER para não modificar os dados): ");
            novoModelo = f.nextLine();
            if (!novoModelo.equals("")) {
                eletro.setModelo(novoModelo);
            }

            System.out.println();
            System.out.println("Descrição atual: " + eletro.getDescricao());
            System.out.print("Por favor informe a descrição (aperte ENTER para não modificar os dados): ");
            novaDescricao = (f.nextLine());
            if (!novaDescricao.equals("")) {
                eletro.setDescricao(novaDescricao);
            }

            System.out.println();
            System.out.println("Voltagem atual: " + eletro.getVoltagem());
            System.out.print("Por favor informe a Voltagem (aperte ENTER para não modificar os dados): ");
            novaVoltagem = (f.nextInt());
            if (novaVoltagem >= 0) {
                eletro.setVoltagem(novaVoltagem);
            }

            boolean retorno = listaEletrodomesticos.modificar(eletro.getCodigo(), eletro.getMarca(), eletro.getModelo(), eletro.getDescricao(), eletro.getVoltagem());

            System.out.println();
            System.out.println();

            if(retorno == true) {
                System.out.println("os dados foram modificados corretamente.");
            }else{
                System.out.println("os dados NÃO foram modificados corretamente.");
            }

            System.out.println("pode usar a opção 1 do menu para visualizar.");
            System.out.println();
            System.out.println();
        } else {
            System.out.println("desculpe, esta opção  não existe no menu. por favor, selecione outra opção do menu.");
        }

    }



    /**
     * excluir / limpar os dados
     */

    public static void excluir() {
        Scanner f = new Scanner(System.in);

        System.out.print("Por favor, informe o código a ser excluido: ");
        int indice = Integer.parseInt(f.nextLine());
        if (listaEletrodomesticos.validaEletrodomesticoExistente(indice)) {
            boolean retorno = listaEletrodomesticos.excluir(indice);

            System.out.println();

            if(retorno == true){
                System.out.println("excelente, os dados foram excluidos corretamente!.");
            }else{
                System.out.println("Oh não, os dados não foram excluidos corretamente! Tente novamente.");
            }

            System.out.println();
            System.out.println();
        } else {
            System.out.println();
            System.out.println("desculpe, o código informado não existe.");
            System.out.println("por favor, selecione outra opção do menu.");
            System.out.println();
            System.out.println();
        }

    }
}