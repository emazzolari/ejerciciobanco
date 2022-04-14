package Entidades;

//@author Juli

public class Cuenta {
    
    private Integer nroCta;
    
    private String tipo;
    
    private Double saldo;

    public Cuenta() {
    }

    public Cuenta(Integer nroCta, String tipo, Double saldo) {
        this.nroCta = nroCta;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Integer getNroCta() {
        return nroCta;
    }

    public void setNroCta(Integer nroCta) {
        this.nroCta = nroCta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nroCta=" + nroCta + ", tipo=" + tipo + ", saldo=" + saldo + '}';
    }
    
    

}
