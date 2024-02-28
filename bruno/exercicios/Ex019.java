public class Ex019 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String palavra = args[i].toUpperCase();

            for (char letra = 'A'; letra <= 'Z'; letra++) {
                int contagem = 0;
                for (int j = 0; j < palavra.length(); j++) {
                    if (palavra.charAt(j) == letra) {
                        contagem++;
                    }

                }
                if (contagem > 1) {
                    System.out.println(letra + "- NUMERO DE LETRAS REPETIDAS -"+ contagem);
                }
               
            }
            System.out.print(palavra + " ");
        }
        System.out.println();
    }
}
