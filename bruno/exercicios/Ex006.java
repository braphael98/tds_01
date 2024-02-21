public class Ex006 {
    public static void main(String[] args) {
        String palavra = "";
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                palavra = args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase(); 
                

            }
            System.out.print(palavra);
            if(i < args.length -1){
                System.out.print(" ");
            }
        } 
            System.out.println();
    }

}
//Exercicio para converter em Title Case;
