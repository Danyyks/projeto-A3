import java.util.Scanner;
import java.util.ArrayList;

// projeto feito de acordo com o que foi pedido
// e também utilizando apenas o que foi passado como matéria para estudar

public class Sistema {
    public static void main(String[] args) {

        // segue abaixo variaveis para mudar a cor do "sout" para roxo
        // apenas pela estética visual
        String ROXO = "\u001B[35m";
        String RESET = "\u001B[0m";

        Scanner entrada = new Scanner(System.in);

        System.out.println(ROXO + "--- FOLHA DE PAGAMENTO ---" + RESET );

        final double SALARIO_BASE = 2000;

        ArrayList<String> funcionarios = new ArrayList<>();

        double soma;

        int opcao = -1;
        do {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Funcionário padrão");
            System.out.println("2 - Funcionário comissionado");
            System.out.println("3 - Funcionário produção");
            System.out.println("4 - Gerar folha de pagamento");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção desejada: ");

            if(!entrada.hasNextInt()) {
                System.out.println("Digite um número válido!");
                entrada.nextLine();
                continue;
            }

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Insira nome do funcionário");
                    String nome1 = entrada.nextLine();
                    System.out.println("Insira o número de matrícula");
                    String matricula1 = entrada.nextLine();
                    String dados1 =  "Padrão - " +  nome1 + " - " + matricula1 + " - " + SALARIO_BASE;
                    funcionarios.add(dados1);
                    System.out.println("Funcionário cadastrado: ");
                    System.out.println(dados1);
                    break;

                case 2:
                    System.out.println("Insira nome do funcionário");
                    String nome2 = entrada.nextLine();
                    System.out.println("Insira o número de matrícula");
                    String matricula2 = entrada.nextLine();
                    System.out.println("Digite o total de vendas");
                    double vendas = entrada.nextDouble();
                    if(vendas < 0) {
                        System.out.println("Vendas não podem ser negativas!");
                        break;
                    }
                    entrada.nextLine();
                    System.out.println("Digite a porcentagem de comissão");
                    double percentual = entrada.nextDouble();
                    if(percentual < 0) {
                        System.out.println("Percentual não pode ser negativo!");
                        break;
                    }
                    entrada.nextLine();
                    double comissao = vendas *(percentual / 100);
                    double salarioFinal = SALARIO_BASE + comissao;
                    String dados2 = "Comissionado - " + nome2 + " - " + matricula2 + " - " + salarioFinal;
                    funcionarios.add(dados2);
                    System.out.println("Funcionário cadastrado: ");
                    System.out.println(dados2);
                        break;

                case 3:
                    System.out.println("Insira nome do funcionário");
                    String nome3 = entrada.nextLine();
                    System.out.println("Insira o número de matrícula");
                    String matricula3 = entrada.nextLine();
                    System.out.println("Digite a quantidade de peças produzidas");
                    double quantidadePeca = entrada.nextDouble();
                    entrada.nextLine();
                    if(quantidadePeca < 0) {
                        System.out.println("Quantidade de peças não pode ser negativa!");
                        break;
                    }
                    System.out.println("Digite o valor por peça produzida");
                    double valorPeca = entrada.nextDouble();
                    if(valorPeca < 0) {
                        System.out.println("Valor da peça não pode ser negativo!");
                        break;
                    }
                    entrada.nextLine();
                    double producao = quantidadePeca * valorPeca;
                    soma = SALARIO_BASE + producao; // cálculo
                    String dados3 = "Produção - " + nome3 + " - " + matricula3 + " - " + soma;
                    funcionarios.add(dados3);
                    System.out.println("Funcionário cadastrado: ");
                    System.out.println(dados3);
                    break;

                case 4:
                    System.out.println("Folha de Pagamento");

                    for(int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(funcionarios.get(i));
                    }

                    break;

                case 0:
                    System.out.println("Encerrando sistema...");

                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao !=0);

        entrada.close();
    }
}