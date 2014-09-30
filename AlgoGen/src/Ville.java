import java.util.*;


public class Ville {
	private int x;
	private int y;
	private String libelle;
	
	public Ville(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Ville() {
		Random rand = new Random();
		this.x = rand.nextInt()%100;
		this.y = rand.nextInt()%100;
		this.libelle = ""+rand.nextInt();
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getLibelle() {
		return libelle;
	}
	

}
