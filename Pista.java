package Montadora;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
            CHECK LIST

Preciso fazer um software que faça....

         Passo 1- Adicionar mais uma opção de automóvel(caminhão) para o usuário.

         Passo 2- O caminhão ter as mesmas características dos carros.

         Passe 3- nesse passo, vou adicionar uma quantidade de automóveis de acordo com que o
         usuário desejar.

         Passo 4- Fazer a escolha de qual automóvel o usuário quer usar, carro ou caminhão.

         Passo 5- Fazer a personalização de acordo com atributos disponíveis, na cor,modelo e tipo que o
         usuário desejar.

         Passo 6- Adicionar os automóveis fabricados no "catálago" para o usuário

         Passo 7- Depois que o usuário escolher o automóvel desejado oferecer para ele uma direção  na qual ele
         deseja ir com o automóvel selecionado.

         Passo 8- Oferecer para o usuário um critério para ele encerrar o programa ou continuar com outra outra opção
         Nota: O programa não deve ser encerrado até o usuário desejar.

         Passo 9- programa encerrado.




 */
public class Pista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<CarroFuncoes> carrosCadastros = new ArrayList<>();

        System.out.print("DEFINA A QUANTIDADE DE AUTOMÓVEIS A SEREM FABRICADOS: ");
        int resposta = input.nextInt();


        for (int i = 1; i <= resposta; i++) {
            System.out.println("Deseja fabricar carro ou caminhão?\n1 Carro\n2 Caminhão");
            int escolha = input.nextInt();
            System.out.print("Qual a cor ? ");
            String corCarro = input.next();
            System.out.print("Qual o modelo? ");
            String modeloCarro = input.next();
            System.out.print("Qual o combustivel? ");
            String tipoCarro = input.next();

            if (escolha == 1) {
                carrosCadastros.add(new Carro(corCarro, modeloCarro, tipoCarro));

            } else {
                carrosCadastros.add(new Caminhao(corCarro, modeloCarro, tipoCarro));

            }

        }

            boolean isTrue = true;
            while (isTrue) {

               for(CarroFuncoes carro : carrosCadastros) {
                    System.out.println(carrosCadastros.indexOf(carro) + 1 + " " + carro);
                }

                System.out.println("Para sair digite uma opção fora do intervalo!");

                System.out.print("Qual veiculo deseja usar: ");
                int opcao = input.nextInt();
                if(opcao > carrosCadastros.size() || opcao <= 0 ) {
                    System.out.println("Saindo....");
                    break;
                }

                CarroFuncoes automovelSelecionado = carrosCadastros.get(opcao -1) ;

                System.out.println("Selecione a direção:\n1-Frente\n2-Tras\n3-Esquerda\n4-Direita");

                int direcao = input.nextInt();
                switch (direcao) {
                    case 1:
                        System.out.println(automovelSelecionado.frente());
                        break;

                    case 2:
                        System.out.println(automovelSelecionado.atras());
                        break;

                    case 3:
                        System.out.println(automovelSelecionado.esquerda());
                        break;

                    case 4:
                        System.out.println(automovelSelecionado.direita());
                        break;

                    default:
                        isTrue = false;
                        System.out.println("opção de inválida!");
                        break;

                }



            }

            input.close();
        }


    }












