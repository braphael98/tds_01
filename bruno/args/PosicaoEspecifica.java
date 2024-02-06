public class PosicaoEspecifica{
    public static void main(String[]args){
        String nome = args [1];
        String posicao = args[0];
        int convertido = Integer.parseInt(posicao);
        System.out.println(nome.charAt(convertido));
    }
}