import java.util.*;

public class Fase1 {

	public static void main(String[] args) {
		
		String ciutat0;
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		
		System.out.println("Introduïu una d'aquestes ciutats: Barcelona, Madrid, Valencia, Malaga, Cadis, Santander");
		
		Scanner Nomi=new Scanner(System.in);
			
		System.out.println("Introdueix ciutat: ");
		ciutat0=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		ciutat1=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		ciutat2=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		ciutat3=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		ciutat4=Nomi.nextLine();
		System.out.println("Introdueix ciutat: ");
		ciutat5=Nomi.nextLine();
		System.out.println((ciutat0)+", "+(ciutat1)+", "+(ciutat2)+", "+(ciutat3)+", "+(ciutat4)+", "+(ciutat5));
		Nomi.close();
	}

}
