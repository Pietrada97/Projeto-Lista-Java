import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os nomes separados por sexo
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos (formato: nome,sexo). Exemplo: João,M ou Maria,F");
        System.out.println("Digite 'sair' para finalizar.");

        while (true) {
            System.out.print("Digite: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Usa split para separar nome e sexo
            String[] partes = entrada.split(",");
            if (partes.length != 2) {
                System.out.println("Formato inválido! Use: nome,sexo");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Use M ou F.");
            }
        }

        // Exibindo os grupos
        System.out.println("\nGrupo Masculino:");
        System.out.println(String.join(", ", grupoMasculino));

        System.out.println("\nGrupo Feminino:");
        System.out.println(String.join(", ", grupoFeminino));

        scanner.close();
    }
}
