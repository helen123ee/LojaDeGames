public class Main {
    public static void main(String[] args) {
        try {
            // Criando cliente
            Cliente cliente1 = new Cliente("Helen", 50);

            // Criando jogos
            Game g1 = new Game("Minecraft", "Aventura", 30);
            Game g2 = new Game("FIFA", "Esporte", 60);
            Game g3 = new Game("The Sims", "Simulação", 40);

            // Tentando comprar jogos
            cliente1.comprarJogo(g1);
            cliente1.comprarJogo(g2); // deve lançar exceção por saldo insuficiente

            // Exibir biblioteca
            cliente1.exibirBiblioteca();

            // Adicionar saldo
            cliente1.adicionarSaldo(100);

            // Comprar outro jogo
            cliente1.comprarJogo(g3);

            // Filtrar
            cliente1.filtrarPorCategoria("Aventura");
            cliente1.filtrarPorPreco(50);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}