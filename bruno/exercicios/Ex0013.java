public class Ex0013 {
    public static void main(String[] args) {
        String vogais = "AEIOUaeiou";
        String palavra = "";
        int contagem = 0;
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
            for(int j = 0; j < args[i].length(); j++){
                contagem++;
            }
            System.out.println(contagem);
            
        }
       
        
    }
}
// esse é o que conta vogal da palavra !