public class Ex007 {
    public static void main(String[] args) {
        String palavra = "";
        for (int i = 0; i < args.length; i++) {
            palavra += args[i].toLowerCase();
            if (i < args.length - 1) {
                palavra += "_";
            }

        }
        System.out.println(palavra);
    }
}
//Exercicio para fazer snake_case;
