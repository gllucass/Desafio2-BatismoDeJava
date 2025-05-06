import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Ninja cadastraNinja(Scanner sc,int opc) {
        String nome,missao,nivelDificuldade,statusDaMissao;
        int idade;
        sc.nextLine();
        System.out.print("Digite o nome do Ninja: ");
        nome = sc.nextLine();
        System.out.print("Informe a idade do Ninja: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe qual a missão: ");
        missao = sc.nextLine();
        System.out.print("Informe qual a nivel dificuldade: ");
        nivelDificuldade = sc.nextLine();
        System.out.print("Informe qual a status da missão: ");
        statusDaMissao = sc.nextLine();
        return new Ninja(nome, idade, missao, nivelDificuldade, statusDaMissao, null);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        ArrayList<Ninja> ninjas = new ArrayList<>();
        ArrayList<Uchiha> ninjasUchiha = new ArrayList<>();
        do{
            System.out.println("\n\n----------Menu Principal----------");
            System.out.println("[1] - Cadastrar Ninja");
            System.out.println("[2] - Cadastrar Uchiha");
            System.out.println("[3] - Mostrar Ninjas");
            System.out.println("[4] - Mostrar Uchihas");
            System.out.println("[5] - Mudar habilidade dos Uchiha");
            System.out.println("[0] - Sair");
            System.out.print("Selecione uma opção: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Ninja novoNinja = cadastraNinja(sc,opc);
                        ninjas.add(novoNinja);
                    break;
                case 2:
                    Uchiha novoUchiha = (Uchiha)cadastraNinja(sc,opc);
                    ninjasUchiha.add(novoUchiha);
                    break;
                case 3:
                    for (Ninja ninja : ninjas) {
                        System.out.println(ninja.mostrarInformacoes());
                    }
                    break;
                case 4:
                    for (Uchiha ninja2 : ninjasUchiha) {
                        System.out.println(ninja2.mostrarInformacoes());
                    }
                    break;
                case 5:
                    if(ninjasUchiha.isEmpty()){
                        System.out.println("Nenhum Uchiha foi cadastrado");
                        break;
                    }
                    for (Uchiha ninja2 : ninjasUchiha) {
                        System.out.print("Informe a nova habilidade dos Uchihas: ");
                        sc.nextLine();
                        String habilidade = sc.nextLine();
                        ninja2.mudarHabilidade(habilidade);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção errada, tente novamente");
                    break;
            }
        }while (opc != 0);
        sc.close();
    }
}