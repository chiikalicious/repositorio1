package Banco;

import java.util.Scanner;

public class Main {
	
	    static Scanner  dato=new Scanner(System.in);
	   
	    public static void main(String[] args) {
	        Cuenta cuenta1;
	        double saldoActual;
	        
	        cuenta1 = new Cuenta("Juan López","1000-2365-85-123456789",2500,0);
	        operativaCuenta(cuenta1, 0.00f);       
	                
	        saldoActual = cuenta1.saldo();
	        System.out.println("El saldo actual es "+ saldoActual );
	    }

		private static void operativaCuenta(Cuenta cuenta1, float cuenta) {
			try
	        {
	        	cuenta1.retirar(2300);
	        } catch (Exception e){
	        	System.out.println("Fallo al retirar");
	        }
	        try 
	        {
	        	System.out.println("Ingreso en cuenta");
	        	cuenta1.ingresar(-2300);
	        } catch (Exception e){
	        	System.out.println("Fallo al ingresar");
	        }
	        
	    	/**String saludo = "Hola Mundo";
			String v=saludo;
			System.out.println(saludo);**/
		}
	    
	}