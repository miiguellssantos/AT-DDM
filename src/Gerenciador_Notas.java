import java.util.Scanner;
import java.util.Arrays;
public class Gerenciador_Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0d;
        double maiorNota = 0d;
        double menorNota = 0d;
        double media = 0d;
        int qtdAcimaMedia = 0;
        int qtdAbaixoMedia = 0;
        int qtdAprovados = 0;
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("NOTA DO ALUNO " + (i+1) + ":");
            nota = scanner.nextDouble();
            notas[i] = nota;
        }

        for (double n : notas) {
            maiorNota = n;
            media = (media + n);
            if (n > maiorNota) {
                maiorNota = n;
            }

            if (n >= 6) {
                qtdAprovados++;
            }
        }

        menorNota = maiorNota;

        for (double n : notas){
            if(n < menorNota){
                menorNota = n;
            }
        }

        media = media/10;

        for (double i:notas){
            if(i > media){
                qtdAcimaMedia++;
            }else{
                qtdAbaixoMedia++;
            }
        }

        System.out.println("\n \n=============================\n\n" +
                "RELATÓRIO DE NOTAS\n\n" +
                "Maior nota: "+maiorNota+".\n" +
                "Menor mota: "+menorNota+".\n" +
                "Média da Turma: "+media+".\n" +
                "Alunos acima da média: "+qtdAcimaMedia+".\n" +
                "Alunos abaixo da média: "+qtdAbaixoMedia+".\n" +
                "Alunos aprovados: "+qtdAprovados+".\n" +
                "\n=============================\n\n");
    }
}
