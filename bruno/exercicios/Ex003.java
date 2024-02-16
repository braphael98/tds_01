public class Ex003 {
    public static void main(String[] args) {
        String palavra = "";
        for (int pos = args.length - 1; pos > -1; pos--) {
            palavra += args[pos];
            if (pos > 0) {
                palavra += "-";
            }
        }
        System.out.println(palavra);
    }

}
