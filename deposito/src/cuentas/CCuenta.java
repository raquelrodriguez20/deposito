package cuentas;

/**
 * Esta clase simula los movimientos de una cuenta bancaria.
 * 
 * @author raquel
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

/**
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/**
 * 
 * @return Saldo actual
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * 
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}
	
/**
 * 
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

/**
 * 	
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

/**
 * 
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

/**
 * 
 * @param tipoInteres
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}