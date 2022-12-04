import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("bem vindo ao Gestor de Eletrodomesticos.");
            System.out.println();

            int option = 0; //variavel usada no menu de interação com o usuario para as opções do menu.
            Scanner n = new Scanner(System.in);

            ArrayList<Eletrodomesticos> e = new ArrayList<>();

            e.add(new Eletrodomesticos("Arno", "ventilador", "55 Cm"));
            e.add(new Eletrodomesticos("Sony", "Som", "2000W"));
            e.add(new Eletrodomesticos("philco", "home theater", "5 caixas"));
            e.add(new Eletrodomesticos("Xiaomi", "celular", "Poco X4 Pro"));
            e.add(new Eletrodomesticos("azus", "notebook", "core I3 14TH"));
            e.add(new Eletrodomesticos("Samsung", "televisão", "76 polegadas"));
            e.add(new Eletrodomesticos("Brastemp", "Geladeira", "540l"));
            e.add(new Eletrodomesticos("Eletrolux", "Fogão", "6 bocas"));
            e.add(new Eletrodomesticos("Consul", "Ar-condicionado", "9000BTU"));


            //////////////////////////////////////////////////////////////////////////////////
            boolean exit = false;
            while (!exit) {
                System.out.println("┌───────────────────────────────────────────────────────────────┐");
                System.out.println("│                       escolha uma opção:                      │");
                System.out.println("└───────────────────────────────────────────────────────────────┘");
                System.out.println("[1]: visualizar os produtos.");
                System.out.println("[2]: adicionar novos produtos.");
                System.out.println("[3]: Modificar produtos existentes.");
                System.out.println("[4]: Eliminar um produto.");
                System.out.println("[5]: Sair.");
                System.out.println("────────────────────────────────────────────────────────────────┘");
                System.out.println();

                boolean opcaoCorreta = false; //comprova se a opção escolhida pelo usuário esta correta.
                while (!opcaoCorreta) {
                    System.out.print("Opção: ");
                    option = Integer.parseInt(n.nextLine());
                    System.out.println();

                    switch (option) {
                        case 1:
                            visualizar(e);
                            opcaoCorreta = true;
                            break;

                        case 2:
                            criar(e);
                            opcaoCorreta = true;
                            break;

                        case 3:
                            modificar(e);
                            opcaoCorreta = true;
                            break;

                        case 4:
                            excluir(e);
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

        /**
         * Visualiza os produtos guardados na memoria
         */
        public static void visualizar(ArrayList<Eletrodomesticos> e) {
            int i = 0;      //usaremos como índice

            System.out.println("┌──────┬─────────────────┬─────────────────┬────────────────┐");
            System.out.println("│Índice│      Marca      │       Tipo      │    Capacidade  │");
            System.out.println("├──────┼─────────────────┼─────────────────┼────────────────┤");

            for (Eletrodomesticos eletro :e) {
                i++;
                System.out.printf("│%6d│ %-15s │ %-15s │ %-14s │",
                        (i), eletro.getMarca(), eletro.getTipo(), eletro.getCapacidade());
                System.out.println();

            }

            System.out.println("└──────┴─────────────────┴─────────────────┴────────────────┘");
            System.out.println();
            System.out.println();

        }


        /**
         * Adicinar a ArrayList <Eletrodomesticos> marca, tipo e capacidade </Eletrodomesticos> novos dados
         */

        public static void criar(ArrayList<Eletrodomesticos> e) {
            Scanner n = new Scanner(System.in);
            String marca = "";
            String tipo = "";
            String capacidade = "";

                System.out.print("Por favor informe a marca: ");
                marca = n.nextLine();
                System.out.println();

                System.out.print("Por favor informe o tipo: ");
                tipo = n.nextLine();
                System.out.println();

                System.out.print("Por favor informe a capacidade: ");
                capacidade = n.nextLine();
                System.out.println();

            e.add(new Eletrodomesticos(marca, tipo, capacidade));

            System.out.println();
            System.out.println("os dados foram adicionados corretamente!.");
            System.out.println("pode usar a opção 1 do menu para visualizar.");
            System.out.println();
            System.out.println();

        }


        /**
         * modificar dados ja existentes.
         */


        public static void modificar(ArrayList<Eletrodomesticos> e) {
            Scanner f = new Scanner(System.in);
            int indice = 0;

            System.out.print("Por favor, informe o codigo do produto a ser modificado: ");
            indice = Integer.parseInt(f.nextLine()) - 1;
            System.out.println();

            String marcaIntroduzida = "";
            String tipoIntroduzido = "";
            String capacidadeIntroduzido = "";


            if (indice < e.size()) {
                System.out.println("Marca atual: " + e.get(indice).getMarca());
                System.out.print("Por favor informe a nova Marca (aperte ENTER para não modificar os dados): ");
                marcaIntroduzida = f.nextLine();
                if (!marcaIntroduzida.equals("")) {
                    e.get(indice).setMarca(marcaIntroduzida);
                }

                System.out.println();
                System.out.println("Tipo atual: " + e.get(indice).getTipo());
                System.out.print("Por favor informe o novo Tipo (aperte ENTER para não modificar os dados): ");
                tipoIntroduzido = f.nextLine();
                if (!tipoIntroduzido.equals("")) {
                    e.get(indice).setTipo(tipoIntroduzido);
                }

                System.out.println();
                System.out.println("Capacidade atual: " + e.get(indice).getCapacidade());
                System.out.print("Por favor informe a capacidade (aperte ENTER para não modificar os dados): ");
                capacidadeIntroduzido = (f.nextLine());
                if (!capacidadeIntroduzido.equals("")) {
                    e.get(indice).setCapacidade(capacidadeIntroduzido);
                }

                System.out.println();

                System.out.println();
                System.out.println("os dados foram modificados corretamente.");
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

        public static void excluir(ArrayList<Eletrodomesticos> e) {
            Scanner f = new Scanner(System.in);

            System.out.print("Por favor, informe o número do registro a ser excluido: ");
            int indice = Integer.parseInt(f.nextLine());
            if (indice <= e.size()) {
                e.remove(indice -1);

                System.out.println();
                System.out.println("excelente, os dados foram excluidos corretamente!.");
                System.out.println();
                System.out.println();
            } else {
                System.out.println();
                System.out.println("desculpe, o registro informado não existe.");
                System.out.println("por favor, selecione outra opção do menu.");
                System.out.println();
                System.out.println();
            }

        }
}