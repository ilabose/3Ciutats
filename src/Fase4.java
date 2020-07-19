import java.util.*;
public class Fase4 {

	public static void main(String[] args) {
		
		System.out.println("Introduïu una d'aquestes ciutats: Barcelona, Madrid, Valencia, Malaga, Cadis, Santander");
		
		Scanner Nomi=new Scanner(System.in);
			
		System.out.println("Introdueix ciutat: ");
		String ciutat0=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		String ciutat1=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		String ciutat2=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		String ciutat3=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		String ciutat4=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		String ciutat5=Nomi.nextLine();
		Nomi.close();
		
		char [] arrayBarc = ciutat0.toCharArray();
		char [] arrayMadr = ciutat1.toCharArray();
		char [] arrayVale = ciutat2.toCharArray();
		char [] arrayMala = ciutat3.toCharArray();
		char [] arrayCadi = ciutat4.toCharArray();
		char [] arraySant = ciutat5.toCharArray();
		
		for (int i = arrayBarc.length - 1; i >= 0; i--) {
		   System.out.print(arrayBarc[i]);
		}
		System.out.print("  ");
		for (int i = arrayMadr.length - 1; i >= 0; i--) {
			System.out.print(arrayMadr[i]);
		}
		System.out.print("  ");
		for (int i = arrayVale.length - 1; i >= 0; i--) {
			System.out.print(arrayVale[i]);
		}
		System.out.print("  ");
		for (int i = arrayMala.length - 1; i >= 0; i--) {
			System.out.print(arrayMala[i]);	
		}
		System.out.print("  ");
		for (int i = arrayCadi.length - 1; i >= 0; i--) {
			System.out.print(arrayCadi[i]);
		}
		System.out.print("  ");
		for (int i = arraySant.length - 1; i >= 0; i--) {
			System.out.print(arraySant[i]);
		}
	}
}
