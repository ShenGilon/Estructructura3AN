package Taller1;

public class Datos {

    public String Nombre = "pepe";
    public int cc = 1234567891;
    public String Direccion = "Calle 4 8-30";
    private int sueldo = 8000000;
    private long celular = 310636363;
    private long cuenta = 12333;

    /**
     * @return the sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the celular
     */
    public long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    }

    /**
     * @return the cuenta
     */
    public long getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }

}
