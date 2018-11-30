package lojatestsdaisy;

public class Produto {
    double preco;
    String nome;
    int quantidade;
    int id;


    
    public void ini_produto(String nome, int id,int quantidade, double preco){
        this.nome=nome;
        this.id = id;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

}
