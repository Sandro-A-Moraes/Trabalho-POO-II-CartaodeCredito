package models;

import java.util.ArrayList;

public class CartaoDeCredito {
    private Double limite;
    private Double saldo;
    private ArrayList<Compra> compras;

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

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public CartaoDeCredito(Double limite, Double saldo, ArrayList<Compra> compras) {
        this.limite = limite;
        this.saldo = saldo;
        this.compras = compras;
    }
}
