public class Numeros003 {
    public static void main(String[] args) {
        for (int o = 0; o < args.length; o++) {
            if (Integer.parseInt(args[o]) % 2 == 0) {
                System.out.println(args[o] + " É PAR");
            } else {
                System.out.println(args[o] + " É IMPAR");

            }

        }

    }
}
