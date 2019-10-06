public class Flower implements Comparable<Flower> {

	private String name;

	public Flower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Flower arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

//afin de ne pas afficher l'adresse de l'objet Flower@3fee733d 
//	mais son contenu on redefinit la methode toString
	@Override
	public String toString() {
		return this.name;
	}
}