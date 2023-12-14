public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Pastor fred = new Pastor();
        fred.fazBarulho();
        fred.descrever();
        
        Bulldog rufus = new Bulldog();
        rufus.fazBarulho();
        rufus.descrever();

        Salsicha vina = new Salsicha();
        vina.fazBarulho();
        vina.descrever();
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

    public void descrever() {
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: "+ this.nome);

    }

}

class Cachorro extends Animal {
    Cachorro() { // metodo construtor, o que define o cão !
        this.onomatopeia = "au au";
    }
}

class Bulldog extends Cachorro {
    Bulldog(){
    this.raca = "Bulldog";
    this.cor = "Preto";
    this.nome = "Rufus";
    this.idade = 2;
    }
}
class Salsicha extends Cachorro{
    Salsicha(){
    this.raca = "Salsicha";
    this.cor = "Preto";
    this.nome = "Vina";
    this.idade = 2;
    }
}
class Pastor extends Cachorro{
    Pastor(){
    this.raca = "Pastor-Alemão";
    this.cor = "Preto e marrom";
    this.nome = "Fred";
    this.idade = 9;
    }

}





