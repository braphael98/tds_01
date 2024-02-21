public class Ex010 {
    public static void main(String[] args) {
        String palavra = "";
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                palavra = args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase(); 
                

            }
            System.out.println(palavra);
           
            }
        } 
            
    }


//Exercicio para converter em PascalCase
