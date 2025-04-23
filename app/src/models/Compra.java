package models;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private Double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Compra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(getValor(), outraCompra.getValor());
    }
}
