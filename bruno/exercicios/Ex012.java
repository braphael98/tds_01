public class Ex012 {
    public static void main(String[] args) {
        String vogais = "AEIOUaeiou";
        char pegaLetra;
        int contagem = 0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {
                pegaLetra = args[i].charAt(j);

                for (int k = 0; k < vogais.length(); k++) {
                    if (pegaLetra == vogais.charAt(k)) {
                        contagem++;
                        break;
                    }
                }

            }

        }
        System.out.println(contagem);
    }
}
//esse é o que conta vogal da palavra !