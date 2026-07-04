// Superclasse
class Animal {
    protected String nome;

    // Construtor da classe base
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método que será sobrescrito
    public void fazerSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

// Subclasse que herda de Animal
class Cachorro extends Animal {

    // Construtor da classe derivada
    public Cachorro(String nome) {
        super(nome); // Chama o construtor de Animal para inicializar o atributo 'nome'
    }

    // Sobrescrita do comportamento (Polimorfismo)
    @Override
    public void fazerSom() {
        System.out.println(this.nome + " diz: Au au!");
    }
}

// Classe principal para testar a implementação
public class Main {
    public static void main(String[] args) {
        // Instancia a subclasse
        Cachorro meuCachorro = new Cachorro("Rex");
        
        // Executa o método sobrescrito
        meuCachorro.fazerSom(); // Saída: Rex diz: Au au!
    }
}