package Banco;

public class Cuenta {
	    
	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInterés;
	    public Cuenta ()
	    {
	    }
	   public Cuenta (String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        setSaldo(sal);
	        setTipoInterés(tipo);
	    }
	   public double saldo ()
	    {
	        return getSaldo();
	    }
	    public void ingresar(double cantidad) throws Exception
	    {
	        ingresarDinero(cantidad);
	    }
		private void ingresarDinero(double cantidad) throws Exception {
			if (cantidad<0){
	            throw new Exception("No se puede ingresar una cantidad negativa");}
	        setSaldo(getSaldo() + cantidad);
		}


	    public void retirar (double cantidad) throws Exception
	    {
	        retirarDinero(cantidad);
	    }
		private void retirarDinero(double cantidad) throws Exception {
			if (cantidad < 0){
	            throw new Exception ("No se puede retirar una cantidad negativa");}
	        if (saldo()< cantidad){
	            throw new Exception ("No se hay suficiente saldo");}
	        setSaldo(getSaldo() - cantidad);
		}
	    public void setSaldo(double saldo) {
	    this.saldo = saldo;
	  }
		String getNombre() {
			return nombre;
		}
		void setNombre(String nombre) {
			this.nombre = nombre;
		}
		String getCuenta() {
			return cuenta;
		}
		void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		double getSaldo() {
			return saldo;
		}
		double getTipoInterés() {
			return tipoInterés;
		}
		void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
	}
