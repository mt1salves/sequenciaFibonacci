import java.util.Scanner;

public class Fibonacci {

    static int sequenciaFibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return sequenciaFibonacci(n - 1) + sequenciaFibonacci(n - 2);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        System.out.println("Sequência de Fibonacci \n\n Menu: \n\n 1 - Exibir os 100 primeiros termos desta sequência; \n 2 - Exibir os 1000 termos desta sequência; \n 3 - Escolher quantos termos exibir desta sequência; \n 5 - Aperte qualquer botão para sair. \n");
        int verificador = input.nextInt();

        switch(verificador){
            case 1:
                for(int i = 1; i <= 100; i++){
                    System.out.println(sequenciaFibonacci(i));
                }
                break;
            case 2:
                for(int i = 1; i <= 1000; i++){
                    System.out.println(sequenciaFibonacci(i));
                }
                break;
            case 3:
                System.out.println("Insira o valor de quantos termos quer mostrar: ");
                int numero = input.nextInt();
                for(int i = 1; i <= numero; i++){
                    System.out.println(sequenciaFibonacci(i));
                }
                break;
            default:
                System.out.println("Saindo...");
                break;
        }
    }
}