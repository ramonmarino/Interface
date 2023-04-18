package Montadora;

import java.util.Scanner;

public class Pista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro carro = new Carro("azul","volkswagen","elétrico");
        boolean aux = true;
        while(aux){
            System.out.println("ESCOLHA A OPÇÃO DESEJADA: (1/2/3/4): ");
            int resp = input.nextInt();
            switch (resp){
                case 1:
                    System.out.println(carro.frente());
                    break;
                case 2:
                    System.out.println(carro.atras());
                    break;

                case 3:
                    System.out.println(carro.esquerda());
                    break;

                case 4:
                    System.out.println(carro.direita());
                    break;
                default:
                    aux = false;
                    System.out.println("opção de inválida!");
                    break;
            }

        }






        input.close();
    }








}

