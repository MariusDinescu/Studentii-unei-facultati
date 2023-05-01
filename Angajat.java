
public class Angajat {

	private static final double impozit = 0.19;
	
	
	private int id;
	private String nume;
	private int anul_nasterii;
	private double salariu_brut;
	private String pozitie;
	
	public Angajat(int id, String nume, int anul_nasterii, String pozitie,  double salariu_brut) {
//		super();
		this.id = id;
		this.nume = nume;
		this.anul_nasterii = anul_nasterii;
		this.pozitie = pozitie;	
		this.salariu_brut = salariu_brut;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getSalariuNet(){
		
		return salariu_brut* (1-impozit);
	}
	
	public void afisare() {
		System.out.println("Id:" + id);
		System.out.println("Nume si prenume: " + nume);
		System.out.println("Anul nasterii: " + anul_nasterii);
		System.out.println("Pozitie: " + pozitie);
		System.out.println("Salariu brut: " + salariu_brut);
		System.out.println("Salariu net:  " + getSalariuNet());
		
		
		
	}

	@Override
	public String toString() {
		return   id + ","  + nume + " ," + anul_nasterii + "," +
				+ salariu_brut + "," + pozitie ;
	}
	
	
	
	
	
}
