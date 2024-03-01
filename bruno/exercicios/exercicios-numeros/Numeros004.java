public class Numeros004 {
    public static void main(String[] args) {
        float maior = Float.parseFloat(args[0]);
        
        for(int i = 0 ; i < args.length; i++){
            System.out.println(args[i]);
            if(Float.parseFloat(args[i]) > maior){
                maior = Float.parseFloat(args[i]);
            }
        }
        System.out.println("Este numero: "+maior+" é o maior da lista");
    }

}
