public class Ex005 {
    public static void main(String[] args) {
        String palavras ="";

        for(int pos = 0; pos < args.length; pos++){
            palavras += args[pos].toUpperCase();
            if(pos < args.length){
                    palavras += " ";
            }
        }
        System.out.println(palavras);
    }
    
}