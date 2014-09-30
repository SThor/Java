import java.util.*;


public class Pays {
	private List<Ville> liste;
	
	public Pays(String libelle) {
		this.liste = new ArrayList<Ville>();
	}

	public List<Ville> getListe() {
		return liste;
	}

	public void setListe(List<Ville> liste) {
		this.liste = liste;
	}
	
	public void addVille(Ville v){
		this.liste.add(v);
	}
	
	public void genRand(int nbVille){
		for(int i=0; i<nbVille; i++){
			this.liste.add(new Ville());
		}
	}

}
