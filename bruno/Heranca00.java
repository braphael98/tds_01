public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
       Cachorro cao1 = new Cachorro("Clovis");
        System.out.println(cao1);
        Cachorro cao2 = new Cachorro ("Adelino");
        System.out.println(cao2);
        Cachorro cao3 = new Cachorro ("Rubens");  
    }

}

abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);
    }

   public String toString () {  //Representa a classe atual em forma de string;//
    return
        "Nome: "+this.nome+"\n"+
        "Raça: "+this.raca+ "\n"+        
        "cor:"  +this.cor+ "\n"+
        "idade: "+this.idade+ "\n"+
        "Som: " +this.onomatopeia;
    }

}

class Cachorro extends Animal {
    Cachorro(String nome){ // metodo construtor, o que define o cão !
        this.nome = nome;
        this.onomatopeia = "au,au";
        this.raca = "vira lata";
        this.cor = "preto";
        this.idade = 2;

    }
}






