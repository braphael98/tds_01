public class numeros001 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += Integer.parseInt(args[i]);
        }
        System.out.println("Total da soma dos numeros digitados: " + total);

    }

}
