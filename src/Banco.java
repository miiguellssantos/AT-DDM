import java.util.Scanner;
public class Banco {

    // Alunos: Gustavo Trizotti e Miguel Santos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0d;
        double deposito = 0d;
        double saque = 0d;
        boolean contaAberta = false;

        int menu = 0;

        while (menu != 6) {
            System.out.println("SISTEMA BANCÁRIO \n \n" +
                    "1 - ABRIR CONTA \n" +
                    "2 - FAZER DEPÓSITO \n" +
                    "3 - FAZER SAQUE \n" +
                    "4 - EXIBIR SALDO \n" +
                    "5 - FECHAR CONTA\n" +
                    "6 - FIM");
            menu = scanner.nextInt();
            if (menu == 1) {
                if (!contaAberta){
                    contaAberta = true;
                    System.out.println("CONTA ABERTA COM SUCESSO.");
                }else{
                    System.out.println("JÁ EXISTE UMA CONTA ABERTA.");
                }
            }
            else if(menu == 2){
                if (!contaAberta){
                    System.out.println("ABRA UMA CONTA PRIMEIRO.");
                }else{
                    System.out.println("DIGITE O VALOR A SER DEPOSITADO:");
                    deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("DIGITE UM VALOR VÁLIDO!");
                    } else {
                        saldo += deposito;
                        System.out.println("FORAM ADICIONADOS R$ " + deposito +" COM SUCESSO.");
                    }
                }
            }else if(menu == 3){
                if (!contaAberta){
                    System.out.println("ABRA UMA CONTA PRIMEIRO.");
                }else{
                    System.out.println("DIGITE O VALOR A SER SACADO:");
                    saque = scanner.nextDouble();
                    if (saque > saldo){
                        System.out.println("SALDO INSUFICIENTE.");
                    } else{
                        saldo -= saque;
                        System.out.println("FORAM RETIRADOS R$ "+saque+" COM SUCESSO.");
                    }
                }
            }else if (menu == 4){
                if (!contaAberta) {
                    System.out.println(("ABRA UMA CONTA PRIMEIRO."));
                } else {
                    System.out.println(("\nSALDO ATUAL: R$ " + saldo + "\n"));
                }
            }
            else if(menu == 5) {
                if (!contaAberta) {
                    System.out.println("VOCẼ DEVE ABRIR UMA CONTA PARA FECHAR!");
                } else {
                    System.out.println("CONTA FECHADA COM SUCESSO.");
                    contaAberta = false;
                    saldo = 0d;
                }
            }else if (menu > 6){
                System.out.println("Número inválido.");
            }
        }
        System.out.println("Obrigado por usar nosso sistema. :)");
    }
}
