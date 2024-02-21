public class Ex009 {
    public static void main(String[] args) {
        String palavra = "";
        System.out.print(args[0].toLowerCase());
        for(int i = 1; i < args.length; i++){
            for (int j = 0; j < args[i].length(); j++){
                palavra = args[i].substring(0, 1).toUpperCase() + args[i].substring(1).toLowerCase();
            }
            System.out.print(palavra);
            

        }
    }
    
}
// Algoritimo para converter em camelCase;
