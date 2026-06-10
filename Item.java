public class Item {
    String nome;
    double preco;

    public void aplicarCupom(double desconto) {
        preco = preco + desconto;
    }

}
