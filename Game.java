public class Game {
    private String nome;
    private String categoria;
    private double preco;

    // Construtor
    public Game(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    // Exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Jogo: " + nome + " | Categoria: " + categoria + " | Preço: R$ " + preco);
    }
}