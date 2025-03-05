import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista geral para armazenar todos os nomes (independente do sexo)
        List<String> listaNomes = new ArrayList<>();

        // Listas separadas para masculino e feminino
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Cadastro de pessoas - Digite 'sair' para finalizar.");

        // Coletar nomes e sexos
        while (true) {
            System.out.print("Digite nome e sexo (formato: nome,sexo - Exemplo: João,M ou Maria,F): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split(",");

            if (partes.length != 2) {
                System.out.println("Formato inválido! Use: nome,sexo");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            listaNomes.add(nome); // Adiciona na lista geral

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Use M ou F.");
            }
        }

        // Ordenar a lista de todos os nomes
        Collections.sort(listaNomes);

        // Mostrar lista ordenada
        System.out.println("\nLista completa de nomes (em ordem alfabética):");
        System.out.println(String.join(", ", listaNomes));

        // Mostrar grupos separados
        System.out.println("\nGrupo Masculino:");
        System.out.println(String.join(", ", grupoMasculino));

        System.out.println("\nGrupo Feminino:");
        System.out.println(String.join(", ", grupoFeminino));

        scanner.close();
    }
}
