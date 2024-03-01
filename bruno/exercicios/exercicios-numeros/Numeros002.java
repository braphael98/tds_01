public class numeros002 {
    public static void main(String[] args) {
        float total = 0.0f;
        for (int i = 0; i < args.length; i++) {
            total += Float.parseFloat(args[i]);
        }
        total /= args.length;
        System.out.println("Media dos numeros é: "+total);
    }
}
