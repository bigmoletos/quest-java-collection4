import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author franck Desmedt github/bigmoletos
 *
 */
public abstract class Thanos implements Comparator<Thanos> {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Thanos
	 * @version 1.0
	 * @date jeudi 26 sept. 2019
	 * @see
	 *
	 **/
	static Comparator<Hero> comparator = new Comparator<Hero>() {

		@Override
		public int compare(Hero origin, Hero compare) {
			// TODO Auto-generated method stub
			return origin.getName().compareTo(compare.getName());
		}
	};

	public static void main(String[] args) {
//		Construire un TreeMap nommé party, avec en clé User et valeur Flower
//		Ajouter dans party les couples clé/valeur suivants :
//
//		Hulk, Thor et Scarlet Witch ont une Rose
//		Vision a une Tulip
//		Captain America a une Lily
//		Doctor Strange et Black Widow ont une Violet
//		En une seule ligne, afficher si party contient l'instance begonia
//
//		Parcourir le tableau associatif par ordre alphabétique de nom de héros, 
//		et afficher, pour chacun d'entre eux, sa fleur attribuée.
		Hero hulk = new Hero("Hulk", 49);
		Hero blackWidow = new Hero("Black Widow", 34);
		Hero captainAmerica = new Hero("Captain America", 100);
		Hero thor = new Hero("Thor", 1501);
		Hero vision = new Hero("Vision", 3);
		Hero scarletWitch = new Hero("Scarlet Witch", 29);
		Hero doctorStrange = new Hero("Doctor Strange", 42);

		Flower lily = new Flower("Lily");
		Flower tulip = new Flower("Tulip");
		Flower begonia = new Flower("Begonia");
		Flower violet = new Flower("Violet");
		Flower rose = new Flower("Rose");

		// TODO 1 : Create a TreeMap where :
		// Hulk, Thor and Scarlet Witch have a Rose
		// Vision has a Tulip
		// Captain America has a Lily
		// Doctor Strange and Black Widow have a Violet
		Map<Hero, Flower> party = new TreeMap<>(comparator);
		party.put(hulk, rose);
		party.put(thor, rose);
		party.put(scarletWitch, rose);
		party.put(vision, tulip);
		party.put(captainAmerica, lily);
		party.put(doctorStrange, violet);
		party.put(blackWidow, violet);

		// TODO 2 : Print if `begonia` is contained in the TreeMap
		System.out.println("Is the value 'begonia' present? " + party.containsValue(begonia));
		System.out.println("Is the key 'hulk' present? " + party.containsKey(hulk));

		// TODO 3 : For each hero, alphabetically, print the corresponding flower
		for (Hero hero : party.keySet()) {
			Flower fleur = party.get(hero);
			System.out.println(hero.getName() + " have: " + fleur.getName());
		}
	}
}
