import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private double saldo;
    private List<Game> biblioteca;

    // Construtor
    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.biblioteca = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para adicionar saldo!");
        }
    }

    // Comprar jogo
    public void comprarJogo(Game game) throws Exception {
        if (game.getPreco() > saldo) {
            throw new Exception("Saldo insuficiente para comprar o jogo: " + game.getNome());
        } else {
            saldo -= game.getPreco();
            biblioteca.add(game);
            System.out.println("Jogo comprado com sucesso: " + game.getNome());
        }
    }

    // Exibir jogos do cliente
    public void exibirBiblioteca() {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vazia!");
        } else {
            System.out.println("Jogos de " + nome + ":");
            for (Game game : biblioteca) {
                game.exibirDetalhes();
            }
        }
    }

    // Filtrar por categoria
    public void filtrarPorCategoria(String categoria) {
        System.out.println("Jogos da categoria: " + categoria);
        for (Game game : biblioteca) {
            if (game.getCategoria().equalsIgnoreCase(categoria)) {
                game.exibirDetalhes();
            }
        }
    }

    // Filtrar por preço
    public void filtrarPorPreco(double maxPreco) {
        System.out.println("Jogos com preço até R$ " + maxPreco);
        for (Game game : biblioteca) {
            if (game.getPreco() <= maxPreco) {
                game.exibirDetalhes();
            }
        }
    }
}