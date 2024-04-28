import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("|-- Processo Seletivo --|");
        System.out.print("Digite o salário pretendido: ");
        double salarioPretendido = scan.nextDouble();
        scan.close();

        analisarCandidato(salarioPretendido);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioPretendido > salarioBase) {
            System.out.println("Aguarde o resultado dos demais candidatos.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contraproposta.");
        } else {
            System.out.println("Ligar para o candidato.");
        }
    }
}
