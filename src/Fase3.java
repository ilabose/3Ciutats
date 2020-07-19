import java.util.*;

		public class Fase3 {

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
						
						String [] arrayCities=new String[6];
						arrayCities[0] = ciutat0;
						arrayCities[1] = ciutat1;
						arrayCities[2] = ciutat2;
						arrayCities[3] = ciutat3;
						arrayCities[4] = ciutat4;
						arrayCities[5] = ciutat5;
						
						String [] modifiedCities=new String[6];	
						
							for (int i=0; i<arrayCities.length; ++i) {
								modifiedCities[i] = arrayCities[i].replace("a", "4");
						}
							Arrays.sort(modifiedCities);
					        System.out.println("Ciutats per ordre alfabètic: "+ Arrays.toString(modifiedCities));
			}
						
		}