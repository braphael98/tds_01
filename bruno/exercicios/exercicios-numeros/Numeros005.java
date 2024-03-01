public class numeros005 {
    public static void main(String[] args) {
        int num;

        for (int i = 0; i < args.length; i++) {
            int fatorial = 1;
            num = Integer.parseInt(args[i]);
            for (int j = num; j > 1; j--) {
                fatorial *= j;
            }
            System.out.println("Resultado da fatorial: " + fatorial);
        }

    }
}