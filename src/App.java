
public class App {

    public static void main(String[] args) {

        // Verifica se foi informado algum texto
        if (args.length == 0) {

            System.out.println("Informe palavras nos argumentos.");
            return;
        }

        // Contadores
        int quantidadePalavras = 0;
        int quantidadeVogais = 0;
        int palavrasPares = 0;
        int palavrasImpares = 0;

        // Percorre todas as palavras recebidas
        for (String palavra : args) {

            quantidadePalavras++;

            // Conta as vogais da palavra
            for (int i = 0; i < palavra.length(); i++) {

                char letra =
                        Character.toLowerCase(
                                palavra.charAt(i));

                if (letra == 'a'
                        || letra == 'e'
                        || letra == 'i'
                        || letra == 'o'
                        || letra == 'u') {

                    quantidadeVogais++;
                }
            }

            // Verifica se a quantidade de letras é par ou ímpar
            if (palavra.length() % 2 == 0) {

                palavrasPares++;

            } else {

                palavrasImpares++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de palavras: "
                + quantidadePalavras);

        System.out.println("Quantidade de vogais: "
                + quantidadeVogais);

        System.out.println("Palavras com quantidade de letras pares: "
                + palavrasPares);

        System.out.println("Palavras com quantidade de letras ímpares: "
                + palavrasImpares);
    }
}