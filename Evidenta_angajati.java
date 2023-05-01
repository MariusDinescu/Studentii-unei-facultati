import java.util.ArrayList;


public class Evidenta_angajati {

	private ArrayList<Angajat> lista_angajati = new ArrayList<>();
	

	public Evidenta_angajati(ArrayList<Angajat> lista_angajati) {
//		super();
		this.lista_angajati = lista_angajati;
	}

	public ArrayList<Angajat> getLista_angajati() {
		return lista_angajati;
	}

	public void setLista_angajati(ArrayList<Angajat> lista_angajati) {
		this.lista_angajati = lista_angajati;
	}
	
	public void addAngajat(Angajat adding) {
		lista_angajati.add(adding);
		
		
	}
	public void deleteAngajat(int id) {
		
		for(Angajat a:lista_angajati) {
			if(a.getId() == id) {
				lista_angajati.remove(a);
				return;
			}
		}
	}	
		public void afisareLista() {
			for(Angajat a:lista_angajati) {
//				a.afisare();
				System.out.println(a);
			}
			
	}
	
	
	
}
