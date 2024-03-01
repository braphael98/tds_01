public class Numeros006 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            int check = 0;
            if(number < 2){
             System.out.println("Não é primo");
            }else{
                for(int k = 2; k < number; k++){
                    if(number % k == 0){
                        System.out.println(number+ " Não é primo");
                        check++;
                        break;
                    }
                }
                
                if(check == 0){
                    System.out.println(number + " é primo");

                }
            }
        }
    }
}
