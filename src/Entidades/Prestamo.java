package Entidades;

public class Prestamo {

    private Integer nroPrestamo;

    private Double monto;

    private Double interes;

    private Double saldoAdeudado;

    private Double acumuladoPagado;

    public Prestamo() {
    }

    public Prestamo(Integer nroPrestamo, Double monto, Double interes, Double saldoAdeudado, Double acumuladoPagado) {
        this.nroPrestamo = nroPrestamo;
        this.monto = monto;
        this.interes = interes;
        this.saldoAdeudado = saldoAdeudado;
        this.acumuladoPagado = acumuladoPagado;
    }

    public Integer getNroPrestamo() {
        return nroPrestamo;
    }

    public void setNroPrestamo(Integer nroPrestamo) {
        this.nroPrestamo = nroPrestamo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getSaldoAdeudado() {
        return saldoAdeudado;
    }

    public void setSaldoAdeudado(Double saldoAdeudado) {
        this.saldoAdeudado = saldoAdeudado;
    }

    public Double getAcumuladoPagado() {
        return acumuladoPagado;
    }

    public void setAcumuladoPagado(Double acumuladoPagado) {
        this.acumuladoPagado = acumuladoPagado;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "nroPrestamo=" + nroPrestamo + ", monto=" + monto + ", interes=" + interes + ", saldoAdeudado=" + saldoAdeudado + ", acumuladoPagado=" + acumuladoPagado + '}';
    }

}
