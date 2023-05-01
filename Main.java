import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// citirea informatiilor despre angajati o facem din fisier
		
		Scanner fisier = new Scanner(new File("C:\\Users\\mariu\\eclipse-workspace\\Laborator6\\src\\angajati"));

		ArrayList<Angajat> lista_angajati = new ArrayList<>();
		
		while(fisier.hasNextLine()) {
			String informatie = fisier.nextLine();
			if(informatie != null) {
				String[] info = informatie.split(",");
				
				//procesam elementele vectorului info ca sa pot crea obiectul de tip angajat
				info[0] = info[0].replaceAll("\\s+" , "");
				info[2] = info[2].replaceAll("\\s+" , "");
				info[4] = info[4].replaceAll("\\s+" , ""); // spatiu \\s+
				
				int id = Integer.parseInt(info[0]);
				int an_nastere = Integer.parseInt(info[2]);
				double salariu = Double.parseDouble(info[4]);
				
				Angajat a = new Angajat(id ,info[1],an_nastere,info[3],salariu);
				lista_angajati.add(a);
				
			}
		}
		
		
		
		
		
//			for(Angajat a:lista_angajati) {
//				a.afisare();
//			}
	

		
		Evidenta_angajati evidenta = new Evidenta_angajati(lista_angajati);
		
		
		evidenta.addAngajat(new Angajat(5,"Ionel Banel",1996,"contabil",7044));
		
//		evidenta.afisareLista();
		
		evidenta.deleteAngajat(5);
		evidenta.afisareLista();
	}
	
	

}
