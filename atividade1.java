import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as notas
        double[] notas = new double[8];
        
        // Leitura das 8 notas
        System.out.println("Digite as 8 notas anuais do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // Cálculo das médias bimestrais
        double media1Bimestre = (notas[0] + notas[1]) / 2;
        double media2Bimestre = (notas[2] + notas[3]) / 2;
        double media3Bimestre = (notas[4] + notas[5]) / 2;
        double media4Bimestre = (notas[6] + notas[7]) / 2;
        
        // Cálculo das médias semestrais
        double media1Semestre = (media1Bimestre + media2Bimestre) / 2;
        double media2Semestre = (media3Bimestre + media4Bimestre) / 2;
        
        // Cálculo da média final
        double mediaFinal = (media1Semestre + media2Semestre) / 2;
        
        // Exibindo os resultados
        System.out.println("\nMédias Bimestrais:");
        System.out.println("1º Bimestre: " + media1Bimestre);
        System.out.println("2º Bimestre: " + media2Bimestre);
        System.out.println("1º Semestre: " + media1Semestre);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + media3Bimestre);
        System.out.println("4º Bimestre: " + media4Bimestre);
        System.out.println("2º Semestre: " + media2Semestre);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);
        
        scanner.close();
    }
}