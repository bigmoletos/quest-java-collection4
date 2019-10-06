public class Hero implements Comparable<Hero> {

	private String name;
	private int age;

	public Hero(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Hero arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	// afin de ne pas afficher l'adresse de l'objet mais son contenu on redefinit la
	// methode toString
	@Override
	public String toString() {
		return this.name + " agé de " + this.age + " ans";
	}
}