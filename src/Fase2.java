import java.util.Arrays;

import javax.swing.JOptionPane;

		public class Fase2 {

			public static void main(String[] args) {
				System.out.println("Introduïu una d'aquestes ciutats: Barcelona, Madrid, Valencia, Malaga, Cadis, Santander");
				String ciutat0=JOptionPane.showInputDialog("Introdueix ciutat: ");
				String ciutat1=JOptionPane.showInputDialog("Introdueix ciutat: ");
				String ciutat2=JOptionPane.showInputDialog("Introdueix ciutat: ");
				String ciutat3=JOptionPane.showInputDialog("Introdueix ciutat: ");
				String ciutat4=JOptionPane.showInputDialog("Introdueix ciutat: ");
				String ciutat5=JOptionPane.showInputDialog("Introdueix ciutat: ");
				
				String [] arrayCities=new String[6];
				arrayCities[0] = ciutat0;
				arrayCities[1] = ciutat1;
				arrayCities[2] = ciutat2;
				arrayCities[3] = ciutat3;
				arrayCities[4] = ciutat4;
				arrayCities[5] = ciutat5;
					Arrays.sort(arrayCities);
			        System.out.println("Nom de les ciutats ordenadas per ordre alfabetic : " + Arrays.toString(arrayCities));
				}
	}
