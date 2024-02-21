public class Ex008 {
    public static void main(String[] args) {
        String palavra = "";
        for (int i = 0; i < args.length; i++) {
            palavra += args[i];
            if (i < args.length - 1) {
                palavra += "-";
            }

        }
        System.out.println(palavra);
    }
}
//Exercicio para fazer espetinho-case;
