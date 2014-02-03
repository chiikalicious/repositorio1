package Fechas;

public class PruebaFecha{

	public static void main(String[] args) {
		Fecha fechaCorrecta = new Fecha (20, 6, 2008);
		Fecha mesMal1 = new Fecha (21, 0, 3000);
		Fecha mesMal2 = new Fecha (21, 13, 3000);
		Fecha diaMal1 = new Fecha (0, 11, 2000);
		Fecha diaMal2 = new Fecha (32, 11, 2000);
		Fecha diaMalNoviembre = new Fecha (31, 11, 2000);
		Fecha diaBienDiciembre = new Fecha (31, 12, 2000);
		Fecha diaMalFebrero = new Fecha (30, 2, 2008);
		Fecha diaBienFebreroBisiesto1 = new Fecha (29, 2, 2008);
		Fecha diaBienFebreroBisiesto2 = new Fecha (29, 2, 2000);
		System.out.println(fechaCorrecta.valida());
		System.out.println(mesMal1.valida());


	}

}

