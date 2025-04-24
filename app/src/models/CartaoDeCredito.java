package models;

import java.util.ArrayList;

public class CartaoDeCredito {
    private Double limite;
    private Double saldo;
    private ArrayList<Compra> compras = new ArrayList<Compra>();

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public boolean realizarCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public CartaoDeCredito(Double limite) {
        this.limite = limite;
        this.saldo = limite;
    }
}
